// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import Index from './Index'
import router from './router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import store from './vuex' // 导入vuex文件
import * as api from './api/api'
import Vuex from 'vuex'

Vue.use(ElementUI) // 导入api接口
Vue.use(Vuex)

// 设置反向代理，前端请求默认发送到 http://localhost:8080/
var axios = require('axios')
axios.defaults.baseURL = 'http://localhost:8080'
// 全局注册，之后可在其他组件中通过 this.$axios 发送数据
Vue.prototype.$api = api // 将api挂载到vue的原型上
Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  store,
  components: {
    Index,
    App
  },
  template: '<App/>',
  created () {
    console.log(this.$router)
  }
})
