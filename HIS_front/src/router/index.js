import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
// 导入组件:登录与首页
import AppIndex from '@/components/AppIndex'
import Login from '@/components/user/Login'
import Reg from '@/components/reg/Registration'
import UnReg from '@/components/reg/UnRegistration'
import DoctorMainPanel from '@/components/doctor/DoctorMainPanel'
import Pay from '@/components/financial/Pay'
import ReleaseDrug from '@/components/drugAdmin/ReleaseDrug'
Vue.use(Router)

export default new Router({
  routes: [{
    path: '/',
    name: 'HelloWorld',
    component: HelloWorld
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
  },
  {
    path: '/reg',
    name: 'Registration',
    component: Reg
  },
  {
    path: '/unreg',
    name: 'UnRegistration',
    component: UnReg
  },
  {
    path: '/diag',
    name: 'Diagnose',
    component: DoctorMainPanel
  },
  {
    path: '/apply',
    name: 'Apply',
    component: DoctorMainPanel
  },
  {
    path: '/pay',
    name: 'Pay',
    component: Pay
  },
  {
    path: '/releaseDrug',
    name: 'releaseDrug',
    component: ReleaseDrug
  }
  ]
})
