package com.neu.his.Dao.impls;

import com.neu.his.Dao.interfaces.RegistrationMapper;
import com.neu.his.entity.RegistrationEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;


public abstract class RegistrationImpl implements RegistrationMapper {

    /**
     * 调用挂号存储过程
     * @return
     */
    public static boolean register(String rpid,String rname,int rsex,String rbirth,String raddr,String rinsdate,String rnoon,int rdept,int rdoc,int rrlevel,int rsettle,int rneed,int roper){
        //1.获得session对象
        Configuration con = new Configuration();
        con.configure();
        SessionFactory sf = con.buildSessionFactory();
        Session session= sf.openSession();
        //2.设置查询过程字符串
        String procName = "{call reg(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        //3.创建本地查询对象传入过程查询字符串
        Query sqlquery = session.createSQLQuery(procName);
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
        List<Boolean> list = sqlquery.list();
        //6.关闭session对象
        session.close();
        sf.close();
        return list.get(0);
    }

    /**
     * 选择某一行的挂号信息，点击退号，对退号操作进行校验，已经看诊的，不能退号，已经退号的，不能二次退号，退号成功，弹出提示框。
     * “已退号”状态不能进行后续操作，如缴费，退费等
     */
    public static boolean unregister(int unreg_id){
        //1.获得session对象
        Configuration con = new Configuration();
        con.configure();
        SessionFactory sf = con.buildSessionFactory();
        Session session= sf.openSession();

        //2.设置查询过程字符串
        String procName = "{call unreg(?)}";
        //3.创建本地查询对象传入过程查询字符串
        Query sqlquery = session.createSQLQuery(procName);
        sqlquery.setParameter(0,unreg_id);
        //5.执行过程返回结果集合回结果集合
        List<Boolean> list = sqlquery.list();
        //6.关闭session对象
        session.close();
        sf.close();
        return list.get(0);
    }
}
