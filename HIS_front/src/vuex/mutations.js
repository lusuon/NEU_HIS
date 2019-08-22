export default {
  // 更新当前登录的用户
  getCurrentUser (state, user) {
    console.log('current user change')
    state.currentUser = user
  },
  // 更新当前选择的患者
  getCurrentPatient (state, patient) {
    console.log('modifying currentPatient.')
    state.currentPatient = patient
  },
  getCurrentCaseNo (state, caseNo) {
    console.log('modifying currentCaseNo.')
    state.currentCaseNo = caseNo
  },
  // 用于选取一行的操作
  getCurrentRow (state, row) {
    console.log('mutation called.')
    state.currentRow = row
  },
  // 用于退号操作
  getCurrentOperate (state, toOperate) {
    console.log('mutation getCurrentOperate called.')
    state.currentOperate = toOperate
  }
}
