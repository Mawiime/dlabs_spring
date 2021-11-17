<template>
  <div id="register">
    <section class="vh-100 bg-image">
      <div class="mask d-flex align-items-center h-100 gradient-custom-3">
        <div class="container h-100">
          <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-12 col-md-9 col-lg-7 col-xl-6">
              <div class="card" style="border-radius: 15px; background-color: lightgrey;" >
                <div class="card-body p-5">
                  <h2 class="text-uppercase text-center mb-5">Créer un utilisateur</h2>

                  <form>
                    <div class="form-outline mb-4">
                      <input type="text" class="form-control form-control-lg" placeholder="Pseudo" v-model="this.form.pseudo"/>
                    </div>

                    <div class="form-outline mb-4">
                      <input type="text" class="form-control form-control-lg" placeholder="Nom" v-model="this.form.lastName"/>
                    </div>

                    <div class="form-outline mb-4">
                      <input type="text" class="form-control form-control-lg" placeholder="Prénom" v-model="this.form.firstName"/>
                    </div>

                    <hr class="my-4">

                    <div class="form-outline mb-4">
                      <input type="password" class="form-control form-control-lg" placeholder="Mot de passe" v-model="this.form.password"/>
                    </div>

                    <div class="form-outline mb-4">
                      <input type="password" class="form-control form-control-lg" placeholder="Confirmer mot de passe"/>
                    </div>

                    <div class="d-flex justify-content-center">
                      <button type="button" class="btn btn-primary btn-lg btn-block" v-on:click="createUser()">S'inscrire</button>
                    </div>

                    <div class="form-outline mb-4" v-if="this.formError">
                      Tous les champs doivent être remplis
                    </div>

                  </form>

                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "RegisterComponent",
  data(){
    return{
      formError : false,
      form : {
        pseudo : null,
        firstName : null,
        lastName : null,
        password : null
      }
    }
  },
  methods : {
    createUser(){
      if(this.form.pseudo && this.form.firstName && this.form.lastName && this.form.password){
        axios.post('http://localhost:8080/public/user', this.form).then(() => {
          this.formError = false;
        })
        .catch((error) => {
          console.error(error);
        });
      }
      else{
        this.formError = true;
      }
    }
  }
}
</script>

<style scoped>

</style>