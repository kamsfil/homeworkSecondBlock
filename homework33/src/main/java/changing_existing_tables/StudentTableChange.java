package changing_existing_tables;

import lombok.extern.slf4j.Slf4j;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Slf4j
public final class StudentTableChange extends UtilSQL {

    public static void studentDelete(Connection connection, Integer id) {

        try {
            PreparedStatement insertStudent = connection.prepareStatement(UtilSQL.DELETE_STUDENT);
            insertStudent.setInt(1, id);

            int insertRows = insertStudent.executeUpdate();
            log.info("Delete {} row", insertRows);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void studentAdd(Connection connection, String firstName, String lastName, Integer courses, String faculty, Integer addressId) {
        try {
            PreparedStatement insertStudent = connection.prepareStatement(UtilSQL.INSERT_STUDENT);
            insertStudent.setString(1, firstName);
            insertStudent.setString(2, lastName);
            insertStudent.setInt(3, courses);
            insertStudent.setString(4, faculty);
            insertStudent.setInt(5, addressId);

            int insertRows = insertStudent.executeUpdate();
            log.debug("Inserted {} row", insertRows);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void updateAddressId (Connection connection){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CITY);
            int insertRows = 0;
            for (int i = 1; i < 10 ; i++){
                preparedStatement.setInt(1,i);
                preparedStatement.setInt(2,i);
                insertRows = preparedStatement.executeUpdate();
            }
            log.debug("Update {} row", insertRows);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}