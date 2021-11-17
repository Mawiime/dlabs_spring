import { createRouter, createWebHashHistory } from 'vue-router'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: () => import('../views/Home.vue')
  },
  {
    path: '/deals',
    name: 'Deals',
    component: () => import('../views/DealsView.vue')
  },
  {
    path: '/deals/:id',
    name: 'Deal',
    component: () => import('../views/DealView.vue')
  },
  {
    path: '/postDeal',
    name: 'PostDeal',
    component: () => import('../views/PostDealView.vue')
  },
  {
    path: '/login',
    name: 'Login',
    component: () => import('../views/LoginView.vue')
  },
  {
    path: '/register',
    name: 'Register',
    component: () => import('../views/RegisterView.vue')
  }
]

const router = createRouter({
  mode: 'history',
  history: createWebHashHistory(), routes
})

export default router
