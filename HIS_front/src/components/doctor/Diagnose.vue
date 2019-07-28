<template>
  <el-col>
    <el-col :span="6">
      <!-- 左侧为选择患者栏 -->
      <SelectPatient></SelectPatient>
    </el-col>
    <el-col :span="18">
      <h5>姓名:{{currentPatient.name}} 病历号:{{currentPatient.caseNo}} 年龄: {{currentPatient.age}} 性别: {{currentPatient.sex}}</h5>
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
        <el-form-item></el-form-item>
      </el-form>
      <el-card>评估诊断</el-card>
    </el-col>
  </el-col>
</template>
<script>
import SelectPatient from './SelectPatient';
export default {
  components: { SelectPatient },
  watch: {
    getCurrentRow (newVal, oldVal) {
      console.log('lisetn')
      console.log(newVal)
      this.currentPatient.caseNo = newVal[0]
      this.currentPatient.name = newVal[1]
      this.currentPatient.age = newVal[2]

      /*
      this.$api
        .getTemplateDtl('medi', newVal)
        .then(resp => {
          if (resp.data.code === 200) {
            let objects = resp.data.data
            this.templateDtlTableData = objects
          }
        })
        .catch(failResponse => {
          console.log(failResponse)
        })
        */
    }
  },
  computed: {
    getCurrentRow () {
      return this.$store.state.currentRow
    }
  },
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
