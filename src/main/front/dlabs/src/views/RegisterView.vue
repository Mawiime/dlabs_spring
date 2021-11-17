<template>
  <NavBarComponent/>
  <RegisterComponent/>
</template>

<script>
import NavBarComponent from "@/components/NavBarComponent";
import RegisterComponent from "@/components/RegisterComponent";

export default {
  name: "RegisterView",
  components: {NavBarComponent, RegisterComponent}
}
</script>

<style scoped>

</style>