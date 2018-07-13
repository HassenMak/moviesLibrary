import Vue from 'vue';
import Vuex from 'vuex';
import apiService from '../services/api.services';

Vue.use(Vuex);

export default new Vuex.Store({

  state: {
    movies: null,
  },

  mutations: {
    fetchMovies(state, movies) {
      state.movies = movies;
    },

  },

  actions: {
    async fetchMovies({ commit }) {
      const { data } = await apiService.fetchMoviesData();
      commit('fetchMovies', data);
    },
  },
});
