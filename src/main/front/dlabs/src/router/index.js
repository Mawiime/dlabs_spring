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
  }
]

const router = createRouter({
  mode: 'history',
  history: createWebHashHistory(), routes
})

export default router
