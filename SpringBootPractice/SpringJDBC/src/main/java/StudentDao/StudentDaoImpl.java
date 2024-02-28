package StudentDao;

import StudentEntities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("dao")
public class StudentDaoImpl implements StudentDao{

    //@Autowired
    JdbcTemplate template = new JdbcTemplate();
    @Override
    public int insert(Student student) {
        String query = "insert into student(id,name,city) values(?,?,?)";

        int result = template.update(query,student.getId(),student.getName(),student.getCity());
        return result;
    }

    public int change(Student student){

        String query = "Update student set name=? , city=? where id = ?";
        int result = template.update(query,student.getName(),student.getCity(),student.getId());
        return result;
    }

    @Override
    public int delete(int id) {
        String query = "delete from student where id=?";
        int result = template.update(query,id);
        return result;
    }

    @Override
    public Student getStudent(int id) {
        String query = "select * from student where id=?";
        Student student = new Student();
        RowMapper<Student> rowMapper = new RowMapperImp();
        student = template.queryForObject(query,rowMapper,id);
        return student;
    }

    @Override
    public List<Student> getAllStudent() {
        String query = "select * from student";
        List<Student> students = template.query(query,new RowMapperImp());
        return students;
    }

    public JdbcTemplate getTemplate() {
        return template;
    }

    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
}
