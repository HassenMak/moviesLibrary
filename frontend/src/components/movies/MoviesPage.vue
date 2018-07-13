<template>
    <div>
        <p>
            Here is the page for the list of movies : {{movies}}
        </p>
    </div>
</template>

<script>
import { mapState } from 'vuex';

export default {

  computed: {
    ...mapState([
      'movies',
    ]),
  },

};
</script>
