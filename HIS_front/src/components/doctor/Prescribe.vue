<template>
  <div>
    <!-- 患者信息表 -->
    <el-col :span="6">
      <doctorMainPanel />
    </el-col>
    <!-- 处方开立栏 -->
    <el-col :span="18">
      <!-- 当前处方 -->
      <el-row>
        <el-col :span="8">
          <el-card shadow="hover">
            <el-row>
              <el-col :span="8">
                <h1>当前处方</h1>
              </el-col>
              <el-col :span="16">
                <h1>
                  <el-button-group>
                    <el-button type="primary" size="mini" @click="addPrescription">增方</el-button>
                    <el-button type="primary" size="mini" @click="applyTemplate">开立</el-button>
                    <el-button type="primary" size="mini" @click="clearTemplate">作废</el-button>
                  </el-button-group>
                </h1>
              </el-col>
            </el-row>
            <el-table
              :data="usingTemplates"
              stripe
              highlight-current-row
              @current-change="handleCurrentUsingTemplateChange"
            >
              <el-table-column prop="name" label="名称" min-width="80%">
                <template scope="scope">
                  <el-input
                    size="small"
                    v-model="scope.row.name"
                    placeholder="请输入处方名称"
                    @change="handleEdit(scope.$index, scope.row)"
                  ></el-input>
                </template>
              </el-table-column>
              <el-table-column label="操作" min-width="20%">
                <template slot-scope="scope">
                  <el-button
                    @click.native.prevent="deleteRow(scope.$index, usingTemplates)"
                    type="text"
                    size="small"
                  >移除</el-button>
                </template>
              </el-table-column>
            </el-table>
          </el-card>
        </el-col>
        <el-col :span="16">
          <el-card shadow="hover">
            <el-row>
              <el-col :span="6">
                <h1>
                  <el-button-group>
                    <el-button type="primary" size="mini">增药</el-button>
                    <el-button type="primary" size="mini">删药</el-button>
                  </el-button-group>
                </h1>
              </el-col>
              <el-col :span="18">
                <h1>处方金额统计：{{totalPrice}}</h1>
              </el-col>
            </el-row>
            <el-table :data="usingTemplatesDtlData" stripe>
              <el-table-column prop="drug.drugName" label="药品名称" min-width="25%"></el-table-column>
              <el-table-column label="数量" min-width="18%">
                <template scope="scope">
                  <el-form :model="scope.row" :rules="checkParamsRule" ref="scope.row">
                    <el-form-item prop="quantity">
                      <el-input
                        size="small"
                        v-model="scope.row.quantity"
                        placeholder="请输入数量"
                        @change="handleEdit(scope.$index, scope.row)"
                      ></el-input>
                    </el-form-item>
                  </el-form>
                </template>
              </el-table-column>
              <el-table-column prop="drug.standard" label="规格" min-width="19%"></el-table-column>
              <el-table-column prop="drug.unit" label="单位" min-width="8%"></el-table-column>
              <el-table-column prop="dtl.method" label="用法" min-width="10%"></el-table-column>
              <el-table-column prop="dtl.consumption" label="用量" min-width="10%"></el-table-column>
              <el-table-column prop="dtl.frequency" label="频次" min-width="10%"></el-table-column>
            </el-table>
          </el-card>
        </el-col>
      </el-row>
      <el-row shadow="hover">
        <el-row>
          <el-col :span="8">
            <el-card shadow="hover">
              <h1>可用模板</h1>
              <el-table
                class="usableTemplate"
                :data="templateTableData"
                stripe
                highlight-current-row
                @current-change="handleCurrentChange"
              >
                <el-table-column prop="name" label="模板名称" min-width="65%"></el-table-column>
                <el-table-column prop="range" label="使用范围" min-width="35%"></el-table-column>
              </el-table>
            </el-card>
          </el-col>
          <el-col :span="16">
            <el-card shadow="hover">
              <h1>所选模板明细</h1>
              <el-table :data="templateDtlTableData" stripe>
                <el-table-column prop="drug.drugName" label="药品名称"></el-table-column>
                <el-table-column prop="drug.standard" label="规格"></el-table-column>
                <el-table-column prop="drug.unit" label="单位"></el-table-column>
                <el-table-column prop="dtl.method" label="用法"></el-table-column>
                <el-table-column prop="dtl.consumption" label="用量"></el-table-column>
                <el-table-column prop="dtl.frequency" label="频次"></el-table-column>
              </el-table>
              <el-row>
                <el-button @click="useTemplate" type="primary">使用该模板</el-button>
              </el-row>
            </el-card>
          </el-col>
        </el-row>
      </el-row>
    </el-col>
  </div>
</template>

