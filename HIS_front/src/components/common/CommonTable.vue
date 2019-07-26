<template>
  <div>
    <h1>{{tableName}}</h1>
    <el-table
      ref="commonTable"
      highlight-current-row
      @current-change="handleCurrentChange"
      @selection-change="handleSelectionChange"
      :data="data_list"
    >
      <el-table-column v-if="selectable" type="selection" width="55"></el-table-column>
      <el-table-column v-bind:key="header[0]" :label="header" v-for="(header, key) in tableHeaders">
        <template scope="scope">{{data_list[scope.$index][key]}}</template>
      </el-table-column>
    </el-table>
  </div>
</template>
<script>
export default {
  props: ['tableHeaders', 'tableName', 'data_list', 'selectable'],
  data () {
    return {
      multipleSelection: [],
      currentRow: null
    }
  },
  methods: {
    setCurrent (row) {
      this.$refs.commonTable.setCurrentRow(row)
      console.log(this.currentRow)
    },
    handleCurrentChange (val) {
      this.currentRow = val
      console.log(this.currentRow)
      this.$store.commit('getCurrentTemplateId', this.currentRow[2])
    },
    handleSelectionChange (val) {
      this.multipleSelection = val
      console.log(this.multipleSelection)
    }
  }
}
</script>
