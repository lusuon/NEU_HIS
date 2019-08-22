<template>
  <div id="app">
    <el-container direction="vertical">
      <keep-alive>
        <el-header class="el-header">
          <headerBanner></headerBanner>
        </el-header>
      </keep-alive>
      <el-container>
        <keep-alive>
          <el-col v-if="isLogin" :span="3">
            <navmenu></navmenu>
          </el-col>
        </keep-alive>
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
    headerBanner: Header
  },
  computed: {
    isLogin: function () {
      console.log(this.$store.state.currentUser === '')
      return !(this.$store.state.currentUser === '')
    }
  }
}
</script>

<style>
body {
  margin: 0;
  padding: 0;
}
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
