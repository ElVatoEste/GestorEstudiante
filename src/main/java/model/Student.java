package model;

import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class Student {

    @Id
    @Column(name = "cif_student")
    private Integer cif_student;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "gender")
    private String gender;
    @Column(name = "status")
    private String status;
    public Student() {
    }

    public Integer getCif_student() {
        return cif_student;
    }

    public void setCif_student(Integer cif_student) {
        this.cif_student = cif_student;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    /*@OneToMany(mappedBy = "estudiante",cascade= CascadeType.ALL)
    }*/
}
