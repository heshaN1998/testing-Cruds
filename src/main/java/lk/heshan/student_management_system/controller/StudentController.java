package lk.heshan.student_management_system.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lk.heshan.student_management_system.DTOs.StudentRequestDTOs;
import lk.heshan.student_management_system.DTOs.StudentResponseDTOs;
import lk.heshan.student_management_system.service.StudentService;
import lk.heshan.student_management_system.service.impl.ServiceIMPL;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@CrossOrigin("*")
@Tag(name="Student API",description = "CRUD operations for students")
public class StudentController {
    //constructor injection
    private final StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }
    @Operation(summary ="create new student")
    @PostMapping
    public StudentResponseDTOs create(@Valid @RequestBody StudentRequestDTOs dto){
        return studentService.createStudent(dto);
    }
    @Operation(summary ="return list of students")
    @GetMapping
    public List<StudentResponseDTOs> getAllStudents(){
        return studentService.getAllStudent();
    }
    @Operation(summary ="get specific student by Id")
    @GetMapping("/{id}")
    public StudentResponseDTOs getById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }
    @Operation(summary ="update a student")
    @PutMapping
    public StudentResponseDTOs updateStudent(@PathVariable Long id,@RequestBody StudentRequestDTOs dto){
        return studentService.updateStudent(id,dto);
    }
    @Operation(summary ="remove student")
    public String delete(@PathVariable Long id){
        studentService.delete(id);
        return "Student delete success";
    }



}
