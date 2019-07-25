<template>
  <div>
    <h1>{{tableName}}</h1>
    <el-table :data="data_list" @selection-change="handleSelectionChange">
      >
      <el-table-column v-if="selectable" type="selection" width="55"></el-table-column>
      <el-table-column :label="header" v-for="(header, key) in tableHeaders">
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
      multipleSelection: []
    }
  },
  methods: {
    handleSelectionChange (val) {
      this.multipleSelection = val
      console.log(this.multipleSelection)
    }
  }
}
</script>
