package lk.heshan.student_management_system.DTOs;

public class StudentRequestDTOs {
    private String name;
    private String email;
    private String course;
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
