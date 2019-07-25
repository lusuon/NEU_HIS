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
      <CommonTable :data_list="tableData" :table-headers="tableHeaders" :tableName="tableName">表格</CommonTable>
    </el-col>
  </el-row>
</template>

<script>
import CommonTable from '../common/CommonTable';
export default {
  components: { CommonTable },
  data () {
    return {
      tableHeaders: [
        '病历号',
        '姓名',
        '身份证号',
        '挂号日期',
        '午别',
        '看诊科室',
        '看诊状态',
        '操作'
      ],
      tableName: '挂号信息表',
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
    getNewestPatientInfo (objects) {
      let object = objects[objects.length - 1]
      this.currentPatient.name = object.patientName
      this.currentPatient.pid = object.personalId
      this.currentPatient.address = object.address
    },
    projection (registration) {
      console.log('!')
      console.log(registration)
      let projection = []
      projection.push(
        registration.caseNo,
        registration.patientName,
        registration.personalId,
        registration.regTime,
        registration.noon,
        registration.deptId,
        registration.inspectionStatus
      )
      return projection
    },
    onSubmit () {
      console.log('submit!')
      this.$api
        .getAllPatientInfo(this.form.caseNo)
        .then(successResponse => {
          if (successResponse.data.code === 200) {
            console.log(successResponse.data.data)
            let objects = successResponse.data.data
            this.getNewestPatientInfo(objects)
            this.tableData = objects.map(current => this.projection(current))
          }
        })
        .catch(failResponse => {
          console.log(failResponse)
        })
      console.log('submit!')
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
