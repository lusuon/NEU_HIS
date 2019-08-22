<template>
  <div>
    <el-form ref="form" :model="form" label-width="80px">
      <el-row>
        <el-col :span="12">
          <el-card shadow="hover">
            <div slot="header" class="clearfix">
              <p align="left">
                <span>患者待退号记录查询</span>
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
            <el-row>
              <el-table :data="tableData" border style="width: 100%">
                <el-table-column prop="regTime" label="挂号日期"></el-table-column>
                <el-table-column prop="seeDate" label="看诊日期"></el-table-column>
                <el-table-column prop="noon" label="午别"></el-table-column>
                <el-table-column fixed="right" label="操作">
                  <template slot-scope="scope">
                    <el-button type="text" size="small" @click="handleClick(scope.row)">退号</el-button>
                  </template>
                </el-table-column>
              </el-table>
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
  </div>
</template>

<script>
// eslint-disable-next-line

import { Message } from 'element-ui';
export default {
  data () {
    return {
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
    updateTableData (objects) {
      this.tableData = objects.filter(
        current => current.inspectionStatus === 1
      )
    },
    handleClick (row) {
      this.$api
        .unreg(row.id)
        .then(successResponse => {
          if (successResponse.data.code === 200) {
            Message({ message: '退号成功', type: 'success' })
          }
        })
        .catch(failResponse => {
          console.log(failResponse)
          Message({ message: '退号失败', type: 'error' })
        })
      // 刷新
      this.$api
        .getAllPatientInfo(this.form.caseNo)
        .then(successResponse => {
          if (successResponse.data.code === 200) {
            console.log(successResponse.data.data)
            let objects = successResponse.data.data
            this.updateTableData(objects)
          }
        })
        .catch(failResponse => {
          console.log(failResponse)
        })
    },
    onSubmit () {
      console.log('search!')
      this.$api
        .getAllPatientInfo(this.form.caseNo)
        .then(successResponse => {
          if (successResponse.data.code === 200) {
            console.log(successResponse.data.data)
            let objects = successResponse.data.data
            this.currentPatient.name = objects[0].patientName
            this.currentPatient.pid = objects[0].personalId
            this.currentPatient.address = objects[0].address
            this.updateTableData(objects)
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
