<template>
  <div class="deals">
    <div class="card mb-3" style="max-width: 80%" v-for="deal in listDeals" :key="deal.id" v-on:click="navigate(deal.id)">
      <div class="row g-0">

        <div class="col-md-2">
          <img :src="deal.imgUrl" class="img-fluid"/>
        </div>

        <div class="col-md-7">
          <div class="card-body">
              <h5 class="card-title"> {{deal.temperature}} °C</h5>
              <h3 class="card-text"> {{deal.titre}} </h3>
            </div>
        </div>

        <div class="col-md-3">
           <p class="card-text"> {{deal.date}} </p>
           <div class="card-text"> <a target="_blank" class="btn btn-dark" :href="deal.shopLink"> Voir </a></div>
        </div>

      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'DealsComponent',
  data(){
    return{
      listDeals : []
    }
  },
  methods : {
    navigate(id){
      this.$router.push({name : "Deal", params : {id : id}});
    }
  },
  created(){
    axios.get("http://localhost:8080/deals").then(response => {
      this.listDeals = response.data.deals;
    });
  }
}
</script>

<style scoped>
.deals{
  margin-left : 400px;
  margin-top : 75px;
}
.card{
  cursor: pointer;
  box-shadow: 5px 5px 8px dimgrey;
}
</style>