import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

// 路由表：挂号收费员
export const registrarRouteTable = []

// 路由表：医生
export const doctorRouteTable = []

// 路由表：发药人员
export const drugReleaserRouteTable = []

const router = new Router({
  routes: [{
    path: '/',
    name: 'root',
    component: () => import('@/Index')
  }, {
    path: '/login',
    name: 'Login',
    component: () => import('@/components/user/Login')
  }, {
    path: '/404',
    name: '404',
    component: () => import('@/components/common/404')
  }, {
    path: '/diag',
    name: 'diag',
    component: () => import('@/components/doctor/Diagnose')
  },
  {
    path: '/prescribe',
    name: 'prescribe',
    component: () => import('@/components/doctor/Prescribe')
  }, {
    path: '/reg',
    name: 'Registration',
    component: () => import('@/components/reg/Registration')
  },
  {
    path: '/unreg',
    name: 'UnRegistration',
    component: () => import('@/components/reg/UnRegistration')
  },
  {
    path: '/pay',
    name: 'Pay',
    component: () => import('@/components/financial/Pay')
  }, {
    path: '/releaseDrug',
    name: 'releaseDrug',
    component: () => import('@/components/drugAdmin/ReleaseDrug')
  }
  ]
})

/**
 * 路由拦截：无jwt时返回到登录
 */
router.beforeEach((to, from, next) => {
  if (to.path !== '/login' && !localStorage.jwt) {
    console.log('not login')
    return next('/login')
  }
  console.log('next')
  next()
})

export default router
