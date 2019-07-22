package com.neu.his.service;

import com.neu.his.Dao.RegistrationMapper;
import com.neu.his.entity.RegistrationEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RegistrationService {
    @Autowired
    RegistrationMapper registrationMapper;
    /**
     * 根据病历号获取患者挂号记录;用户输入病历号，点击“搜索”，表格中列出当日，当前病历号下的所有挂号信息，
     * TODO:可以采用JSTL标签库的循环标签输出挂号列表，要求分页显示。
     * @return
     */
    public List<RegistrationEntity> findAllRegistrationByCaseNo(int c){
        return registrationMapper.findAllByCaseNo(c);
    }

    /**
     * 选择某一行的挂号信息，点击退号，对退号操作进行校验，已经看诊的，不能退号，已经退号的，不能二次退号，退号成功，弹出提示框。
     * “已退号”状态不能进行后续操作，如缴费，退费等
     */
    public int unregister(int c){
        return 0;
    }

    /**
     * 用于挂号页面，展示医生当天待诊 / 已诊断
     * @return
     */
    public List<RegistrationEntity> findAllRegistrationByCaseNo(Date d, int i){
        return registrationMapper.findAllByRegTimeAndInspectionStatus(d,i);
    }

    public RegistrationEntity findFirstByCaseNo(int c) {
        return registrationMapper.findFirstByCaseNo(c);
    }

    /**
     * 找出当前病历号最大者
     * @return
     */
    public int findCurrentMaxCaseNo(){
        return registrationMapper.findTopByOrderByCaseNoDesc().getCaseNo();
    }


    /**
     * 调用挂号存储过程
     * @return
     */
    public int register(String rpid,String rname,int rsex,String rbirth,String raddr,String rinsdate,String rnoon,int rdept,int rdoc,int rrlevel,int rsettle,int rneed,int roper){
        ///1.获得session对象
        Configuration con = new Configuration();
        con.configure();
        SessionFactory sf = con.buildSessionFactory();
        Session session= sf.openSession();
        //2.设置查询过程字符串
        String procName="{Call reg(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        //3.创建本地查询对象传入过程查询字符串
        Query sqlquery = session.createQuery(procName);
        sqlquery.setParameter(0,rpid);
        sqlquery.setParameter(1,rname);
        sqlquery.setParameter(2,rsex);
        sqlquery.setParameter(3,rbirth);
        sqlquery.setParameter(4,raddr);
        sqlquery.setParameter(5,rinsdate);
        sqlquery.setParameter(6,rnoon);
        sqlquery.setParameter(7,rdept);
        sqlquery.setParameter(8,rdoc);
        sqlquery.setParameter(9,rrlevel);
        sqlquery.setParameter(10,rsettle);
        sqlquery.setParameter(11,rneed);
        sqlquery.setParameter(12,roper);
        //5.执行过程返回结果集合回结果集合
        List<Integer> list = sqlquery.list();
        //6.关闭session对象
        session.close();
        sf.close();
        return list.get(0);
    }
}
