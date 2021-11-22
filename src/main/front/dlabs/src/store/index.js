import { createStore } from 'vuex';

export default createStore({
  state: {
    role : "disconnected"
  },
  mutations: {
    CONNECT(state){
      state.role = "connected";
    },
    DISCONNECT(state){
      state.role = "disconnected";
    }
  },
  actions: {
    toggle_connected(context,state){
      context.commit('CONNECT',state);
    },
    toggle_disconnect(context,state){
      context.commit('DISCONNECT',state);
    }
  },
  modules: {
  }
})
