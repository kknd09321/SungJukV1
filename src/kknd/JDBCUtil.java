package kknd;

import java.sql.*;

public class JDBCUtil {

    //JDBC 드라이버 초기화 및 Connection 객체 생성
    public static Connection makeConn() {
        String DRV = "org.mariadb.jdbc.Driver";
        String URL = "jdbc:mariadb://mariadb.cce2dytgxcvh.ap-northeast-2.rds.amazonaws.com:3306/playground";
        String USR = "playground";
        String PWD = "playground2020";

        Connection conn = null;
        try {
            Class.forName(DRV);
            conn = DriverManager.getConnection(URL, USR, PWD);
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버가 없어요");
        } catch (SQLException e) {
            System.out.println("JDBC 연결실패");
        }
        return conn;
    }

    //JDBC 관련객체 해제
    public static void destroyConn(Connection conn, PreparedStatement pstmt) {
        if (pstmt != null) try {
            pstmt.close();
        } catch (SQLException ex) {
        }

        if (conn != null) try {
            conn.close();
        } catch (SQLException ex) {
        }
    }

    public static void destroyConn(Connection conn, PreparedStatement pstmt, ResultSet rs) {
        if (rs != null) try {
            rs.close();
        } catch (SQLException ex) { }

        destroyConn(conn,pstmt);
    }
}