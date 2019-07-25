import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
// 导入组件:登录与首页
import AppIndex from '@/components/AppIndex'
import Login from '@/components/user/Login'
import Pay from '@/components/financial/Pay'
Vue.use(Router)

export default new Router({
  routes: [{
    path: '/',
    name: 'HelloWorld',
    component: HelloWorld
  },
  {
    path: '/pay',
    name: 'Pay',
    component: Pay
  },
  {
    path: '/login',
    name: 'Login',
    component: Login
  },
  {
    path: '/index',
    name: 'AppIndex',
    component: AppIndex
  }
  ]
})
