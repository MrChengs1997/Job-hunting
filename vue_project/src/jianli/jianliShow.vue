<template>
<div>
  <IndexHeader/>
  <jianContainer/>

  <IndexFooter/>
</div>
</template>

<script>
  import jianContainer from './jianContainer'
  import IndexHeader from '../indexshow/IndexHeader'
  import IndexFooter from '../indexshow/IndexFooter'

  export default {
    components :{
      jianContainer,IndexHeader,IndexFooter
    }

  }

</script>

<style >

</style>
