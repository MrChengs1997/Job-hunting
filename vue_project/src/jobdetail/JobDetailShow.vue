<template>
    <div>
      <IndexHeader/>
      <JobDetail/>

      <IndexFooter/>
    </div>
</template>

<script>
  import IndexHeader from '../indexshow/IndexHeader'
  import IndexFooter from '../indexshow/IndexFooter'
  import JobDetail from './JobDetail'

  export default {
    components :{
      JobDetail,IndexHeader,IndexFooter
    }

  }
</script>

<style>
</style>
