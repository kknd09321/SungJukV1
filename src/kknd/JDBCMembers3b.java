package kknd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCMembers3b {
    //회원이름으로 회원정보 조회
    public static void main(String[] args) {
      //
      Connection conn = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;

      String sql = "select * from book_members where name =?";
      String fmt = "%s %s %s %s\n";
      StringBuilder sb = new StringBuilder();

      //
      Scanner sc = new Scanner(System.in);
      System.out.print("고객이름: ");
      String cname = sc.nextLine();

      //
      conn = JDBCUtil.makeConn();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,cname);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String custid = rs.getString(1);
                String name = rs.getString(2);
                String addr = rs.getString(3);
                String phone = rs.getString(4);
                String result = String.format(fmt,
                        custid, name, addr, phone);
                sb.append(result);
            }
        } catch (SQLException ex) {
            System.out.println("JDBC 질의문 생성 오류");
        }
        JDBCUtil.destroyConn(conn,pstmt,rs);

        //
        System.out.println(sb.toString());

    }
}
