<template>
  <div id="login">
    <el-form
      :rules="rules"
      class="login-container"
      label-position="left"
      label-width="0px"
      v-loading="loading"
    >
      <h3 class="login_title">系统登录</h3>
      <el-form-item prop="account">
        <el-input type="text" v-model="loginForm.username" auto-complete="off" placeholder="账号"></el-input>
      </el-form-item>
      <el-form-item prop="checkPass">
        <el-input type="password" v-model="loginForm.password" auto-complete="off" placeholder="密码"></el-input>
      </el-form-item>
      <el-form-item style="width: 100%">
        <el-button
          type="primary"
          style="width: 100%;background: #505458;border: none"
          v-on:click="login"
        >登录</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
export default {
  name: 'Login',
  data () {
    return {
      loginForm: {
        username: '',
        password: ''
      },
      responseResult: []
    }
  },
  mounted () {
    console.log(localStorage)
    console.log(this.$store.state)
  },
  methods: {
    login () {
      localStorage.clear()
      this.$api
        .login({
          user: this.loginForm.username,
          pass: this.loginForm.password
        })
        .then(successResponse => {
          let resData = successResponse.data.data
          if (successResponse.data.code === 200) {
            localStorage.jwt = resData.jwt
            this.$store.commit('getCurrentUser', resData.user)
            console.log('toString')
            console.log(resData.user)
            localStorage.user = JSON.stringify(resData.user)
            this.$router.replace({ path: '/' })
          }
        })
        .catch(failResponse => {})
    }
  }
}
</script>
<style scoped>
#login {
  background: url("~@/assets/b1.jpg") no-repeat;
  background-position: center;
  height: 100%;
  width: 100%;
  background-size: cover;
  position: fixed;
}
body {
  margin: 0px;
}
.login-container {
  border-radius: 15px;
  background-clip: padding-box;
  margin: 90px auto;
  width: 350px;
  padding: 35px 35px 15px 35px;
  background: #fff;
  border: 1px solid #eaeaea;
  box-shadow: 0 0 25px #cac6c6;
}
.login_title {
  margin: 0px auto 40px auto;
  text-align: center;
  color: #505458;
}
.login_remember {
  margin: 0px 0px 35px 0px;
  text-align: left;
}
/*.login_button {*/
/*background: #505458;*/
/*}*/
/*el_checkbox {*/
/*background: #505458;*/
/*}*/
</style>
