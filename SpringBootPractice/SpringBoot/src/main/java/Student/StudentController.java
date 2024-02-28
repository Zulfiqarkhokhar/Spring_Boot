package Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
public class StudentController {

//    private final StudentService studentService;
//    //@Autowired
//    public StudentController(StudentService studentService) {
//        this.studentService = new StudentService();
//    }

//    @GetMapping
//    public List<Student> getStudent(){
//        return studentService.getStudent();
//    }

    @GetMapping
    public List<Student> getStudent(){
        return List.of(
                new Student( 22,"Zulfiqar Ali","zulfiqarali.bscssef20@iba-suk.edu.pk", LocalDate.of(1999, Month.OCTOBER,8),23)
        );
    }
}
