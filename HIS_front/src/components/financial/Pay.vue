<template>
  <div>
    <el-row>
      <el-col>
        <!-- 通过病历号选定当前患者 -->
        <SelectPatient></SelectPatient>
        <!-- 患者消费信息表 -->
        <div>
          <h1>{{tableName}}</h1>
          <el-table
            ref="table"
            border
            highlight-current-row
            @selection-change="handleSelectionChange"
            :data="tableData"
          >
            <el-table-column type="selection" width="55"></el-table-column>
            <el-table-column v-bind:key="key" :label="header" v-for="(header, key) in tableHeaders">
              <template scope="scope">{{tableData[scope.$index][key]}}</template>
            </el-table-column>
          </el-table>
        </div>
      </el-col>
    </el-row>

    <!-- 结算及其弹出框 -->
    <el-row>
      <!-- dialogFormVisible = true-->
      <el-button type="primary" plain @click="calculateToPay">结算</el-button>
      <el-dialog title="缴费结算" :visible.sync="dialogFormVisible">
        <el-form :model="dialogForm">
          <el-row>
            <el-col :span="12">
              <el-form-item>
                <el-col :span="12">患者姓名:{{this.$store.state.currentPatient.patientName}}</el-col>
                <el-col :span="12">病历号:{{this.$store.state.currentPatient.caseNo}}</el-col>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="收费方式">
                <el-select v-model="dialogForm.payMethod" placeholder="请选择收费方式">
                  <el-option
                    v-bind:key="item.id"
                    v-for="item in selecatablePayMethod"
                    :label="item.constantName"
                    :value="item.id"
                  ></el-option>
                </el-select>
              </el-form-item>
            </el-col>
          </el-row>
          <el-form-item label="应收金额" :label-width="formLabelWidth">
            <el-input autocomplete="off" :disabled="true" :value="calculateTotal"></el-input>
          </el-form-item>
          <el-form-item label="实收金额" :label-width="formLabelWidth">
            <el-input v-model="dialogForm.receive" autocomplete="off"></el-input>
          </el-form-item>
          <el-form-item label="找零金额" :label-width="formLabelWidth">
            <el-input :value="calculateExchange" autocomplete="off" :disabled="true"></el-input>
          </el-form-item>
        </el-form>
        <div slot="footer" class="dialog-footer">
          <el-button @click="dialogFormVisible = false">取 消</el-button>
          <el-button type="primary" @click="pay">确 定</el-button>
        </div>
      </el-dialog>
    </el-row>
  </div>
</template>

<script>
import SelectPatient from '../common/SelectPatient';
export default {
  components: { SelectPatient },
  mounted: function () {
    // 获取支付方法
    this.$api
      .getBasicInfo()
      .then(successResponse => {
        if (successResponse.data.code === 200) {
          console.log(successResponse.data.data)
          this.basicInfo = successResponse.data.data
          this.selecatablePayMethod = this.basicInfo.pay
          console.log(this.basicInfo.pay)
        }
      })
      .catch(failResponse => {
        console.log(failResponse)
      })
  },
  watch: {
    multipleSelection: function (newVal, oldVal) {
      this.toPayPid = Array.from(
        new Set(
          this.multipleSelection.map(current => {
            return current[0]
          })
        )
      )
    },
    getCurrentCaseNo (newVal, oldVal) {
      console.log('detect currentCaseNo change. The new one is: ')
      console.log(newVal)
      this.$api
        .getToPay(newVal)
        .then(successResponse => {
          if (successResponse.data.code === 200) {
            console.log(successResponse.data.data)
            let objects = successResponse.data.data
            this.tableData = objects
          }
        })
        .catch(failResponse => {
          console.log(failResponse)
        })
    }
  },
  computed: {
    calculateTotal () {
      let total = 0
      if (this.multipleSelection.length !== 0) {
        console.log(this.multipleSelection)
        total = this.dtlTotal(this.multipleSelection).reduce(function (
          prev,
          cur,
          index,
          arr
        ) {
          return prev + cur
        })
      }
      this.dialogForm.total = total
      // 计算应支付
      return total
    },
    calculateExchange () {
      return (this.dialogForm.receive - this.dialogForm.total).toFixed(2)
    },
    getCurrentCaseNo () {
      return this.$store.state.currentCaseNo
    }
  },
  data () {
    return {
      // 可选择付费方式
      selecatablePayMethod: [],
      toPayPid: [],
      // 表格字段
      tableHeaders: ['处方id', '项目名称', '单价', '数量', '开立时间'],
      tableName: '患者消费信息',
      tableData: [],
      // 存储表格内选择行
      multipleSelection: [],
      // 决定窗口弹出
      dialogFormVisible: false,
      // 对话窗字段
      dialogForm: {
        payMethod: '',
        total: '',
        receive: 0
      },
      formLabelWidth: '120px'
    }
  },
  methods: {
    pay () {
      // 遍历待支付处方
      this.toPayPid.map(current =>
        this.$api.pay({
          pid: current, // 处方id
          oid: this.$store.state.currentUserId, // 操作员id
          ityp: 1, // 发票类型
          ptyp: this.dialogForm.payMethod // 付费方式
        })
      )
    },
    // 处理表格多选变更
    handleSelectionChange (val) {
      this.multipleSelection = val
      console.log(this.multipleSelection)
    },
    // 进行结算
    calculateToPay () {
      // 显示对话框
      this.dialogFormVisible = true
    },
    // 以下为工具方法，无关业务逻辑
    // 对每行求和，返回明细金额
    dtlTotal (arr) {
      return arr.map(current => current[2] * current[3])
    }
  }
}
</script>

<style>
.el-col {
  border-radius: 4px;
}
.bg-purple-dark {
  background: #99a9bf;
}
.bg-purple {
  background: #d3dce6;
}
.bg-purple-light {
  background: #e5e9f2;
}
.grid-content {
  border-radius: 4px;
  min-height: 36px;
}
</style>
