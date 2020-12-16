package kknd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCOrders3b {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "select * from book_orders where orderid = ?";
        String fmt = "%d %d %d %d %s\n";
        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        System.out.print("주문번호: ");
        int orderid = sc.nextInt();

        conn = JDBCUtil.makeConn();
        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()){
                int orid = rs.getInt(1);
                int cuid = rs.getInt(2);
                int bkid = rs.getInt(3);
                int sprice = rs.getInt(4);
                String ordate = rs.getString(5);

                String result = String.format(fmt,
                        orid,cuid,bkid,sprice,ordate);
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
