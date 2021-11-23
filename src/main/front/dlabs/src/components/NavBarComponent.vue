<template>
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <router-link to="/" class="nav-link"> Dlabs </router-link>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
          <router-link class="nav-link" to="/deals">Deals</router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/postDeal">Poster un nouveau deal</router-link>
        </li>
        <li v-if="this.$store.state.role=='disconnected'">
          <router-link class="nav-link" to="/login">Se connecter</router-link>
        </li>
        <li v-if="this.$store.state.role=='disconnected'">
          <router-link class="nav-link" to="/register">S'inscrire</router-link>
        </li>
      </ul>

      <span v-if="this.$store.state.role=='connected'" class="navbar-text"> Bonjour User </span>
    </div>
  </nav>
</template>

<script>
export default {
  name: "NavBarComponent"
}
</script>

<style scoped>
nav{
  position : fixed;
  top : 0;
  width : 100%;
  z-index: 5;
}
</style>