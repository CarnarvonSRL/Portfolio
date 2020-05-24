import "https://unpkg.com/vue/dist/vue.js"
import "https://unpkg.com/vuex/dist/vuex.js"
import store from './store/store.js';
import './component/todolist.js';
import './component/task.js';

var app = new Vue({
    el: '#app',
    store
});