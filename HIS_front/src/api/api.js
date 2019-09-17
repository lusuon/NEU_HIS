import axios from '@/utils/http' // 导入http中创建的axios实例
/**
 * 接口域名的管理
 */

const baseURL = '/api'
const doctorURL = baseURL + '/doctor'
const templateURL = baseURL + '/template'
const drugURL = baseURL + '/drug'
const loginURL = baseURL + '/login'
const payURL = baseURL + '/payment'
const regURL = baseURL + '/registration'
const diseaseURL = baseURL + '/disease'

// GET
// 全部疾病信息
export const getAllDisease = () => {
  return axios.get(`${diseaseURL}`)
}
// 单个疾病详细信息
export const getDiseaseInfo = diseaseId => {
  return axios.get(`${diseaseURL}/${diseaseId}`)
}
export const postDiagnosis = params => {
  return axios.post(`${doctorURL}/diagnosis`, params)
}
export const getDrugs = () => {
  return axios.get(`${drugURL}`)
}

/**
 * 挂号操作员
 */
// GET
// 基础信息
export const getBasicInfo = () => {
  return axios.get(`${regURL}/basic`)
}
// 根据病历号获取患者信息
export const getPatientInfo = caseNo => {
  return axios.get(`${regURL}/first/${caseNo}`)
}
// 根据病历号获取所有挂号记录
export const getAllPatientInfo = caseNo => {
  return axios.get(`${regURL}/all/${caseNo}`)
}

// POST
// 提交挂号信息，未测试
export const reg = params => {
  return axios.post(`${regURL}/reg`, params)
}
// 提交退号信息，未测试
export const unreg = id => {
  return axios.put(`${regURL}/unreg/${id}`)
}

/**
 * User 用户相关
 */

// GET
// EMPTY YET

// POST
// 提交登录信息
export const login = param => {
  return axios.post(`${loginURL}`, param)
}

/**
 * 医生相关
 */

// GET
// 医生待诊患者
export const getToSeePatient = docId => {
  return axios.get(`${doctorURL}/${docId}/toSee`)
}
// 医生已诊患者
export const getSeenPatient = docId => {
  return axios.get(`${doctorURL}/${docId}/seen`)
}
// 已诊患者的详细记录
export const getDiag = regId => {
  return axios.get(`${doctorURL}/diag/${regId}`)
}
// 当前医生可用模板
export const usableTemplateList = docId => {
  return axios.get(`${doctorURL}/${docId}/template`)
}
// 选定模板详情
export const getTemplateDtl = (type, id) => {
  return axios.get(`${templateURL}/${type}/${id}/Dtl`)
}

// POST
// 提交开药
export const apply = params => {
  return axios.post(`${doctorURL}/apply`, params)
}
// 提交诊断
export const diag = params => {
  return axios.post(`${doctorURL}/diag`, params)
}

/**
 * 药房管理员
 */

// GET
// 待发药
export const getToReleaseDrug = caseNo => {
  return axios.get(`${drugURL}/toRelease/${caseNo}`)
}
// POST
export const releaseDrug = params => {
  return axios.put(`${drugURL}/release`, params)
}
/**
 * 财务操作员
 */

// GET
// 根据病历号查看收费项目
export const getToPay = caseNo => {
  return axios.get(`${payURL}/${caseNo}`)
}
// POST
// 提交处方id进行缴费
export const pay = params => {
  return axios.post(`${payURL}`, params)
}
