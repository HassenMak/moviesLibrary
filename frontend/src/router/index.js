import Vue from 'vue';
import Router from 'vue-router';
import HomePage from '../components/home/HomePage';
import MoviesPage from '../components/movies/MoviesPage';

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: HomePage,
    },
    {
      path: '/movies',
      name: 'Movies',
      component: MoviesPage,
    },
  ],
});
