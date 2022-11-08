import humanCRUD.HumanCRUD;
import lombok.extern.slf4j.Slf4j;

import java.sql.*;

@Slf4j
public class Test {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/homework";
        String userName = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
            log.info("Database connection successful");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
