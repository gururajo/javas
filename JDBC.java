/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author #HP
 */

import java.sql.*;


public class JDBC {
    public static void main(String args[]) {
        Connection con = null;
        Statement stmt = null;
        String qry;
        ResultSet res;
        try {
            Class.forName("con.sql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:MySql://localhost:3306/student", "root", "root");
            stmt = con.createStatement();
            stmt.executeUpdate("Insert into stud values(5,'eee','CS5')");
            stmt.executeUpdate("Insert into stud values(6,'eee','CS6')");
            stmt.executeUpdate("Insert into stud values(7,'eee','CS7')");
            qry = "Select * from stud";
            res = stmt.executeQuery(qry);
            while (res.next()) {
                int r = res.getInt(1);
                String n = res.getString(2);
                String u = res.getString(3);
                System.out.println("roll" + r + "name" + n + "usn" + u);
            }
        } catch (Exception e) {
            System.out.println("error" + e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Error" + ex);
            }
        }
    }
}
