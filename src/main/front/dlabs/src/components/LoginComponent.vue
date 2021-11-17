<template>
  <div id="login">
    <section class="vh-100">
      <div class="container py-5 h-100" >
        <div class="row d-flex justify-content-center align-items-center h-100" >
          <div class="col-12 col-md-8 col-lg-6 col-xl-5" >
            <div class="card shadow-2-strong" style="border-radius: 1rem; background-color: lightgrey;">
              <div class="card-body p-5 text-center">

                <h2 class="text-uppercase text-center mb-5">Se connecter</h2>

                <div class="form-outline mb-4">
                  <input type="text" id="typeEmailX-2" class="form-control form-control-lg" placeholder="Pseudo" v-model="this.form.identifier"/>
                </div>
                <div class="form-outline mb-4">
                  <input type="password" id="typePasswordX-2" class="form-control form-control-lg" placeholder="Mot de passe" v-model="this.form.password"/>
                </div>
                <button class="btn btn-primary btn-lg btn-block" type="submit" v-on:click="authenticate()">Se connecter</button>
                <hr class="my-4">

                <div class="form-outline mb-4" v-if="this.incorrectLogin">
                  Utilisateur ou mot de passe incorrect
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
  name: "LoginComponent",
  data(){
    return {
      form : {
        identifier: null,
        password : null
      },
      incorrectLogin : false
    }
  },
  methods : {
    authenticate(){
      const LoginRequestDTO = {
        'identifier' : this.form.identifier,
        'password' : this.form.password
      };

      axios.post('http://localhost:8080/public/bd/login', LoginRequestDTO).then(() => {
        localStorage.setItem('auth', btoa(LoginRequestDTO.identifier + ":" + LoginRequestDTO.password));
        this.$router.push({name : "Deals"});
      }, () => {
        this.incorrectLogin = true;
      });


    }
  }
}
</script>

<style scoped>

</style>