<template>
  <div>
    <el-form ref="form" :model="form" label-width="80px">
      <el-form-item label="病历号">
        <el-col :span="12">
          <el-input v-model="form.caseNo"></el-input>
        </el-col>
        <el-col :span="12">
          <el-button type="primary" @click="searchToReleaseByCaseNo">搜索</el-button>
        </el-col>
      </el-form-item>
    </el-form>
    <el-row>
      <div>
        <h1>{{tableName}}</h1>
        <el-table ref="table" :data="tableData" @selection-change="handleSelectionChange">
          <!-- 多选框 -->
          <el-table-column type="selection" width="55"></el-table-column>
          <!-- 表头 -->
          <el-table-column v-bind:key="key" :label="header" v-for="(header, key) in tableHeaders">
            <!-- 遍历结果数据 -->
            <template scope="scope">{{tableData[scope.$index][key]}}</template>
          </el-table-column>
        </el-table>
      </div>
    </el-row>
    <el-button type="primary" @click="releaseDrug">开药</el-button>
  </div>
</template>

<script>
export default {
  data () {
    return {
      form: {
        caseNo: ''
      },
      tableHeaders: [
        '药品名称',
        '单价',
        '数量',
        '处方名称',
        '开立医生',
        '开立时间'
      ],
      tableName: '已开立药品',
      tableData: [],
      multipleSelection: [],
      currentCaseNo: ''
    }
  },
  methods: {
    // 处理表格多选变更
    handleSelectionChange (val) {
      this.multipleSelection = val
      console.log(this.multipleSelection)
    },
    // 通过病历号查询待发药
    searchToReleaseByCaseNo () {
      this.$api
        .getToReleaseDrug(this.form.caseNo)
        .then(successResponse => {
          if (successResponse.data.code === 200) {
            console.log(successResponse.data.data)
            // 更新表格
            this.tableData = successResponse.data.data
          }
        })
        .catch(failResponse => {
          console.log(failResponse)
        })
    },
    // 更新药物发药状态
    releaseDrug () {
      // 取出处方id
      let selectedPrescriptionIds = this.multipleSelection.map(
        current => current[current.length - 1]
      )
      // 对所选明细所属处方id去重
      let distinctPrescriptionIds = [...new Set(selectedPrescriptionIds)]
      console.log(distinctPrescriptionIds)
      /**
      this.$api
        .releaseDrug(selectedDrugIds)
        .then(successResponse => {
          if (successResponse.data.code === 200) {
            console.log('selected drug id coomited.')
            console.log(successResponse.data.data)
          }
        })
        .catch(failResponse => {
          console.log(failResponse)
        })
       }**/
    }
  }
}
</script>

<style scoped>
</style>
