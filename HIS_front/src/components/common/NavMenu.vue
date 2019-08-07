<template>
  <el-menu
    default-active="2"
    class="el-menu-vertical-demo"
    @open="handleOpen"
    @close="handleClose"
    unique-opened
    router
  >
    <el-submenu index="1">
      <template slot="title">
        <i class="el-icon-document"></i>
        <span>医生</span>
      </template>
      <el-menu-item-group class="over-hide">
        <el-menu-item index="diag">诊断</el-menu-item>
        <el-menu-item index="prescribe">开立处方</el-menu-item>
      </el-menu-item-group>
    </el-submenu>
    <el-submenu index="2">
      <template slot="title">
        <i class="el-icon-document"></i>
        <span>挂号人员</span>
      </template>
      <el-menu-item-group class="over-hide">
        <el-menu-item index="reg">挂号</el-menu-item>
        <el-menu-item index="unreg">退号</el-menu-item>
      </el-menu-item-group>
    </el-submenu>
    <el-submenu index="3">
      <template slot="title">
        <i class="el-icon-document"></i>
        <span>收费员</span>
      </template>
      <el-menu-item-group class="over-hide">
        <el-menu-item index="pay">收费</el-menu-item>
      </el-menu-item-group>
    </el-submenu>
    <el-submenu index="4">
      <template slot="title">
        <i class="el-icon-document"></i>
        <span>发药人员</span>
      </template>
      <el-menu-item-group class="over-hide">
        <el-menu-item index="releaseDrug">发药</el-menu-item>
      </el-menu-item-group>
    </el-submenu>
  </el-menu>
</template>

<script>
export default {
  methods: {
    handleOpen (key, keyPath) {
      console.log(key, keyPath)
    },
    handleClose (key, keyPath) {
      console.log(key, keyPath)
    }
  }
}
</script>
