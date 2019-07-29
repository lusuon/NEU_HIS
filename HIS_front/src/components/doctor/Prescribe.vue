<template>
  <div>
    <p>当前处方</p>
    <p>处方金额统计</p>
    <el-row>
      <el-col :span="8">
        <CommonTable
          ref="templateTable"
          :data_list="templateTableData"
          :table-headers="templateTableHeaders"
          :table-name="templateTableName"
        ></CommonTable>
      </el-col>
      <el-col :span="16">
        <CommonTable
          :data_list="templateDtlTableData"
          :table-headers="templateDtlTableHeaders"
          :table-name="templateDtlTableName"
        ></CommonTable>
        <el-row>
          <el-button>使用该模板</el-button>
        </el-row>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  name: 'SelectTemplate',
  watch: {
    getSelectingTemplateId (newVal, oldVal) {
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
    }
  },
  computed: {
    getSelectingRow () {
      return this.$store.state.currentRow()
    }
  },
  mounted () {
    // console.log('tamplates for currentDocId')
    // console.log(this.$store.state.currentDocId)
    this.doc_id = this.$store.state.currentDocId
    this.$api
      .usableTemplateList(this.doc_id)
      .then(successResponse => {
        if (successResponse.data.code === 200) {
          let objects = successResponse.data.data
          this.templateTableData = objects
        }
      })
      .catch(failResponse => {
        console.log(failResponse)
      })
  },
  data () {
    return {
      doc_id: '',
      templateTableHeaders: ['模板名称', '范围'],
      templateDtlTableHeaders: [
        '药品名称',
        '规格',
        '单位',
        '用法',
        '用量',
        '频次'
      ],
      templateTableName: '可用模板',
      templateDtlTableName: '所选模板明细',
      templateTableData: [],
      templateDtlTableData: []
    }
  }
}
</script>
