<template>
  <div class="home">
    <NavBarComponent/>
    <img src="../assets/logo_dlabs.png" width="1200" style="margin-top: 200px;"/>
  </div>
</template>

<script>
import NavBarComponent from "@/components/NavBarComponent";
export default {
  name: 'App',
  components: {
    NavBarComponent
  }
}
</script>

<style scoped>

</style>