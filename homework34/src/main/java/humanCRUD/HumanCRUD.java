package humanCRUD;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Slf4j
public class HumanCRUD extends UtilSQL {

    public static void humanCreate(Connection connection,String first_name,String last_name,Integer age,Integer property_id) {
        try {
            PreparedStatement prStatement = connection.prepareStatement(INSERT_HUMAN);
            prStatement.setString(1, first_name);
            prStatement.setString(2, last_name);
            prStatement.setInt(3, age);
            prStatement.setInt(4, property_id);

            int insertRows = prStatement.executeUpdate();
            log.debug("Successfully create {} row", insertRows);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void humanRead (Connection connection, Integer id) {
        try {
            PreparedStatement prStatement = connection.prepareStatement(READ_HUMAN);
            prStatement.setInt(1,id);
            ResultSet resultSet = prStatement.executeQuery();
            while (resultSet.next()){
                log.info("Human, first name = {}, last name = {}, age = {}",
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getInt("age")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void humanUpdate(Connection connection,String first_name,String last_name,Integer age,Integer property_id, Integer id) {
        try {
            PreparedStatement prStatement = connection.prepareStatement(UPDATE_HUMAN);
            prStatement.setString(1, first_name);
            prStatement.setString(2, last_name);
            prStatement.setInt(3, age);
            prStatement.setInt(4, property_id);
            prStatement.setInt(5, id);

            int insertRows = prStatement.executeUpdate();
            log.debug("Successfully read {} row", insertRows);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void humanDelete(Connection connection, Integer id) {
        try {
            PreparedStatement prStatement = connection.prepareStatement(DELETE_HUMAN);
            prStatement.setInt(1, id);

            int insertRows = prStatement.executeUpdate();
            log.debug("Successfully delete {} row", insertRows);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void updateHumanProperty_id(Connection connection) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_HUMAN_ID);
            int insertRows = 0;
            for (int i = 1; i < 8; i++) {
                preparedStatement.setInt(1, i);
                preparedStatement.setInt(2, i);
                insertRows = preparedStatement.executeUpdate();
            }
            log.debug("Update {} row", insertRows);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}