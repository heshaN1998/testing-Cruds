package lk.heshan.student_management_system.controller;

import lk.heshan.student_management_system.DTOs.StudentRequestDTOs;
import lk.heshan.student_management_system.DTOs.StudentResponseDTOs;
import lk.heshan.student_management_system.service.StudentService;
import lk.heshan.student_management_system.service.impl.ServiceIMPL;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@CrossOrigin("*")
public class StudentController {
    //constructor injection
    private final StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }
    @PostMapping
    public StudentResponseDTOs create(@RequestBody StudentRequestDTOs dto){
        return studentService.createStudent(dto);
    }
    @GetMapping
    public List<StudentResponseDTOs> getAllStudents(){
        return studentService.getAllStudent();
    }
    @GetMapping("/{id}")
    public StudentResponseDTOs getById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }
    @PutMapping
    public StudentResponseDTOs updateStudent(@PathVariable Long id,@RequestBody StudentRequestDTOs dto){
        return studentService.updateStudent(id,dto);
    }
    public String delete(@PathVariable Long id){
        studentService.delete(id);
        return "Student delete success";
    }



}
