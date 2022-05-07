import java.sql.*;
import java.util.Scanner;

public class First {
    public static void main(String[] args) throws Exception{
        Scanner ob = new Scanner(System.in);
        int id;
        String name, username, pass;
        System.out.println("Enter username : ");
        username = ob.next();
        System.out.println("Enter password: ");
        pass = ob.next();
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test",username,pass);
        System.out.println("Connection Done!");
        Statement stmt = conn.createStatement();
        System.out.println("Enter id : ");
        id = ob.nextInt();
        System.out.println("Enter name : ");
        name = ob.next();
        String sql = "insert into student values("+id+",'"+name+"')";
        stmt.executeUpdate(sql);
        System.out.println("Record Inserted");
        conn.close();
    }
}
