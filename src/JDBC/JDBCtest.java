
import java.sql.*;

public class JDBCtest {
    static final String DRIVER = "org.h2.Driver";
    static final String URL = "jdbc:h2:~/tests111";
    static final String USER = "";
    static final String PASS = "";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASS);
            statement = connection.createStatement();
            statement.execute("create SCHEMA if not exists STUDENTS");
            statement.execute("use STUDENTS");
            statement.executeUpdate("create table if not exists students (id int primary key auto_increment, firstname varchar(50), lastname varchar(50));");
            statement.executeUpdate("create table if not exists progress (student_id int primary key auto_increment, math int, physics int, programming int)");
            statement.executeUpdate("INSERT INTO students VALUES (1, 'Ogyrec', 'Ogyrechnui')");
            statement.executeUpdate("INSERT INTO students VALUES (2, 'Arsen', 'Jeep')");
            statement.executeUpdate("INSERT INTO students VALUES (3, 'Ricck', 'Morty')");

            statement.executeUpdate("INSERT INTO progress VALUES (1,2,3,4)");
            statement.executeUpdate("INSERT INTO progress VALUES (2,4,3,2)");
            statement.executeUpdate("INSERT INTO progress VALUES (3,4,5,3)");


            try (ResultSet result = statement.executeQuery("SELECT * FROM students.students WHERE id in (SELECT student_id FROM students.progress WHERE math = 2);");) {
                while (result.next()) {
                    String firstName = result.getString("firstname");
                    System.out.println(firstName + " has 2 in math");
                }
            }

            try (ResultSet result1 = statement.executeQuery("SELECT * FROM students.students WHERE id in (SELECT student_id FROM students.progress WHERE physics > math);");) {
                while (result1.next()) {
                    String firstName1 = result1.getString("firstname");
                    System.out.println(firstName1 + " has physics > math");
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

