<template>
  <div class="deals">
    <NavBarComponent/>
    <DealsComponent />
  </div>
</template>

<script>
import DealsComponent from "../components/DealsComponent";
import NavBarComponent from "@/components/NavBarComponent";
export default {
  name: 'App',
  components: {
    NavBarComponent,
    DealsComponent
  }
}
</script>