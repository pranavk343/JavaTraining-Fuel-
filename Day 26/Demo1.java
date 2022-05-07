import java.sql.Connection;

class MySQLHelper {
    public static Connection getMySqlDBConnection() {
        // get MySql DB connection using connection parameters
        return null;
    }
}

class OracleHelper {

    public static Connection getOracleDBConnection() {
        // get Oracle DB connection using connection parameters
        return null;
    }
}

class HelperFacade {
    static Connection getConnection(String type) {
        Connection con = null;
        if (type.equals("oracle")) {
            con = OracleHelper.getOracleDBConnection();
        } else if (type.equals("mysql")) {
            con = MySQLHelper.getMySqlDBConnection();
        }
        return con;
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Connection con;
        con = HelperFacade.getConnection("oracle");
        System.out.println(con);
    }
}
