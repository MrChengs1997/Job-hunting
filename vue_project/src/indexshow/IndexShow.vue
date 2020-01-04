<template>

  <div>
    <IndexHeader/>

    <IndexContainer/>

    <IndexFooter/>
  </div>

</template>

<script>

  import IndexHeader from './IndexHeader'
  import IndexContainer from './IndexContainer'
  import IndexFooter from './IndexFooter'

  export default {
    data(){
      return{

      }
    },
    components :{
      IndexHeader,IndexContainer,IndexFooter
    }
  }
</script>

<style>



</style>
