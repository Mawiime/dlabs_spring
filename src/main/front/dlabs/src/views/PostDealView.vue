<template>
  <NavBarComponent/>
  <PostDealComponent/>
</template>

<script>
import PostDealComponent from "@/components/PostDealComponent";
import NavBarComponent from "@/components/NavBarComponent";
export default {
  name: "PostDealView",
  components: {
    PostDealComponent,
    NavBarComponent
  }
}
</script>

<style scoped>

</style>