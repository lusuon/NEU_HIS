<template>
  <div class="registration">
    <el-col>
      <div class="grid-content bg-purple-light"></div>
      <el-form ref="form" :model="form" label-width="80px">
        <el-card class="个人信息填写" shadow="hover">
          <div slot="header" class="clearfix">
            <p align="left">
              <span>一、个人信息填写</span>
            </p>
          </div>
          <el-row class="caseNo-and-name-and-sex">
            <el-col span="8" class="search-by-caseNo">
              <el-form-item label="病历号">
                <el-col :span="12">
                  <el-input v-model="form.caseNo"></el-input>
                </el-col>
                <el-col :span="12">
                  <el-button type="primary" @click="onSubmit">搜索</el-button>
                </el-col>
              </el-form-item>
            </el-col>
            <el-col :span="8">
              <el-form-item label="姓名" required>
                <el-input v-model="form.name"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="8">
              <el-form-item label="性别" required>
                <el-select v-model="form.sex" placeholder="请选择性别">
                  <el-option
                    v-bind:key="sex_item.id"
                    v-for="sex_item in this.basicInfo.sex"
                    :label="sex_item.constantName"
                    :value="sex_item.id"
                  ></el-option>
                </el-select>
              </el-form-item>
            </el-col>
          </el-row>
          <el-row class="pid-and-addr-and-birth">
            <el-col :span="8">
              <el-form-item label="身份证号">
                <el-input v-model="form.pid"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="8">
              <el-form-item label="家庭住址">
                <el-input v-model="form.address"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="8">
              <el-form-item label="出生日期">
                <el-col :span="11">
                  <el-date-picker
                    type="date"
                    placeholder="选择日期"
                    v-model="form.birth"
                    style="width: 100%;"
                  ></el-date-picker>
                </el-col>
                <el-col class="line" :span="2">-</el-col>
                <el-col :span="11">
                  <el-time-picker placeholder="选择时间" v-model="form.seeDate" style="width: 100%;"></el-time-picker>
                </el-col>
              </el-form-item>
            </el-col>
          </el-row>
        </el-card>
        <el-row>
          <el-col :span="12">
            <el-card class="挂号信息填写" shadow="hover">
              <div slot="header" class="clearfix">
                <p align="left">
                  <span>二、挂号信息填写</span>
                </p>
              </div>
              <el-row class="reg-doc-select">
                <el-col :span="12">
                  <el-form-item label="科室">
                    <el-select v-model="form.dept" placeholder="请选择科室">
                      <el-option
                        v-bind:key="item.id"
                        v-for="item in this.basicInfo.dept"
                        :label="item.deptName"
                        :value="item.id"
                      ></el-option>
                    </el-select>
                  </el-form-item>
                </el-col>
                <el-col :span="12">
                  <el-form-item label="医生">
                    <el-select v-model="form.doctor" placeholder="请选择医生">
                      <el-option
                        v-bind:key="item.id"
                        v-for="item in selectableDocs"
                        :label="item.realName"
                        :value="item.id"
                      ></el-option>
                    </el-select>
                  </el-form-item>
                </el-col>
              </el-row>
              <el-row class="reg-type-and-limit">
                <el-col :span="12">
                  <el-form-item label="号别">
                    <el-select v-model="form.regCategory" placeholder="请选择号别">
                      <el-option
                        v-bind:key="item.id"
                        v-for="item in selectableregCategory"
                        :label="item.categoryName"
                        :value="item.id"
                      ></el-option>
                    </el-select>
                  </el-form-item>
                </el-col>
                <el-col :span="12">
                  <el-form-item label="号额已用">{{this.payForm.occupy + '/' + this.payForm.initLimit}}</el-form-item>
                </el-col>
              </el-row>
              <el-row class="reg-time">
                <el-col :span="12">
                  <el-form-item label="看诊日期">
                    <el-col :span="11">
                      <el-date-picker
                        type="date"
                        placeholder="日期"
                        v-model="form.seeDate"
                        style="width: 100%;"
                      ></el-date-picker>
                    </el-col>
                    <el-col class="line" :span="2">-</el-col>
                    <el-col :span="11">
                      <el-time-picker placeholder="时间" v-model="form.seeDate" style="width: 100%;"></el-time-picker>
                    </el-col>
                  </el-form-item>
                </el-col>
                <el-col :span="12">
                  <el-form-item label="午别">
                    <el-select v-model="form.noon" placeholder="请选择午别">
                      <el-option label="上午" value="上"></el-option>
                      <el-option label="下午" value="下"></el-option>
                    </el-select>
                  </el-form-item>
                </el-col>
              </el-row>
            </el-card>
          </el-col>

          <el-col :span="12">
            <el-card class="付款信息填写" shadow="hover">
              <div slot="header" class="clearfix">
                <p align="left">
                  <span>三、付款信息填写</span>
                </p>
              </div>

              <el-row>
                <el-col :span="8">
                  <el-form-item label="结算类别">
                    <el-select v-model="form.settlement" placeholder="请选择结算类别">
                      <el-option label="自费" value="1"></el-option>
                      <el-option label="市医保" value="2"></el-option>
                    </el-select>
                  </el-form-item>
                </el-col>
                <el-col :span="8">
                  <el-form-item label="收费方式">
                    <el-select v-model="payForm.method" placeholder="请选择收费方式">
                      <el-option
                        v-bind:key="item.id"
                        v-for="item in selecatablePayMethod"
                        :label="item.constantName"
                        :value="item.id"
                      ></el-option>
                    </el-select>
                  </el-form-item>
                </el-col>
                <el-col :span="8">
                  <el-form-item label="需病历本">
                    <el-switch v-model="form.needCaseBook"></el-switch>
                  </el-form-item>
                </el-col>
              </el-row>
              <h5>应收金额:{{fee}}</h5>
              <el-form-item>
                <el-button type="primary" @click="reg">挂号</el-button>
                <el-button>清空</el-button>
              </el-form-item>
            </el-card>
          </el-col>
        </el-row>
      </el-form>
    </el-col>
  </div>
