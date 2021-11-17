<template>
  <div class="deal">
    <div class="card mb-3" style="max-width: 80%">
      <div class="row g-0">

        <div class="col-md-2">
          <img :src="this.dealInfo.imgUrl" class="img-fluid"/>
        </div>

        <div class="col-md-7">
          <div class="card-body">
            <h5 class="card-title"> {{ this.dealInfo.temperature }} ° C</h5>
            <h3 class="card-text">{{this.dealInfo.title}}</h3>
            <p class="card-text"> Code promo : {{ this.dealInfo.promoCode }}</p>
            <p class="card-text"> Remise : {{ this.dealInfo.priceOld }} € -> {{ this.dealInfo.priceNew}} €</p>
            <p class="card-text"> Description : {{ this.dealInfo.description }}</p>
          </div>
        </div>

        <div class="col-md-3">
          <p class="card-text"> {{this.dealInfo.date}} </p>
          <p class="card-text"> {{this.dealInfo.creator}}</p>
          <div class="card-text"> <a target="_blank" class="btn btn-dark" :href="this.dealInfo.shopLink"> Voir </a></div>
        </div>

      </div>
    </div>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "DealComponent",
  data(){
    return{
      dealInfo : []
    }
  },
  created(){
    axios.get("http://localhost:8080/public/deals/" + this.$route.params.id).then(response => {
      this.dealInfo = response.data;
    });
  }
}

</script>

<style scoped>
.deal{
  margin-left : 400px;
  margin-top : 60px;
}
.card{
  box-shadow: 5px 5px 8px dimgrey;
}
</style>