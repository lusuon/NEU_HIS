<template>
  <el-col>
    <el-col :span="6">
      <!-- 左侧为选择患者栏 -->
      <el-row>
        <el-col :span="12">
          <p>选择患者</p>
        </el-col>
        <el-col :span="12">
          <el-button type="primary" icon="el-icon-refresh
" @click="getAllRelatedPatients"></el-button>
        </el-col>
      </el-row>
      <div>
        <h1>{{toSeeTableName}}</h1>
        <el-table
          highlight-current-row
          @current-change="handleCurrentChange"
          :data="toSeeTableData"
        >
          <el-table-column
            v-bind:key="header[0]"
            :label="header"
            v-for="(header, key) in TableHeaders"
          >
            <template scope="scope">{{toSeeTableData[scope.$index][key]}}</template>
          </el-table-column>
        </el-table>
      </div>

      <div>
        <h1>{{seenTableName}}</h1>
        <el-table highlight-current-row @current-change="handleCurrentChange" :data="seenTableData">
          <el-table-column
            v-bind:key="header[0]"
            :label="header"
            v-for="(header, key) in TableHeaders"
          >
            <template scope="scope">{{seenTableData[scope.$index][key]}}</template>
          </el-table-column>
        </el-table>
      </div>
    </el-col>
    <el-col :span="18">
      <h5>姓名:{{currentPatient.patientName}} 病历号:{{currentPatient.caseNo}} 年龄:{{currentPatient.ageWithType}}</h5>
      <Prescribe @callRefresh="getAllRelatedPatients"></Prescribe>
      <!--<Diagnose @callRefresh="getAllRelatedPatients"></Diagnose>-->
    </el-col>
  </el-col>
</template>

<script>
import Prescribe from './Prescribe.vue';
import Diagnose from './Diagnose';
export default {
  components: { Prescribe, Diagnose },
  data () {
    return {
      docId: this.$store.state.currentDocId,
      currentPatient: {},
      TableHeaders: ['病历号', '姓名', '年龄'],
      toSeeTableName: '未诊患者',
      toSeeTableData: [],
      seenTableName: '已诊患者',
      seenTableData: []
    }
  },
  watch: {
    getCurrentPatient (newVal, oldVal) {
      console.log('selecting patient:')
      console.log(newVal)
      this.currentPatient = newVal
    }
  },
  computed: {
    getCurrentPatient () {
      console.log('currentPatient in vuex change')
      return this.$store.state.currentPatient
    }
  },
  methods: {
    /**
     * 获取当前医生相关的患者
     */
    getAllRelatedPatients () {
      console.log('Loading current related patients!')
      this.$api
        .getToSeePatient(this.docId)
        .then(successResponse => {
          if (successResponse.data.code === 200) {
            let objects = successResponse.data.data
            this.toSeeTableData = objects.map(current =>
              this.simplestPatientProjection(current)
            )
          }
        })
        .catch(failResponse => {
          console.log(failResponse)
        })
      this.$api
        .getSeenPatient(this.docId)
        .then(successResponse => {
          if (successResponse.data.code === 200) {
            let objects = successResponse.data.data
            this.seenTableData = objects.map(current =>
              this.simplestPatientProjection(current)
            )
          }
        })
        .catch(failResponse => {
          console.log(failResponse)
        })
    },
    simplestPatientProjection (registration) {
      let projection = []
      projection.push(
        registration.caseNo,
        registration.patientName,
        registration.age,
        registration.ageType,
        registration.id,
        registration.inspectionStatus
      )
      return projection
    },
    handleCurrentChange (val) {
      this.currentPatient = val
      this.$store.commit('getCurrentPatient', {
        caseNo: val[0],
        patientName: val[1],
        ageWithType: val[2] + val[3],
        regId: val[4],
        status: val[5]
      })
      console.log('current selecting patient changed')
      console.log(val)
    }
  },
  mounted () {
    this.$store.commit('getCurrentPatient', {})
    this.getAllRelatedPatients()
  }
}
</script>

<style scoped>
</style>
