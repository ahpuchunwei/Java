package com.jxnu.app.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by puchunwei on 16/5/18.
 */
public class JdbcDemo {

    public static void main(String[] args) throws Exception {
        // SQL语句
        String sql = "select * from union_cps.shop_keeper where shop_keeper_id=2000059001;";
        // 连接数据库
        Connection conn = JDBCUnit.getConnection();
        // 表示数据库更新操作
        PreparedStatement pstmt = conn.prepareStatement(sql);
        // 执行SQL语句
        ResultSet result = pstmt.executeQuery();

        // 输出执行结果
        while (result.next()) {
            long tbUserId = result.getLong("ori_member_id");
            System.out.println("tbUserId: " + tbUserId);

            String shopTitle = result.getString("shop_title");
            System.out.println("shopTitle: " + shopTitle);
        }

        // 关闭数据库
        result.close();
        pstmt.close();
        conn.close();
    }

}
