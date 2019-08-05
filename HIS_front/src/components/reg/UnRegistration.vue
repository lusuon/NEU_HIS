<template>
  <el-form ref="form" :model="form" label-width="80px">
    <el-row>
      <el-col :span="12">
        <el-card shadow="hover">
          <div slot="header" class="clearfix">
            <p align="left">
              <span>患者信息查询</span>
            </p>
          </div>
          <el-row>
            <el-col :span="12">
              <el-form-item label="病历号">
                <el-input v-model="form.caseNo"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item>
                <el-button type="primary" @click="onSubmit">搜索</el-button>
              </el-form-item>
            </el-col>
          </el-row>
        </el-card>
      </el-col>
      <el-col :span="12">
        <el-card shadow="hover">
          <div slot="header" class="clearfix">
            <p align="left">
              <span>患者信息确认</span>
            </p>
          </div>
          <el-form-item label="姓名">
            <el-input :value="this.currentPatient.name" :disabled="true"></el-input>
          </el-form-item>
          <el-form-item label="身份证号">
            <el-input :value="this.currentPatient.pid" :disabled="true"></el-input>
          </el-form-item>
          <el-form-item label="家庭住址">
            <el-input :value="this.currentPatient.address" :disabled="true"></el-input>
          </el-form-item>
        </el-card>
      </el-col>
    </el-row>
  </el-form>
  <!--
      <CommonTable
        :data_list="tableData"
        :table-headers="tableHeaders"
        :tableName="tableName"
        :need-operate="true"
      >表格</CommonTable>
  -->
</template>

<script>
// eslint-disable-next-line

import Message from 'element-ui';
export default {
  data () {
    return {
      tableHeaders: [
        '病历号',
        '姓名',
        '身份证号',
        '挂号日期',
        '午别',
        '看诊科室',
        '看诊状态'
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
  computed: {
    getCurrentOperate () {
      return this.$store.state.currentOperate
    }
  },
  watch: {
    // 检测到点击导致操作对象改变
    getCurrentOperate (newVal, oldVal) {
      console.log('detect currentOperate change. The id is: ')
      console.log(oldVal)
      console.log(newVal)
      this.$api
        .unreg(newVal[newVal.length - 1])
        .then(successResponse => {
          if (successResponse.data.code === 200) {
            console.log(successResponse.data.data)
            Message(successResponse.data.data)
          }
        })
        .catch(failResponse => {
          console.log(failResponse)
        })
      // 刷新
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
        registration.inspectionStatus,
        registration.id
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
