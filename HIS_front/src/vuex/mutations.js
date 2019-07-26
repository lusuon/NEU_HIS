export default {
  getCurrentRow (state, row) {
    console.log('mutation called.')
    state.currentRow = row
  }
}
