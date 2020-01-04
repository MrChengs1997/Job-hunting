<template>
    <div>
      <IndexHeader/>
      <List/>

      <IndexFooter/>
    </div>
</template>

<script>

  import IndexHeader from '../indexshow/IndexHeader'
  import IndexFooter from '../indexshow/IndexFooter'
  import List from './List'
    export default {

      components :{
        IndexHeader,IndexFooter,List
      }

    }
</script>

<style>
</style>
