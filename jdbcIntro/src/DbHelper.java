import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String userName="root";
    private String password="12345";
    private String dbUrl="jdbc:mysql://localhost:3306/world_x";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, userName, password); //DriverManager bizim connector'lere erişmemizi sağlayan class
    }
    public void showErrorMessage(SQLException exception){
        System.out.println("error: "+exception.getMessage());
        System.out.println("error code:"+exception.getErrorCode());
    }
}
