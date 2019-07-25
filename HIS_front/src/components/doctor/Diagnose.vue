<template>
  <el-col>
    <el-col :span="6">
      <!-- 左侧为选择患者栏 -->
      <SelectPatient></SelectPatient>
    </el-col>
    <el-col :span="18">
      <h1>姓名，病历号，年龄，性别</h1>
      <div class="grid-content bg-purple-light"></div>
      <el-form label-width="80px">
        <p>病史内容</p>
        <el-form-item label="主诉">
          <el-input></el-input>
        </el-form-item>
        <el-form-item label="现病史">
          <el-input></el-input>
        </el-form-item>
        <el-form-item label="现病治疗情况">
          <el-input></el-input>
        </el-form-item>
        <el-form-item label="既往史">
          <el-input></el-input>
        </el-form-item>
        <el-form-item label="过敏史">
          <el-input></el-input>
        </el-form-item>
        <el-form-item label="体格检查">
          <el-input></el-input>
        </el-form-item>
      </el-form>
    </el-col>
  </el-col>
</template>
<script>
import SelectPatient from './SelectPatient'
export default {
  components: { SelectPatient },
  data () {
    return {
      currentPatient: {
        name: '',
        caseNo: '',
        age: '',
        sex: ''
      },
      doc_id: 1
    }
  }
}
</script>
