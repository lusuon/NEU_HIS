<template>
  <div>
    <p>当前处方</p>
    <p>处方金额统计</p>
    <el-row>
      <el-col :span="8">
        <h1>{{templateTableName}}</h1>
        <el-table
          :data="templateTableData"
          stripe
          highlight-current-row
          @current-change="handleCurrentChange"
        >
          <el-table-column
            v-bind:key="key"
            :label="header"
            v-for="(header, key) in templateTableHeaders"
          >
            <template scope="scope">{{templateTableData[scope.$index][key]}}</template>
          </el-table-column>
        </el-table>
      </el-col>
      <el-col :span="16">
        <h1>{{templateDtlTableName}}</h1>
        <el-table :data="templateDtlTableData" stripe>
          <el-table-column
            v-bind:key="key"
            :label="header"
            v-for="(header, key) in templateDtlTableHeaders"
          >
            <template scope="scope">{{templateDtlTableData[scope.$index][key]}}</template>
          </el-table-column>
        </el-table>
        <el-row>
          <el-button>使用该模板</el-button>
        </el-row>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  methods: {
    handleCurrentChange (val) {
      this.currentSelectingTemplate = val
    }
  },
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
    getSelectingTemplateId () {
      console.log(this.currentSelectingTemplate)
      return this.currentSelectingTemplate
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
      templateDtlTableData: [],
      currentSelectingTemplate: []
    }
  }
}
</script>
