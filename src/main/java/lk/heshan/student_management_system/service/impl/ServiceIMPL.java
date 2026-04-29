package lk.heshan.student_management_system.service.impl;

import lk.heshan.student_management_system.DTOs.StudentRequestDTOs;
import lk.heshan.student_management_system.DTOs.StudentResponseDTOs;
import lk.heshan.student_management_system.convertor.StudentMapper;
import lk.heshan.student_management_system.entity.Student;
import lk.heshan.student_management_system.repository.StudentRepository;
import lk.heshan.student_management_system.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceIMPL implements StudentService {

    private final StudentRepository studentRepository;

    public ServiceIMPL(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }


    @Override
    public StudentResponseDTOs createStudent(StudentRequestDTOs dto) {
        Student student= StudentMapper.reqDTOToEntity(dto);
        return StudentMapper.entityToRespDTO((studentRepository.save(student)));
    }

    @Override
    public List<StudentResponseDTOs> getAllStudent() {
        return List.of();
    }

    @Override
    public StudentResponseDTOs getStudentById(Long id) {
        return null;
    }

    @Override
    public StudentResponseDTOs updateStudent(Long id, StudentRequestDTOs dto) {
        return null;
    }

    @Override
    public void delet(Long id) {

    }
}
