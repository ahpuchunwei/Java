package com.jxnu.app.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUnit {

    //表示数据库的连接对象
    private static Connection conn = null;
    public static String DBDRIVER = "com.mysql.jdbc.Driver";
    //连接地址是由各个数据库生产商单独提供的，所以需要单独记住
    public static String DBURL = "jdbc:mysql://127.0.0.1:80/union_cps";
    //连接数据库的用户名
    public static String DBUSER = "username";
    //连接数据库的密码
    public static String DBPASS = "password";


    public static Connection getConnection() {
        try {
            //1、使用CLASS 类加载驱动程序
            Class.forName(DBDRIVER);
            //2、连接数据库
            conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
