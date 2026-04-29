package lk.heshan.student_management_system.service.impl;

import lk.heshan.student_management_system.DTOs.StudentRequestDTOs;
import lk.heshan.student_management_system.DTOs.StudentResponseDTOs;
import lk.heshan.student_management_system.convertor.StudentMapper;
import lk.heshan.student_management_system.entity.Student;
import lk.heshan.student_management_system.repository.StudentRepository;
import lk.heshan.student_management_system.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
//SAME LOGIC
//    Student saved = studentRepository.save(student);
//    StudentResponseDTO response = StudentMapper.entityToRespDTO(saved);
//    return response;

    @Override
    public List<StudentResponseDTOs> getAllStudent() {
        return  studentRepository.findAll()
                .stream().map(StudentMapper::entityToRespDTO).collect(Collectors.toList());
    }

    @Override
    public StudentResponseDTOs getStudentById(Long id) {
        Student student=studentRepository.findById(id).orElseThrow(()->new RuntimeException("student not found"));
        return  StudentMapper.entityToRespDTO(student);
    }

    @Override
    public StudentResponseDTOs updateStudent(Long id, StudentRequestDTOs dto) {
        Student student=studentRepository.findById(id).orElseThrow(()->new RuntimeException("student not found"));
        student.setName(dto.getName());
        student.setEmail(dto.getEmail());
        student.setCourse(dto.getCourse());
        student.setAge(dto.getAge());

        return StudentMapper.entityToRespDTO(studentRepository.save(student));
    }
    @Override
    public void delete(Long id) {
    studentRepository.deleteById(id);
    }
}