<template>

    <v-card outlined>
        <v-card-title>
            Checkitem # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="Foodid" v-model="item.foodid" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'CheckitemViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/checkitems/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

