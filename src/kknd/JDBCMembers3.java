package kknd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCMembers3 {

    public static void main(String[] args) {
        //book_members테이블의 저장된 모든 내용을 출력함
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "select * from book_members";
        String fmt = "%s %s %s %s\n";
        StringBuilder sb = new StringBuilder();

        conn = JDBCUtil.makeConn();
        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()){
                String custid = rs.getString(1);
                String name = rs.getString(2);
                String address = rs.getString(3);
                String phone = rs.getString(4);

                String result = String.format(fmt,
                        custid,name,address,phone);
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
