<template>
  <h1>This is an index page to jump.</h1>
</template>

<script>
export default {
  mounted () {
    this.$router.replace({ path: '/app' })
  }
}
</script>
