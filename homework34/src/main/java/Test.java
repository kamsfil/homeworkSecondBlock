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

//            HumanCRUD.updateHumanProperty_id(connection);
            HumanCRUD.humanCreate(connection,"ggggggg","ssssssss",200,1);
//            HumanCRUD.humanRead(connection);
//            HumanCRUD.humanDelete(connection);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
