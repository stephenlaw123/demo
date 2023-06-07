package com.example.demo.model;

//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter
public class User {
    private String name;
    private String phone;
    private String idNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

//    public User(String name, String phone, String idNumber) {
//        this.name = name;
//        this.phone = phone;
//        this.idNumber = idNumber;
//    }
}
