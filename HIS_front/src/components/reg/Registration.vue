<template>
  <div class="registration">
    <el-row>
      <el-col :span="4"></el-col>
      <el-col :span="16">
        <div class="grid-content bg-purple-light"></div>
        <el-form ref="form" :model="form" label-width="80px">
          <el-form-item label="病历号">
            <el-input v-model="form.caseNo"></el-input>
          </el-form-item>
          <el-form-item label="姓名">
            <el-input v-model="form.name"></el-input>
          </el-form-item>
          <el-form-item label="性别">
            <el-select v-model="form.sex" placeholder="请选择活动区域">
              <el-option label="男" value="71"></el-option>
              <el-option label="女" value="72"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item label="年龄">
            <el-input v-model="form.age"></el-input>
          </el-form-item>
          <el-form-item label="年龄类型">
            <el-select v-model="form.ageType" placeholder="请选择活动区域">
              <el-option label="岁" value="岁"></el-option>
              <el-option label="月" value="月"></el-option>
              <el-option label="天" value="天"></el-option>
            </el-select>
          </el-form-item>
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
              <el-time-picker placeholder="选择时间" v-model="form.date2" style="width: 100%;"></el-time-picker>
            </el-col>
          </el-form-item>
          <el-form-item label="身份证号">
            <el-input v-model="form.pid"></el-input>
          </el-form-item>
          <el-form-item label="家庭住址">
            <el-input v-model="form.address"></el-input>
          </el-form-item>
          <el-form-item label="结算类别">
            <el-select v-model="form.settlement" placeholder="请选择活动区域">
              <el-option label="自费" value="1"></el-option>
              <el-option label="市医保" value="2"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item label="看诊日期">
            <el-col :span="11">
              <el-date-picker
                type="date"
                placeholder="选择日期"
                v-model="form.seeDate"
                style="width: 100%;"
              ></el-date-picker>
            </el-col>
            <el-col class="line" :span="2">-</el-col>
            <el-col :span="11">
              <el-time-picker placeholder="选择时间" v-model="form.date2" style="width: 100%;"></el-time-picker>
            </el-col>
          </el-form-item>
          <el-form-item label="午别">
            <el-select v-model="form.noon" placeholder="请选择活动区域">
              <el-option label="上午" value="上"></el-option>
              <el-option label="下午" value="下"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item label="挂号科室">
            <el-select v-model="form.dept" placeholder="请选择活动区域">
              <el-option label="上午" value="上"></el-option>
              <el-option label="下午" value="下"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item label="看诊医生">
            <el-select v-model="form.doctor" placeholder="请选择活动区域">
              <el-option label="上午" value="上"></el-option>
              <el-option label="下午" value="下"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item label="号别">
            <el-select v-model="form.regCategory" placeholder="请选择活动区域">
              <el-option label="专家号" value="上"></el-option>
              <el-option label="普通号" value="下"></el-option>
            </el-select>
          </el-form-item>

          <el-form-item label="初始号额">
            <el-input v-model="form.initLimit"></el-input>
          </el-form-item>
          <el-form-item label="已用号额">
            <el-input v-model="form.occupy"></el-input>
          </el-form-item>
          <el-form-item label="应收金额">
            <el-input v-model="form.fee"></el-input>
          </el-form-item>

          <el-form-item label="收费方式">
            <el-select v-model="form.method" placeholder="请选择活动区域">
              <el-option label="现金" value="上"></el-option>
              <el-option label="balabala" value="下"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item label="需要病历本">
            <el-switch v-model="form.needCaseBook"></el-switch>
          </el-form-item>
          <el-form-item>
            <el-button type="primary" @click="onSubmit">立即创建</el-button>
            <el-button>取消</el-button>
          </el-form-item>
        </el-form>
      </el-col>
      <el-col :span="4"></el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  data () {
    return {
      form: {
        name: '',
        sex: '',
        regBirth: '',
        regAddr: '',
        regInsDate: false,
        type: [],
        resource: '',
        desc: ''
      }
    }
  },
  methods: {
    onSubmit () {
      console.log('submit!')
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
