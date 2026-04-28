package lk.heshan.student_management_system.DTOs;

import java.security.PublicKey;

public class StudentResponseDTOs {
    private Long id;
    private String name;
    private String email;
    private String course;
    private int age;

    public StudentResponseDTOs(){}

    public StudentResponseDTOs(Long id,String name,String email,String course,int age){
      this.id=id;
      this.name=name;
      this.email=email;
      this.course=course;
      this.age=age;
    }
    public  void setId(Long id){
        this.id=id;
    }
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

    public Long getId(){
        return id;
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
