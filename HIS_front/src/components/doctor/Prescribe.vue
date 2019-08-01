<template>
  <div>
    <el-row>
      <el-col :span="8">
        <h1>当前处方</h1>
        todo：增删方；开立（提交）；作废（清空）
        <el-table
          :data="usingTemplates"
          stripe
        >
          <el-table-column
            prop="name"
            label="模板名称"
            width="180">
          </el-table-column>
          <el-table-column
            prop="range"
            label="状态"
            width="180">
          </el-table-column>
        </el-table>
      </el-col>
      <el-col :span="16">
        <h1>处方金额统计：{{totalPrice}}</h1>
        todo:增删药(级联)
        <el-table :data="templateDtlTableData" stripe>
          <el-table-column
            v-bind:key="header[0]"
            :label="header"
            v-for="(header, key) in templateDtlTableHeaders"
          >
            <template scope="scope">{{templateDtlTableData[scope.$index][key]}}</template>
          </el-table-column>
        </el-table>
      </el-col>
    </el-row>
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
            prop="name"
            label="模板名称"
            width="180">
          </el-table-column>
          <el-table-column
            prop="range"
            label="使用范围"
            width="180">
          </el-table-column>
        </el-table>
      </el-col>
      <el-col :span="16">
        <h1>{{templateDtlTableName}}</h1>
        <el-table :data="templateDtlTableData" stripe>
          <el-table-column
            v-bind:key="header[0]"
            :label="header"
            v-for="(header, key) in templateDtlTableHeaders"
          >
            <template scope="scope">{{templateDtlTableData[scope.$index][key]}}</template>
          </el-table-column>
        </el-table>
        <el-row>
          <el-button @click="useTemplate" type="primary">使用该模板</el-button>
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
      console.log(this.currentSelectingTemplate)
    },
    useTemplate () {
      this.usingTemplates.push(this.currentSelectingTemplate)
    }
  },
  computed: {
    getSelectingTemplateId () {
      return this.currentSelectingTemplate.id
    },
    totalPrice () {
      return 0
    },
    getUsingTemplates () {
      return this.usingTemplates
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
    },
    getUsingTemplates (newVal, oldVal) {
      // 允许级联删除

    }
  },
  mounted () {
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
      usingTemplates: [],
      doc_id: '',
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
      currentSelectingTemplate: {
        name: '',
        id: '',
        range: ''
      }
    }
  }
}
</script>
