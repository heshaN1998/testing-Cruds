package lk.heshan.student_management_system.DTOs;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class StudentRequestDTOs {
    @NotBlank(message = "name is required")
    private String name;
    @Email(message = "invalid format")
    @NotBlank(message = "email is required")
    private String email;
    @NotBlank(message = "course is required")
    private String course;
    @Min(value = 17,message = "age must over than 16")
    @Max(value = 30,message = "age must be less than 30")
    private int age;

    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setCourse(String course){
        this.course=course;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getCourse(){
        return course;
    }
    public int getAge(){
        return age;
    }
}
