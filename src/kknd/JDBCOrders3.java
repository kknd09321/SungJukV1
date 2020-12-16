package kknd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCOrders3 {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "select * from book_orders";
        String fmt = "%s %s %s %s %s\n";
        StringBuilder sb = new StringBuilder();

        conn = JDBCUtil.makeConn();
        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()){
                int oid = rs.getInt(1);
                int cid = rs.getInt(2);
                int bid = rs.getInt(3);
                int price = rs.getInt(4);
                String date = rs.getString(5);

                String result = String.format(fmt,
                        oid,cid,bid,price,date);
                sb.append(result);
            }
        } catch (SQLException ex) {
            System.out.println("JDBC 질의문 생성오류");
        }
        JDBCUtil.destroyConn(conn,pstmt,rs);

        //
        System.out.println(sb.toString());
    }
}
