package lk.heshan.student_management_system.service;

import lk.heshan.student_management_system.DTOs.StudentRequestDTOs;
import lk.heshan.student_management_system.DTOs.StudentResponseDTOs;
import org.springframework.data.domain.Page;

import java.util.List;

public interface StudentService {
    StudentResponseDTOs createStudent(StudentRequestDTOs dto);

    StudentResponseDTOs getStudentById(Long id);
    StudentResponseDTOs updateStudent(Long id,StudentRequestDTOs dto);
    void delete(Long id);
    Page<StudentResponseDTOs> getStudents(int page,int size);
    Page<StudentResponseDTOs> searchStudent(String name,int page,int size);


}
