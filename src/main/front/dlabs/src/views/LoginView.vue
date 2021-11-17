<template>
  <NavBarComponent/>
  <LoginComponent/>
</template>

<script>
import NavBarComponent from "@/components/NavBarComponent";
import LoginComponent from "@/components/LoginComponent";

export default {
  name: "LoginView",
  components: {NavBarComponent, LoginComponent}
}
</script>

<style scoped>

</style>