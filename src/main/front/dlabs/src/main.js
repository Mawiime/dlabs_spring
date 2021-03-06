import { createApp } from 'vue'
import App from './App.vue'
import 'bootstrap';
import 'bootstrap/dist/css/bootstrap.css';
import router from './router'
import axios from "axios";
import store from './store'

axios.interceptors.request.use(async function (config){
    if(!config.url.includes('public')){
        config.headers['Authorization'] = 'Basic ' + localStorage.getItem('auth');
    }

    return config;
}, (error) => {
    return Promise.reject(error);
});

createApp(App).use(store).use(router).mount('#app')
