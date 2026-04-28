package lk.heshan.student_management_system.service;

import lk.heshan.student_management_system.entity.Student;
import lk.heshan.student_management_system.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    //constructore injection
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

    public Student addStudent(){

    }
    public List<Student> getAllStudent(){

    }
    public Student updateStudent(){

    }
    public void deleteStudent(){

    }
}
