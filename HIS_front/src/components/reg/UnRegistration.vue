<template>
  <el-row>
    <el-col :span="4"></el-col>
    <el-col :span="16">
      <div class="grid-content bg-purple-light"></div>
      <el-form ref="form" :model="form" label-width="80px">
        <p>患者信息查询</p>
        <el-form-item label="病历号">
          <el-input v-model="form.caseNo"></el-input>
        </el-form-item>
        <p>患者信息确认</p>
        <el-form-item label="姓名">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="身份证号">
          <el-input v-model="form.pid"></el-input>
        </el-form-item>
        <el-form-item label="家庭住址">
          <el-input v-model="form.address"></el-input>
        </el-form-item>
        <p>患者挂号信息</p>
      </el-form>
    </el-col>
    <slot></slot>
    <el-col :span="4"></el-col>
  </el-row>
</template>

<script>
export default {
  data () {
    return {
      form: {
        name: '',
        sex: '',
        regBirth: '',
        regAddr: '',
        regInsDate: false,
        type: [],
        resource: '',
        desc: ''
      }
    }
  },
  methods: {
    onSubmit () {
      console.log('submit!')
    }
  }
}
</script>

<style>
.el-col {
  border-radius: 4px;
}
.bg-purple-dark {
  background: #99a9bf;
}
.bg-purple {
  background: #d3dce6;
}
.bg-purple-light {
  background: #e5e9f2;
}
.grid-content {
  border-radius: 4px;
  min-height: 36px;
}
</style>
