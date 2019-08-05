<template>
  <div>
    <el-col :span="6">
      <doctorMainPanel />
    </el-col>
    <el-col :span="18">
      <el-card class="grid-content bg-purple-light" shadow="hover">
        <el-form label-width="80px">
          <el-button-group>
            <el-button
              type="primary"
              @click="tempSave"
              :disabled="this.$store.state.currentPatient.status === 2"
            >暂存</el-button>
            <el-button
              type="primary"
              @click="diagnose"
              :disabled="this.$store.state.currentPatient.status === 2"
            >提交</el-button>
            <el-button
              type="primary"
              @click="clearAllDiagnose"
              :disabled="this.$store.state.currentPatient.status === 2"
            >清空所有</el-button>
          </el-button-group>
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
        </el-form>
      </el-card>
      <el-card shadow="hover" class="diagnosis">
        <div slot="header" class="clearfix">
          <span>评估诊断</span>
          <el-form :inline="true" :model="formInline" class="demo-form-inline">
            <el-form-item label="疾病">
              <el-select v-model="formInline.disease" placeholder="疾病">
                <el-option
                  v-bind:key="item.id"
                  v-for="item in selectableDisease"
                  :label="item.deseaseName"
                  :value="item.id"
                ></el-option>
              </el-select>
            </el-form-item>
            <el-form-item>
              <el-button
                type="primary"
                @click="addRow"
                :disabled="this.$store.state.currentPatient.status === 2"
              >增加</el-button>
            </el-form-item>
          </el-form>
        </div>
        <el-table highlight-current-row :data="diagnosisTableData">
          <el-table-column
            v-bind:key="header[0]"
            :label="header"
            v-for="(header, key) in diagnosisTableHeaders"
          >
            <template scope="scope">{{diagnosisTableData[scope.$index][key]}}</template>
          </el-table-column>
          <el-table-column fixed="right" label="操作" width="120">
            <template slot-scope="scope">
              <el-button
                @click.native.prevent="deleteRow(scope.$index, diagnosisTableData)"
                type="text"
                size="small"
              >移除</el-button>
            </template>
          </el-table-column>
        </el-table>
      </el-card>
    </el-col>
  </div>
</template>
<script>
import { Message } from 'element-ui';
import DoctorMainPanel from './DoctorMainPanel';
export default {
  components: {
    doctorMainPanel: DoctorMainPanel
  },
  data () {
    return {
      selectableDisease: [],
      formInline: {
        disease: []
      },
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
      },
      diagnosisTableHeaders: ['ICD编码', '名称', '发病时间'],
      diagnosisTableData: [],
      currentDiagnosis: []
    }
  },
  mounted () {
    console.log('获取疾病信息')
    // 获取诊断所需疾病信息
    this.$api
      .getAllDisease()
      .then(successResponse => {
        if (successResponse.data.code === 200) {
          this.selectableDisease = successResponse.data.data
          console.log('selectable disease:')
          console.log(this.selectableDisease)
        }
      })
      .catch(failResponse => {
        console.log(failResponse)
      })
  },
  methods: {
    addRow () {
      let time = new Date()
      let toAddDisease = {}
      this.$api
        .getDiseaseInfo(this.formInline.disease)
        .then(successResponse => {
          if (successResponse.data.code === 200) {
            toAddDisease = successResponse.data.data
            console.log('toAdd')
            console.log(toAddDisease)
            console.log('toAddDisease')
            console.log(toAddDisease)
            this.diagnosisTableData.push([
              toAddDisease.icd,
              toAddDisease.deseaseName,
              time.toString(),
              this.formInline.disease,
              this.$store.state.currentPatient.caseNo,
              this.$store.state.currentPatient.regId,
              1,
              1
            ])
          }
        })
        .catch(failResponse => {
          console.log(failResponse)
        })
    },
    deleteRow (index, rows) {
      rows.splice(index, 1)
    },
    tempSave () {
      Message({
        message: '暂存成功',
        duration: 1000
      })
    },
    clearAllDiagnose () {
      this.diagnoseForm = {
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
    },
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
                message: '成功提交病历',
                duration: 1000
              })
            }
          })
          .catch(failResponse => {
            console.log(failResponse)
          })
        // 添加疾病明细
        console.log('mapping')
        this.$api
          .postDiagnosis(
            this.diagnosisTableData.map(arr => {
              return {
                icd: arr[0],
                name: arr[1],
                time: arr[2],
                diseaseId: arr[3],
                caseId: arr[4],
                regId: arr[5],
                diagnosisType: arr[6],
                diagnosisClass: arr[7]
              }
            })
          )
          .then(successResponse => {
            if (successResponse.data.code === 200) {
              console.log(successResponse.data.data)
              Message({
                message: '成功提交疾病明细',
                duration: 1000
              })
            }
          })
          .catch(failResponse => {
            console.log(failResponse)
          })
      }
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
              let patientCase = successResponse.data.data.case
              this.diagnoseForm.regId = patientCase.regId
              this.diagnoseForm.sym = patientCase.symptom
              this.diagnoseForm.curMedHis = patientCase.currentMediHistory
              this.diagnoseForm.curDisTre = patientCase.currentDiseaseTreatment
              this.diagnoseForm.medHis = patientCase.mediHistory
              this.diagnoseForm.inAllergy = patientCase.allergy
              this.diagnoseForm.bodIns = patientCase.bodyInspection
              this.diagnoseForm.sug = patientCase.suggestion
              this.diagnoseForm.att = patientCase.attention
              this.diagnoseForm.insRes = patientCase.inspectionResult
              this.diagnoseForm.diaRes = patientCase.diagnoseResult
              this.diagnoseForm.adv = patientCase.advise
              let patientDiagnosis = successResponse.data.data.diagnosis
              this.diagnosisTableData = patientDiagnosis
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
