package humanCRUD;

public class UtilSQL {

    protected static final String UPDATE_HUMAN_ID = "UPDATE homework.human SET property_id = ? WHERE id = ?;";
    protected static final String INSERT_HUMAN = "INSERT INTO homework.human (first_name, last_name, age, property_id) VALUES (?,?,?,?);";
    protected static final String UPDATE_HUMAN = "UPDATE homework.human SET first_name = ?, last_name = ?, age = ?, property_id  = ? WHERE id = ?;";
    protected static final String DELETE_HUMAN = "DELETE FROM homework.human WHERE id = ?;";
    protected static final String READ_HUMAN = "SELECT * FROM homework.human WHERE id = ?;";
}
