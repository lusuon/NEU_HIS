package com.neu.his.dao;

import com.neu.his.entity.RegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface RegistrationMapper extends JpaRepository<RegistrationEntity,Integer> {
    /**
     * 通过病历号获取
     * @param c
     * @return
     */
    public List<RegistrationEntity> findAllByCaseNo(int c);

    /**
     * 通过病历号获取患者个人信息
     * @param c
     * @return
     */
    public RegistrationEntity findFirstByCaseNo(int c);
    /**
     * TODO:通过时间与状态查找
     * 当前使用的不能查找到当日
     * @return
     */
    public List<RegistrationEntity> findAllByRegTimeAndInspectionStatus(Date d,int i);

    /**
     * 找出最大病历号
     * @return
     */
    public RegistrationEntity findTopByOrderByCaseNoDesc();

    /**
     * 找出该医生当日待诊断 / 已诊断患者
     * @param d
     * @param i
     * @return
     */
    @Query("select r from RegistrationEntity r where r.doctorId = ?1 and (r.seeDate = current_date) and r.inspectionStatus =?2 ")
    List<RegistrationEntity> findPatients(int d,int i);

    @Query(value = "call reg(:i1,:i2,:i3,:i4,:i5,:i6,:i7,:i8,:i9,:i10,:i11,:i12,:i13)", nativeQuery = true)
    Integer register(@Param("i1") String rpid,
                @Param("i2") String rname,
                @Param("i3") int rsex,
                @Param("i4") String rbirth,
                @Param("i5") String raddr,
                @Param("i6") String rinsdate,
                @Param("i7") String rnoon,
                @Param("i8") int rdept,
                @Param("i9") int rdoc,
                @Param("i10") int rrlevel,
                @Param("i11") int rsettle,
                @Param("i12") int rneed,
                @Param("i13") int roper
    );

    /**
     * 选择某一行的挂号信息，点击退号，对退号操作进行校验，已经看诊的，不能退号，已经退号的，不能二次退号，退号成功，弹出提示框。
     *      * “已退号”状态不能进行后续操作，如缴费，退费等
     * @param unreg_id
     * @return
     */
    @Query(value = "call unreg(:i1)",nativeQuery = true)
    Integer unregister(@Param("i1") int unreg_id);

    /**
     *s 调用挂号存储过程(hibernate ver)
     * @return
     * public static boolean register(String rpid,String rname,int rsex,String rbirth,String raddr,String rinsdate,String rnoon,int rdept,int rdoc,int rrlevel,int rsettle,int rneed,int roper){
     *         //1.获得session对象
     *         Configuration con = new Configuration();
     *         con.configure();
     *         SessionFactory sf = con.buildSessionFactory();
     *         Session session= sf.openSession();
     *         //2.设置查询过程字符串
     *         String procName = "{call reg(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
     *         //3.创建本地查询对象传入过程查询字符串
     *         Query sqlquery = session.createSQLQuery(procName);
     *         sqlquery.setParameter(0,rpid);
     *         sqlquery.setParameter(1,rname);
     *         sqlquery.setParameter(2,rsex);
     *         sqlquery.setParameter(3,rbirth);
     *         sqlquery.setParameter(4,raddr);
     *         sqlquery.setParameter(5,rinsdate);
     *         sqlquery.setParameter(6,rnoon);
     *         sqlquery.setParameter(7,rdept);
     *         sqlquery.setParameter(8,rdoc);
     *         sqlquery.setParameter(9,rrlevel);
     *         sqlquery.setParameter(10,rsettle);
     *         sqlquery.setParameter(11,rneed);
     *         sqlquery.setParameter(12,roper);
     *         //5.执行过程返回结果集合回结果集合
     *         List<Boolean> list = sqlquery.list();
     *         //6.关闭session对象
     *         session.close();
     *         sf.close();
     *         return list.get(0);
     *     }
     */

    /**
     *
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
     */
}
