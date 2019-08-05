<template>
  <div id="app">
    <el-container>
      <el-header class="el-header">
        <header></header>
      </el-header>
      <el-container>
        <el-col :span="3">
          <navmenu></navmenu>
        </el-col>
        <el-col :span="21">
          <router-view />
        </el-col>
      </el-container>
    </el-container>
  </div>
</template>
<script>
import NavMenu from '@/components/common/NavMenu';
import Header from '@/components/common/Header';
export default {
  name: 'App',
  components: {
    navmenu: NavMenu,
    header: Header
  }
}
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  background-color: #ffffff;
}
.el-header {
  background-color: #409eff;
  color: #fff;
  line-height: 60px;
}
</style>
