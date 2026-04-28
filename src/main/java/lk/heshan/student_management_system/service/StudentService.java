package lk.heshan.student_management_system.service;

import lk.heshan.student_management_system.entity.Student;
import lk.heshan.student_management_system.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    //constructor injection
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }
    public Student getStudentById(Long id){
        return studentRepository.findById(id).orElse(null);
    }

    public Student updateStudent(Long id,Student newStudent){
        Student student=studentRepository.findById(id).orElse(null);

        if(student==null){
            return null;
        }
        student.setName(newStudent.getName());
        student.setEmail(newStudent.getEmail());
        student.setCourse(newStudent.getCourse());
        student.setAge(newStudent.getAge());

        return studentRepository.save(student);
    }
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }
}
