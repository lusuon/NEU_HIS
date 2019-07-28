<template>
  <el-form ref="form" :model="form" label-width="80px">
    <p>患者信息查询</p>
    <el-form-item label="病历号">
      <el-input v-model="form.caseNo"></el-input>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="findPatientByCaseNo">搜索</el-button>
    </el-form-item>
    <p>患者信息确认</p>
    <el-row :gutter="20">
      <el-col :span="8">姓名: {{currentPatient.patientName}}</el-col>
      <el-col :span="8">身份证号: {{currentPatient.personalId}}</el-col>
      <el-col :span="8">家庭住址: {{currentPatient.address}}</el-col>
    </el-row>
  </el-form>
</template>
<script>
export default {
  data () {
    return {
      form: {
        caseNo: ''
      },
      currentPatient: {
        patientName: '',
        personalId: '',
        address: ''
      }
    }
  },
  mounted: function () {
    // 清空vuex状态
    this.$store.commit('getCurrentPatient', {})
    this.$store.commit('getCurrentCaseNo', '')
  },
  watch: {
    getCurrentPatient (newVal, oldVal) {
      console.log('detect currentCaseNo change. The new one is: ')
      console.log(newVal)
      this.currentPatient = newVal
    }
  },
  computed: {
    getCurrentPatient () {
      return this.$store.state.currentPatient
    }
  },
  methods: {
    findPatientByCaseNo () {
      console.log('submit!')
      let caseNo = this.form.caseNo
      this.$api
        .getPatientInfo(caseNo)
        .then(successResponse => {
          if (successResponse.data.code === 200) {
            console.log(successResponse.data.data)
            let currentPatient = successResponse.data.data
            // 更新vuex的state
            this.$store.commit('getCurrentPatient', currentPatient)
            this.$store.commit('getCurrentCaseNo', caseNo)
            // this.getNewestPatientInfo(successResponse.data.data)
          }
        })
        .catch(failResponse => {
          console.log(failResponse)
        })
    }
  }
}
</script>
