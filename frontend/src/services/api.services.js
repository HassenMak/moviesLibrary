import axios from 'axios';


export default {
  // Creation of the services

  async fetchMoviesData() {
    const movies = await axios.get('/api/movies');
    return movies;
  },


}
;
