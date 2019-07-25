<template>
  <div class="grid-content bg-purple">
    <p>选择患者</p>
    <CommonTable
      :data_list="toSeeTableData"
      :table-headers="TableHeaders"
      :tableName="toSeeTableName"
    ></CommonTable>
    <p></p>
    <CommonTable
      :data_list="seenTableData"
      :table-headers="TableHeaders"
      :tableName="seenTableName"
    ></CommonTable>
  </div>
</template>
<script>
import CommonTable from '../common/CommonTable'
export default {
  components: { CommonTable },
  data () {
    return {
      docId: 1,
      TableHeaders: ['病历号', '姓名', '年龄'],
      toSeeTableName: '未诊患者',
      toSeeTableData: [],
      seenTableName: '已诊患者',
      seenTableData: []
    }
  },
  methods: {
    simplestPatientProjection (registration) {
      let projection = []
      projection.push(
        registration.caseNo,
        registration.patientName,
        registration.age
      )
      return projection
    }
  },
  mounted () {
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
  }
}
</script>
