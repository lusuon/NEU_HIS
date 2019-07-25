<template>
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
      ></CommonTable>
      <el-button type="primary" plain>结算</el-button>
    </el-col>
  </el-row>
</template>

<script>
import CommonTable from '../common/CommonTable';
export default {
  components: { CommonTable },
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
      currentPatient: {
        name: '',
        pid: '',
        address: ''
      }
    }
  },
  methods: {
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
