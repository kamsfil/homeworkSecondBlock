package changing_existing_tables;

public class UtilSQL {

    protected static final String INSERT_STUDENT = "INSERT INTO homework.students (first_name, last_name, courses, faculty, address_id) VALUES (?,?,?,?,?);";
    protected static final String DELETE_STUDENT = "DELETE FROM homework.students WHERE id = ?;";
    protected static final String INSERT_CITY = "INSERT INTO homework.city (town) VALUES (?);";
    protected static final String DELETE_CITY = "DELETE FROM homework.city WHERE id = ?;";
    protected static final String UPDATE_CITY = "UPDATE students SET address_id = ? WHERE id = ?;";
}
