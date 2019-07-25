<template>
  <div>
    <el-form ref="form" :model="form" label-width="80px">
      <el-form-item label="病历号">
        <el-col :span="12"><el-input v-model="form.caseNo"></el-input></el-col>
        <el-col :span="12"><el-button type="primary" @click="onSubmit">搜索</el-button></el-col>
      </el-form-item>
    </el-form>
    <el-row>

      <CommonTable
        :data_list="tableData"
        :table-headers="tableHeaders"
        :tableName="tableName"
        :selectable="true"
        ref="table"
      ></CommonTable>
    </el-row>
    <el-button type="primary" @click="release">开药</el-button>
  </div>
</template>

<script>
import CommonTable from '../common/CommonTable'
export default {
  components: { CommonTable },
  methods: {
    onSubmit () {
      console.log('submit!')
      this.$api
        .getToReleaseDrug(this.form.caseNo)
        .then(successResponse => {
          if (successResponse.data.code === 200) {
            console.log(successResponse.data.data)
            this.tableData = successResponse.data.data
          }
        })
        .catch(failResponse => {
          console.log(failResponse)
        })
    },
    release () {
      let selectedPrescriptionIds = this.$refs.table.multipleSelection.map(current => current[current.length - 1])
      let distinctPrescriptionIds = [...new Set(selectedPrescriptionIds)] // 去重
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
  },
  data () {
    return {
      form: {
        caseNo: ''
      },
      tableHeaders: [
        '药品名称',
        '单价',
        '数量',
        '开立医生',
        '处方名称',
        '开立时间'
      ],
      tableName: '已开立药品',
      tableData: []
    }
  }
}
</script>

<style scoped>

</style>
