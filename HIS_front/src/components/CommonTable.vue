<template>
  <div>
    <h1>{{name}}</h1>
    <h2>表格在下面</h2>
    <el-table :data="data_list">
      <el-table-column :label="header" v-for="(header, key) in tableHeaders">
        <template scope="scope">{{data_list[scope.$index][key]}}</template>
      </el-table-column>
    </el-table>
    <h2>表格在上面</h2>
  </div>
</template>
<script>
export default {
  props: ['tableHeaders', 'name', 'data_list'],
  data () {
    return {
    }
  }
}
</script>
