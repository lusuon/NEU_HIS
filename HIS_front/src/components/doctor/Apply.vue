<template>
  <el-col>
    <el-col :span="6">
      <!-- 左侧为选择患者栏 -->
      <SelectPatient></SelectPatient>
    </el-col>
    <el-col :span="18">
      <h1>姓名，病历号，年龄，性别</h1>
      <div class="grid-content bg-purple-light"></div>
      <p>门诊诊断</p>
      <GeneratePrescription></GeneratePrescription>
      <p>当前处方</p>
      <p>处方金额统计</p>
      <select-template></select-template>
    </el-col>
  </el-col>
</template>

<script>
import SelectPatient from './SelectPatient';
import SelectTemplate from './SelectTemplate';
import GeneratePrescription from './GeneratePrescription';
export default {
  components: { SelectPatient, SelectTemplate, GeneratePrescription },
  data () {
    return {
      currentPatient: {
        name: '',
        caseNo: '',
        age: '',
        sex: ''
      }
    }
  }
}
</script>

<style scoped>
</style>
