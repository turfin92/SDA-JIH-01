package ppl.sda;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sakila?serverTimezone=Europe";

    private static final String USER = "root";
    private static final String PASSWORD = "Kamehameha92";

    public static void  returnAllActors() {

    }

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Hello");
        // Class.forName("com.mysql.jc.jdbc.Driver");
        try {
            MysqlDataSource ds = new MysqlDataSource();
            ds.setUrl(DB_URL);
            ds.setUrl(USER);
            ds.setUrl(PASSWORD);
          //  Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM actor");
            while(rs.next()) {
                System.out.println(rs.getString("actor_id"));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
