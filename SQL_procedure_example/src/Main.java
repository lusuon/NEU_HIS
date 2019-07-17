import java.sql.*;

public class Main {
    public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://127.0.0.1:3306/neu_his";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "qpalzm";

    public static void main(String[] args) throws Exception {
        /* 模拟流程：
            1. 挂号：检验操作后是否搜索到应插入记录
            2. 退号：检查挂号记录是否更新
            3. 医生看诊：检查信息插入、挂号更新
            4. 医生开药
            5. 患者缴费
            6. 药房发药
            7. 患者退费
         */
        Class.forName(DRIVER_CLASS);
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        Main m = new Main();
        m.testAll(connection);
    }

    public void testReg(Connection connection,String pid,String name,int sex,String birth,String addr,String ins_date,String noon,int dept_id,int doctor_id,int reg_level_id,int settlement,int need,int opid) throws SQLException {
        /*
            检查标准：插入元组与参数一致
         */
        String sql = "{CALL pro_num_user(?,?,?,?,?,?,?,?,?,?,?)}"; //调用存储过程
        CallableStatement cstm = connection.prepareCall(sql); //实例化对象cstm
        cstm.setString(1, pid); //存储过程输入参数
        cstm.setString(2, name); //存储过程输入参数
        cstm.setInt(3,sex); //存储过程输入参数
        cstm.setString(4, birth); //存储过程输入参数
        cstm.setString(5, addr); //存储过程输入参数
        cstm.setString(6, ins_date); //存储过程输入参数
        cstm.setString(7, noon); //存储过程输入参数
        cstm.setInt(8, dept_id); //存储过程输入参数
        cstm.setInt(9,doctor_id); //存储过程输入参数
        cstm.setInt(10, reg_level_id); //存储过程输入参数
        cstm.setInt(11, settlement); //存储过程输入参数
        cstm.setInt(12, need); //存储过程输入参数
        cstm.setInt(13, opid); //存储过程输入参数
        cstm.registerOutParameter(2, Types.INTEGER); // 设置返回值类型 即返回值
        cstm.execute(); // 执行存储过程
        System.out.println(cstm.getInt(2));
        cstm.close();
    }

    public void testUnReg(Connection connection,int unRegId) throws SQLException {
        String sql = "{CALL pro_num_user(?)}"; //调用存储过程
        CallableStatement cstm = connection.prepareCall(sql); //实例化对象cstm
        cstm.setInt(1, unRegId); //存储过程输入参数
        cstm.registerOutParameter(2, Types.INTEGER); // 设置返回值类型 即返回值
        cstm.execute(); // 执行存储过程
        cstm.close();
    }

    public void testDiag(Connection connection ){
        String sql = "{CALL pro_num_user(?,?)}"; //调用存储过程
        //CallableStatement cstm = connection.prepareCall(sql); //实例化对象cstm
        //cstm.setString(1, "name"); //存储过程输入参数
        //cstm.registerOutParameter(2, Types.INTEGER); // 设置返回值类型 即返回值
        //cstm.execute(); // 执行存储过程
        //System.out.println(cstm.getInt(2));
        //cstm.close();
    }

    public void testGenPre(Connection connection){
        String sql = "{CALL pro_num_user(?,?)}"; //调用存储过程
        //CallableStatement cstm = connection.prepareCall(sql); //实例化对象cstm
        //cstm.setString(1, "name"); //存储过程输入参数
        //cstm.registerOutParameter(2, Types.INTEGER); // 设置返回值类型 即返回值
        //cstm.execute(); // 执行存储过程
        //System.out.println(cstm.getInt(2));
        //cstm.close();
    }

    public void testPayMed(Connection connection){
        String sql = "{CALL pro_num_user(?,?)}"; //调用存储过程
        //CallableStatement cstm = connection.prepareCall(sql); //实例化对象cstm
        //cstm.setString(1, "name"); //存储过程输入参数
        //cstm.registerOutParameter(2, Types.INTEGER); // 设置返回值类型 即返回值
        //cstm.execute(); // 执行存储过程
        //System.out.println(cstm.getInt(2));
        //cstm.close();
    }

    public void testUnPayMed(Connection connection){
        String sql = "{CALL pro_num_user(?,?)}"; //调用存储过程
        //CallableStatement cstm = connection.prepareCall(sql); //实例化对象cstm
        //cstm.setString(1, "name"); //存储过程输入参数
        //cstm.registerOutParameter(2, Types.INTEGER); // 设置返回值类型 即返回值
        //cstm.execute(); // 执行存储过程
        //System.out.println(cstm.getInt(2));
        //cstm.close();
    }

    public void testReleaseMed(Connection connection){
        String sql = "{CALL release_med(?,?)}"; //调用存储过程
        //CallableStatement cstm = connection.prepareCall(sql); //实例化对象cstm
        //cstm.setString(1, "name"); //存储过程输入参数
        //cstm.registerOutParameter(2, Types.INTEGER); // 设置返回值类型 即返回值
        //cstm.execute(); // 执行存储过程
        //System.out.println(cstm.getInt(2));
        //cstm.close();
    }

    public void testAll(Connection connection) throws SQLException {

        testReg(connection,"510101199008166543","a",71,"2019-06-23","a","2019-07-14","中午",1,1,1,1,0,1);
    }
}