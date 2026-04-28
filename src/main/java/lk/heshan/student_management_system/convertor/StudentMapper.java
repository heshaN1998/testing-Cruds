package lk.heshan.student_management_system.convertor;

import lk.heshan.student_management_system.DTOs.StudentRequestDTOs;
import lk.heshan.student_management_system.DTOs.StudentResponseDTOs;
import lk.heshan.student_management_system.entity.Student;

public class StudentMapper {
    public static Student reqDTOToEntity(StudentRequestDTOs dto){
        Student student=new Student();
        student.setName(dto.getName());
        student.setEmail(dto.getEmail());
        student.setCourse(dto.getCourse());
        student.setAge(dto.getAge());

        return student;

    }
    public static StudentResponseDTOs entityToRespDTO(Student student){
        return new StudentResponseDTOs(student.getId(), student.getName(), student.getEmail(), student.getCourse(), student.getAge());
    }
}
