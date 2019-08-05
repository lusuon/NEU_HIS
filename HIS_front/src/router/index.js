import Vue from 'vue'
import Router from 'vue-router'
// 导入组件:登录与首页
import Login from '@/components/user/Login'
import Reg from '@/components/reg/Registration'
import UnReg from '@/components/reg/UnRegistration'
import Diag from '@/components/doctor/Diagnose'
import Prescribe from '@/components/doctor/Prescribe'
import Pay from '@/components/financial/Pay'
import ReleaseDrug from '@/components/drugAdmin/ReleaseDrug'
Vue.use(Router)

export default new Router({
  routes: [{
    path: '/login',
    name: 'Login',
    component: Login
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
    name: 'diag',
    component: Diag
  },
  {
    path: '/prescribe',
    name: 'prescribe',
    component: Prescribe
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
