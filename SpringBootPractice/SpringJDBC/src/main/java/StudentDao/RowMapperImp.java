package StudentDao;

import StudentEntities.Student;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImp implements org.springframework.jdbc.core.RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt(1));
        student.setName(rs.getString(2));
        student.setCity(rs.getString(3));
        return student;
    }
}