</template>

<script>
export default {
  data () {
    return {
      basicInfo: {},
      selectableDocs: [],
      selectableregCategory: [],
      selecatablePayMethod: [],
      currentRegLevel: {},
      form: {
        pid: '',
        name: '',
        sex: '',
        birth: '',
        address: '',
        seeDate: '',
        noon: '',
        dept: '',
        doctor: '',
        regCategory: '',
        settelment: '',
        needCaseBook: false,
        operator: 100 // 以后从登录状态获取
      },
      payForm: {
        initLimit: '',
        occupy: '',
        method: ''
      }
    }
  },
  computed: {
    fee () {
      return typeof this.currentRegLevel.regAmount !== 'undefined'
        ? this.currentRegLevel.regAmount + Number(this.form.needCaseBook)
        : 0
    }
  },
  watch: {
    'form.dept': {
      handler (newVal, oldVal) {
        console.log('listening to dept')
        if (typeof this.basicInfo.doc !== 'undefined') {
          this.selectableDocs = []
          this.selectableDocs = this.basicInfo.doc.filter(
            current => current.deptId === newVal
          )
        }
      },
      immediate: true
    },
    'form.doctor': {
      handler (newVal, oldVal) {
        console.log('listening to doctor’s reg level')
        this.form.regCategory = '';
        if (typeof this.basicInfo.doc !== 'undefined') {
          let newLevel = this.basicInfo.doc.filter(
            current => newVal === current.id
          )[0].regLevelId
          console.log(newLevel)
          this.selectableregCategory = this.basicInfo.reg_level.filter(
            current => current.id >= newVal
          )
        }
        console.log(this.selectableregCategory)
      },
      immediate: true
    },
    'form.regCategory': {
      handler (newVal, oldVal) {
        console.log('listening to reg category')
        if (typeof this.basicInfo.reg_level !== 'undefined') {
          // 获取初始号额
          this.currentRegLevel = this.basicInfo.reg_level.filter(
            current => current.id === newVal
          )[0]
          console.log(this.currentRegLevel)
          this.payForm.initLimit = this.currentRegLevel.regLimit
          // 获取当前已挂号人数
          this.$api
            .getToSeePatient(this.$store.state.currentDocId)
            .then(successResponse => {
              if (successResponse.data.code === 200) {
                console.log(successResponse.data.data)
                this.payForm.occupy = successResponse.data.data.length
              }
            })
            .catch(failResponse => {
              console.log(failResponse)
            })
        }
      },
      immediate: true
    }
  },
  mounted () {
    // 获取基本信息
    this.$api
      .getBasicInfo()
      .then(successResponse => {
        if (successResponse.data.code === 200) {
          console.log(successResponse.data.data)
          this.basicInfo = successResponse.data.data
          this.selecatablePayMethod = this.basicInfo.pay
          console.log(this.basicInfo.pay)
        }
      })
      .catch(failResponse => {
        console.log(failResponse)
      })
  },
  methods: {
    onSubmit () {
      console.log('submit!')
      this.$api
        .getPatientInfo(this.form.caseNo)
        .then(successResponse => {
          if (successResponse.data.code === 200) {
            console.log(successResponse.data.data)
            let objects = successResponse.data.data
            this.form.pid = objects.personalId
            this.form.name = objects.patientName
            this.form.needCaseBook = false
            this.form.birth = objects.birth
            console.log(objects)
          }
        })
        .catch(failResponse => {
          console.log(failResponse)
        })
    },
    reg () {
      console.log('reg!')
      console.log(this.form)
      this.form.needCaseBook = Number(this.form.needCaseBook)
      this.$api
        .reg(this.form)
        .then(successResponse => {
          if (successResponse.data.code === 200) {
            console.log(successResponse)
          }
        })
        .catch(failResponse => {
          console.log(failResponse)
        })
    }
  }
}
</script>

<style>
.el-col {
  border-radius: 4px;
}
.bg-purple-dark {
  background: #99a9bf;
}
.bg-purple {
  background: #d3dce6;
}
.bg-purple-light {
  background: #e5e9f2;
}
.grid-content {
  border-radius: 4px;
  min-height: 36px;
}
</style>
