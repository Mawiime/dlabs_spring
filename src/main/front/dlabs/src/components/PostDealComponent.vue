<template>
  <div class="postDeal">
    <div class="container">
      <div class="intro">
        <h2 class="text-center">Poster un nouveau deal</h2>
      </div>

      <form class="form-inline">
        <div class="form-group"><input class="form-control" placeholder="Titre du deal" v-model="form.title"></div>
        <div class="form-group"><input class="form-control" placeholder="Description" v-model="form.description"></div>
        <div class="form-group"><input class="form-control" placeholder="Prix original" v-model="form.priceOld"></div>
        <div class="form-group"><input class="form-control" placeholder="Prix remisé" v-model="form.priceNew"></div>
        <div class="form-group"><input class="form-control" placeholder="Enseigne" v-model="form.shopName"></div>
        <div class="form-group"><input class="form-control" placeholder="Lien vers l'enseigne" v-model="form.shopLink"></div>
        <div class="form-group"><input class="form-control" placeholder="Code promo" v-model="form.promoCode"></div>
        <div class="form-group"><input class="form-control" placeholder="Lien vers image" v-model="form.imgUrl"></div>
        <div class="form-group"><button class="btn btn-primary" v-on:click="sendDeal()">Créer le deal</button></div>
      </form>
    </div>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "PostDealComponent",
  data(){
    return{
      form : {
        title : '',
        description : '',
        priceOld : '',
        priceNew : '',
        shopName : '',
        shopLink : '',
        promoCode : '',
        imgUrl : '',
        temperature : '0',
        creator : 'temp_creator',
        date : new Date()
      }
    }
  },
  methods : {
    sendDeal(){
      axios.post("http://localhost:8080/deals", this.form).then((res) => {
        console.log(res)
      })
      .catch((error) => {
        console.error(error);
      });
    }
  }
}
</script>

<style scoped>
.postDeal {
  color:#313437;
  background-color:#fff;
  padding:70px 0;
}

.postDeal p {
  color:#7d8285;
  line-height:1.5;
}

.postDeal h2 {
  font-size:24px;
  font-weight:bold;
  margin-bottom:25px;
  line-height:1.5;
  padding-top:0;
  margin-top:0;
  color:inherit;
}

.postDeal .intro {
  font-size:16px;
  max-width:500px;
  margin:0 auto 25px;
}

.postDeal .intro p {
  margin-bottom:35px;
}

.postDeal form {
  justify-content:center;
}

.postDeal form .form-control {
  background:#eff1f4;
  border:none;
  border-radius:3px;
  box-shadow:none;
  outline:none;
  color:inherit;
  text-indent:9px;
  height:45px;
  margin-right:10px;
  min-width:250px;
}

.postDeal form .btn {
  padding:16px 32px;
  border:none;
  background:none;
  box-shadow:none;
  text-shadow:none;
  opacity:0.9;
  text-transform:uppercase;
  font-weight:bold;
  font-size:13px;
  letter-spacing:0.4px;
  line-height:1;
}

.postDeal form .btn:hover {
  opacity:1;
}

.postDeal form .btn:active {
  transform:translateY(1px);
}

.postDeal form .btn-primary {
  background-color:#055ada !important;
  color:#fff;
  outline:none !important;
}

.form-control{
  margin : 5px;
}

</style>