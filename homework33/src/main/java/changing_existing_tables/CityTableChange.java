package changing_existing_tables;

import lombok.extern.slf4j.Slf4j;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Slf4j
public final class CityTableChange extends UtilSQL {

    public static void cityAdd(Connection connection, String town) {
        try {
            PreparedStatement insertCity = connection.prepareStatement(UtilSQL.INSERT_CITY);
            insertCity.setString(1, town);

            int insertRows = insertCity.executeUpdate();
            log.debug("Inserted {} row", insertRows);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void cityDelete(Connection connection, Integer id) {
        try {
            PreparedStatement insertCity = connection.prepareStatement(UtilSQL.DELETE_CITY);
            insertCity.setInt(1, id);

            int insertRows = insertCity.executeUpdate();
            log.info("Delete {} row", insertRows);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}