<script>
import { Message } from 'element-ui';
import DoctorMainPanel from './DoctorMainPanel';
export default {
  components: {
    doctorMainPanel: DoctorMainPanel
  },
  methods: {
    handleCurrentUsingTemplateChange (val) {
      this.currentUsingTemplate = val
      console.log(this.currentUsingTemplate)
    },
    deleteRow (index, rows) {
      rows.splice(index, 1)
    },
    addPrescription () {
      this.usingTemplates.push({ id: -1 })
    },
    handleCurrentChange (val) {
      this.currentSelectingTemplate = val
      console.log(this.currentSelectingTemplate)
    },
    handleEdit (index, row) {
      console.log('row change')
      console.log(row)
    },
    useTemplate () {
      this.usingTemplates.push(this.currentSelectingTemplate)
    },
    applyTemplate () {
      // 开立处方
      // 构造request
      let rid = this.$store.state.currentPatient.regId
      this.toApplyItem = []
      // gpn:处方名称, list:药品id，逗号分隔
      this.usingTemplates.map(current => {
        let templateId = current.id
        let templateName = current.name
        let correspondDtl = this.usingTemplatesDtlData.filter(current => {
          return current.dtl.templateId === templateId
        })
        let listStr = '';
        correspondDtl.map(current => {
          this.toApplyItem.push({
            rid: rid,
            gpn: templateName,
            list:
              listStr +
              current.drug.id +
              ',' +
              current.dtl.method +
              ',' +
              current.dtl.consumption +
              ',' +
              current.dtl.frequency +
              ',' +
              current.quantity
          })
        })
      })
      console.log(this.toApplyItem)

      //提交
      this.toApplyItem.map(current => {
        this.$api
          .apply(current)
          .then(resp => {
            if (resp.data.code === 200) {
              Message({
                message: current.gpn + '开立成功',
                duration: 1000
              })
            }
          })
          .catch(failResponse => {
            console.log(failResponse)
          })
      })

      this.toApplyItem = []
      this.usingTemplates = []
    },
    clearTemplate () {
      this.usingTemplates = []
    }
  },
  computed: {
    getSelectingTemplateId () {
      return this.currentSelectingTemplate.id
    },
    totalPrice () {
      // 明细项费用
      let sepSum = this.usingTemplatesDtlData.map(current => {
        return current.drug.unitPrice * current.quantity
      })
      // 对明细求和
      let total = eval(sepSum.join('+'))
      return isNaN(total) ? '请输入数量以计算总和' : total
    },
    getUsingTemplates () {
      return this.usingTemplates
    }
  },
  watch: {
    getSelectingTemplateId (newVal, oldVal) {
      this.$api
        .getTemplateDtl('medi', newVal)
        .then(resp => {
          if (resp.data.code === 200) {
            let objects = resp.data.data
            console.log(objects)
            this.templateDtlTableData = objects
          }
        })
        .catch(failResponse => {
          console.log(failResponse)
        })
    },
    getUsingTemplates (newVal, oldVal) {
      // 进行更名
      this.usingTemplates.map(current => {
        if (current.id > 0 && current.name.indexOf('模板：') === -1) {
          current.name = '模板：' + current.name
        }
      })
      this.usingTemplatesDtlData = []
      // 允许级联删除
      newVal.map(current => {
        if (current.id !== -1) {
          this.$api
            .getTemplateDtl('medi', current.id)
            .then(resp => {
              if (resp.data.code === 200) {
                let objects = resp.data.data
                objects.map(current => {
                  this.usingTemplatesDtlData.push(current)
                  this.newTemplateId--
                })
              }
            })
            .catch(failResponse => {
              console.log(failResponse)
            })
        }
      })
    }
  },
  mounted () {
    this.doc_id = this.$store.state.currentDocId
    this.$api
      .usableTemplateList(this.doc_id)
      .then(successResponse => {
        if (successResponse.data.code === 200) {
          let objects = successResponse.data.data
          console.log(successResponse.data.data)
          this.templateTableData = objects

          this.templateTableData.map(current => {
            if (current.range === 1) {
              current.range = '个人';
            } else if (current.range === 2) {
              current.range = '科室';
            } else if (current.range === 3) {
              current.range = '全院';
            }
          })
        }
      })
      .catch(failResponse => {
        console.log(failResponse)
      })
    this.newTemplateId = -1
  },
  data () {
    var validateQuantityValueInput = (rule, value, callback) => {
      let re = /^\+?[1-9][0-9]*$/
      if (!re.test(value)) {
        return callback(new Error('请输入正整数'))
      } else {
        callback()
      }
    }
    return {
      toApplyItem: [],
      usingTemplates: [],
      doc_id: '',
      templateTableData: [],
      templateDtlTableData: [],
      usingTemplatesDtlData: [],
      currentSelectingTemplate: {
        name: '',
        id: '',
        range: ''
      },
      checkParamsRule: {
        quantity: [{ validator: validateQuantityValueInput, trigger: 'blur' }]
      }
    }
  }
}
</script>
<style>
</style>
