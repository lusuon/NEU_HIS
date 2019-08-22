<template>
  <div>
    <el-row>
      <el-col :span="10">
        <div class="head-wrap" align="left">NEU-HIS</div>
      </el-col>
      <el-col v-if="isLogin" :span="12">
        <div class="userInfo" align="right">Welcome back!{{getUsername}}</div>
      </el-col>
      <el-col v-if="isLogin" :span="2">
        <div class="logout" align="right">
          <el-button @click="logout">注销</el-button>
        </div>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  computed: {
    isLogin: function () {
      console.log(this.$store.state.currentUser === '')
      return !(this.$store.state.currentUser === '')
    },
    getUsername: function () {
      console.log('computing username')
      return this.$store.state.currentUser.username
    }
  },
  mounted () {
    if (localStorage.user !== '') {
      this.$store.commit('getCurrentUser', JSON.parse(localStorage.user))
    }
  },
  methods: {
    logout () {
      console.log('logout')
      localStorage.jwt = '';
      localStorage.user = '';
      this.$store.state.currentUser = '';
      this.$router.replace({ path: '/' })
    }
  }
}
</script>
<style scoped>
.head-wrap {
  text-align: "left";
}
</style>
