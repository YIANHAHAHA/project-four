package com.example.Util;

import java.sql.Connection;
import java.sql.DriverManager;


public class JDBCUtil {
	 private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	    private static final String URL = "jdbc:mysql://localhost:3306/experiment?useSSL=false&serverTimezone=UTC&useUnicode=true&characterEncoding=utf8";
	    private static final String USER = "root";         // 你的 MySQL 账号
	    private static final String PWD = "zxcv1234.";        // 你的 MySQL 密码

	    static {
	        try {
	            Class.forName(DRIVER);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public static Connection getConnection() throws Exception {
	        return DriverManager.getConnection(URL, USER, PWD);
	    }

	    // 关闭资源
	    public static void close(AutoCloseable... res) {
	        for (AutoCloseable r : res) {
	            if (r != null) {
	                try {
	                    r.close();
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }
}
