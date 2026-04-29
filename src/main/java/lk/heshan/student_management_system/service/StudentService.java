package lk.heshan.student_management_system.service;

import lk.heshan.student_management_system.DTOs.StudentRequestDTOs;
import lk.heshan.student_management_system.DTOs.StudentResponseDTOs;

import java.util.List;

public interface StudentService {
    StudentResponseDTOs createStudent(StudentRequestDTOs dto);
    List<StudentResponseDTOs> getAllStudent();
    StudentResponseDTOs getStudentById(Long id);
    StudentResponseDTOs updateStudent(Long id,StudentRequestDTOs dto);
    void delet(Long id);


}
