<template>
  <el-menu
    default-active="2"
    class="el-menu-vertical-demo"
    @open="handleOpen"
    @close="handleClose"
    unique-opened
    router
  >
    <el-menu-item v-if="getRole() == 3" index="diag">诊断</el-menu-item>
    <el-menu-item v-if="getRole() == 3" index="prescribe">开立处方</el-menu-item>

    <el-menu-item index="reg" v-if="getRole() == 2">挂号</el-menu-item>
    <el-menu-item index="unreg" v-if="getRole() == 2">退号</el-menu-item>
    <el-menu-item index="pay" v-if="getRole() == 2">收费</el-menu-item>

    <el-menu-item v-if="getRole() == 1" index="releaseDrug">发药</el-menu-item>
  </el-menu>
</template>

<script>
export default {
  methods: {
    getRole () {
      return this.$store.state.currentUser.userType
    },
    getUsername () {
      return this.$store.state.currentUser.username
    },
    handleOpen (key, keyPath) {
      console.log(key, keyPath)
    },
    handleClose (key, keyPath) {
      console.log(key, keyPath)
    }
  }
}
</script>
