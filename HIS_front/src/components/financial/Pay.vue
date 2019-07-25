<template>
  <div>
    <el-row>
      <el-col :span="23">
        <div class="grid-content bg-purple-light"></div>
        <el-form ref="form" :model="form" label-width="80px">
          <p>患者信息查询</p>
          <el-form-item label="病历号">
            <el-input v-model="form.caseNo"></el-input>
          </el-form-item>
          <el-form-item>
            <el-button type="primary" @click="onSubmit">搜索</el-button>
          </el-form-item>
          <p>患者信息确认</p>
          <el-row :gutter="20">
            <el-col :span="8">姓名: {{currentPatient.name}}</el-col>
            <el-col :span="8">身份证号: {{currentPatient.pid}}</el-col>
            <el-col :span="8">家庭住址: {{currentPatient.address}}</el-col>
          </el-row>
        </el-form>
        <CommonTable
          :data_list="tableData"
          :table-headers="tableHeaders"
          :tableName="tableName"
          :selectable="true"
          ref="table"
        ></CommonTable>
      </el-col>
    </el-row>
    <el-row>
      <!-- dialogFormVisible = true-->
      <el-button type="primary" plain @click="sumPayment">结算</el-button>
      <el-dialog title="缴费结算" :visible.sync="dialogFormVisible">
        <el-form :model="form">
          <el-form-item>
            <el-col :span="12">患者姓名:{{this.currentPatient.name}}</el-col>
            <el-col :span="12">病历号:{{this.form.caseNo}}</el-col>
          </el-form-item>
          <el-form-item label="支付方式" :label-width="formLabelWidth">
            <el-select v-model="form.region" placeholder="请选择活动区域">
              <el-option label="区域一" value="shanghai"></el-option>
              <el-option label="区域二" value="beijing"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item label="应收金额" :label-width="formLabelWidth">
            <el-input v-model="dialogform.total" autocomplete="off"></el-input>
          </el-form-item>
          <el-form-item label="实收金额" :label-width="formLabelWidth">
            <el-input v-model="dialogform.receive" autocomplete="off"></el-input>
          </el-form-item>
          <el-form-item label="找零金额" :label-width="formLabelWidth">
            <el-input :value="calculateExchange" autocomplete="off"></el-input>
          </el-form-item>
        </el-form>
        <div slot="footer" class="dialog-footer">
          <el-button @click="dialogFormVisible = false">取 消</el-button>
          <el-button type="primary" @click="dialogFormVisible = false">确 定</el-button>
        </div>
      </el-dialog>
    </el-row>
  </div>
</template>

<script>
import CommonTable from '../common/CommonTable';
export default {
  components: { CommonTable },
  computed: {
    calculateExchange () {
      return this.dialogform.receive - this.dialogform.total
    }
  },
  data () {
    return {
      tableHeaders: ['项目名称', '单价', '数量', '开立时间'],
      tableName: '患者消费信息',
      tableData: [],
      form: {
        caseNo: '',
        name: '',
        pid: '',
        address: ''
      },
      dialogFormVisible: false,
      dialogform: {
        payMethod: '',
        total: '',
        receive: 0
      },
      formLabelWidth: '120px',
      currentPatient: {
        name: '',
        pid: '',
        address: ''
      }
    }
  },
  methods: {
    sumPayment () {
      this.dialogFormVisible = true
      this.dialogform.total = this.dtlTotal(
        this.$refs.table.multipleSelection
      ).reduce(function (prev, cur, index, arr) {
        return prev + cur
      })
    },
    // 对每行求和，返回明细金额
    dtlTotal (arr) {
      return arr.map(current => current[1] * current[2])
    },
    getNewestPatientInfo (object) {
      this.currentPatient.name = object.patientName
      this.currentPatient.pid = object.personalId
      this.currentPatient.address = object.address
    },
    onSubmit () {
      console.log('submit!')
      this.$api
        .getPatientInfo(this.form.caseNo)
        .then(successResponse => {
          if (successResponse.data.code === 200) {
            console.log(successResponse.data.data)
            this.getNewestPatientInfo(successResponse.data.data)
          }
        })
        .catch(failResponse => {
          console.log(failResponse)
        })
      this.$api
        .getToPay(this.form.caseNo)
        .then(successResponse => {
          if (successResponse.data.code === 200) {
            this.tableData = successResponse.data.data
          }
        })
        .catch(failResponse => {
          console.log(failResponse)
        })
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
