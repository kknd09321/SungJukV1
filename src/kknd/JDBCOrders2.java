package kknd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCOrders2 {
    public static void main(String[] args) {
        //
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "insert into book_orders values  (?,?,?,?,?)";

        Scanner sc = new Scanner(System.in);

        //주문정보 입력받기
        System.out.print("주문번호 입력: ");
        int orderid = Integer.parseInt(sc.nextLine());
        System.out.print("고객번호 입력: ");
        int custid = Integer.parseInt(sc.nextLine());
        System.out.print("도서번호 입력: ");
        int bookid = Integer.parseInt(sc.nextLine());
        System.out.print("도서가격 입력: ");
        int saleprice = Integer.parseInt(sc.nextLine());
        System.out.print("주문날짜 입력: ");
        String orderdate = sc.nextLine();

        //
        conn = JDBCUtil.makeConn();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,orderid);
            pstmt.setInt(2,custid);
            pstmt.setInt(3,bookid);
            pstmt.setInt(4,saleprice);
            pstmt.setString(5,orderdate);
            int cnt = pstmt.executeUpdate();
            if (cnt > 0 ) System.out.println("주문정보 생성완료");
        } catch (SQLException ex) {
            System.out.println("JDBC 질의문 생성 오류");
        }
        JDBCUtil.destroyConn(conn, pstmt);
    }
}
