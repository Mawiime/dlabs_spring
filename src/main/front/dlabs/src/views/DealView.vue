<template>
  <NavBarComponent/>
  <DealComponent/>
</template>

<script>
import DealComponent from "../components/DealComponent";
import NavBarComponent from "@/components/NavBarComponent";
export default {
  name: "DealView",
  components: {
    DealComponent,
    NavBarComponent
  }
}
</script>

<style scoped>

</style>