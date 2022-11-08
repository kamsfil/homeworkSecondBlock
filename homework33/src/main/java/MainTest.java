import lombok.extern.slf4j.Slf4j;
import java.sql.*;

@Slf4j
public class MainTest {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/homework";
        String userName = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, userName, password)) {

            Statement statement = connection.createStatement();
            PreparedStatement students = connection.prepareStatement("SELECT * FROM homework.students");
            ResultSet resultSet = students.executeQuery();

            while (resultSet.next()) {
                log.info("Student found: id = {}, first name  = {}, last name = {}, courses = {}, faculty = {}",
                        resultSet.getLong("id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getLong("courses"),
                        resultSet.getString("faculty")
                );

//                changing_existing_tables.StudentTableChange.updateAddressId(connection);
//                changing_existing_tables.StudentTableChange.studentAdd(connection,"Sanichka","Kaminski",5,"biologi",1);
//                changing_existing_tables.StudentTableChange.studentDelete(connection,10);
//
//                changing_existing_tables.CityTableChange.cityAdd(connection,"Minsk");
//                changing_existing_tables.CityTableChange.cityDelete(connection, 10);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}