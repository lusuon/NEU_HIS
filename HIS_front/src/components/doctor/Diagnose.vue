<template>
  <div class="grid-content bg-purple-light">
    <el-form label-width="80px">
      <p>病史内容</p>
      <el-form-item label="主诉">
        <el-input
          type="textarea"
          v-model="diagnoseForm.sym"
          :disabled="this.$store.state.currentPatient.status === 2"
        ></el-input>
      </el-form-item>
      <el-form-item label="现病史">
        <el-input
          type="textarea"
          v-model="diagnoseForm.curMedHis"
          :disabled="this.$store.state.currentPatient.status === 2"
        ></el-input>
      </el-form-item>
      <el-form-item label="现病治疗情况">
        <el-input
          type="textarea"
          v-model="diagnoseForm.curDisTre"
          :disabled="this.$store.state.currentPatient.status === 2"
        ></el-input>
      </el-form-item>
      <el-form-item label="既往史">
        <el-input
          type="textarea"
          v-model="diagnoseForm.medHis"
          :disabled="this.$store.state.currentPatient.status === 2"
        ></el-input>
      </el-form-item>
      <el-form-item label="过敏史">
        <el-input
          type="textarea"
          v-model="diagnoseForm.inAllergy"
          :disabled="this.$store.state.currentPatient.status === 2"
        ></el-input>
      </el-form-item>
      <el-form-item label="体格检查">
        <el-input
          type="textarea"
          v-model="diagnoseForm.bodIns"
          :disabled="this.$store.state.currentPatient.status === 2"
        ></el-input>
      </el-form-item>
      <el-form-item>
        <el-button
          type="primary"
          @click="diagnose"
          :disabled="this.$store.state.currentPatient.status === 2"
        >提交</el-button>
      </el-form-item>
    </el-form>
    <el-card>评估诊断</el-card>
  </div>
</template>
<script>
import { Message } from 'element-ui';
export default {
  data () {
    return {
      diagnoseForm: {
        regId: '',
        sym: '',
        curMedHis: '',
        curDisTre: '',
        medHis: '',
        inAllergy: '',
        bodIns: '',
        sug: '',
        att: '',
        insRes: '',
        diaRes: '',
        adv: ''
      }
    }
  },
  methods: {
    diagnose () {
      if (this.diagnoseForm.regId === '') {
        Message({
          message: '请先选择患者',
          duration: 1000
        })
      } else {
        this.$api
          .diag(this.diagnoseForm)
          .then(successResponse => {
            if (successResponse.data.code === 200) {
              console.log(successResponse.data.data)
              Message({
                message: '成功提交',
                duration: 1000
              })
            }
          })
          .catch(failResponse => {
            console.log(failResponse)
          })
      }
      console.log('start calling')
      this.$emit('callRefresh')
      console.log('called')
      // 清空状态
      this.$store.commit('getCurrentPatient', {})
    }
  },
  watch: {
    getCurrentPatientId (newVal, oldVal) {
      this.diagnoseForm.regId = newVal
      if (this.$store.state.currentPatient.status === 2) {
        this.$api
          .getDiag(newVal)
          .then(successResponse => {
            if (successResponse.data.code === 200) {
              console.log(successResponse.data.data)
              let result = successResponse.data.data
              this.diagnoseForm.regId = result.regId
              this.diagnoseForm.sym = result.symptom
              this.diagnoseForm.curMedHis = result.currentMediHistory
              this.diagnoseForm.curDisTre = result.currentDiseaseTreatment
              this.diagnoseForm.medHis = result.mediHistory
              this.diagnoseForm.inAllergy = result.allergy
              this.diagnoseForm.bodIns = result.bodyInspection
              this.diagnoseForm.sug = result.suggestion
              this.diagnoseForm.att = result.attention
              this.diagnoseForm.insRes = result.inspectionResult
              this.diagnoseForm.diaRes = result.diagnoseResult
              this.diagnoseForm.adv = result.advise
            }
          })
          .catch(failResponse => {
            console.log(failResponse)
          })
      }
    }
  },
  computed: {
    getCurrentPatientId () {
      return this.$store.state.currentPatient.regId
    },
    getCurrentUserId () {
      return this.$store.state.currentUserId
    }
  }
}
</script>
