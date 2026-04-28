package lk.heshan.student_management_system.controller;

import lk.heshan.student_management_system.entity.Student;
import lk.heshan.student_management_system.service.StudentServicess;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/api/Students")
@CrossOrigin("*")
public class StudentController {
    private final StudentServicess studentService;

    public StudentController(StudentServicess studentService){
        this.studentService=studentService;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id,@RequestBody Student student){
        return studentService.updateStudent(id,student);


    }
    @DeleteMapping
    public  String deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return "deleted success";
    }
}
