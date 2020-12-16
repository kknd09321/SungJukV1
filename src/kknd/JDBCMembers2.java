package kknd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCMembers2 {

    public static void main(String[] args) {
        //JDBC 관련 변수
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "insert into book_members values (?,?,?,?)";

        Scanner sc = new Scanner(System.in);

        System.out.print("회원번호 입력: ");
        int custid = Integer.parseInt(sc.nextLine());
        System.out.print("회원이름 입력: ");
        String name = sc.nextLine();
        System.out.print("회원주소 입력: ");
        String address = sc.nextLine();
        System.out.print("회원번호 입력: ");
        String phone = sc.nextLine();

        //입력받은 회원정보를 ㅌ케이블에 저장
        conn = JDBCUtil.makeConn();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,custid);
            pstmt.setString(2,name);
            pstmt.setString(3,address);
            pstmt.setString(4,phone);

            int cnt = pstmt.executeUpdate();
            if (cnt > 0 ) System.out.println("회원정보 추가완료");
        } catch (SQLException ex) {
            System.out.println("JDBC 질의문 생성 오류");
        }
        JDBCUtil.destroyConn(conn,pstmt);
    }
}
