package com.example.bloodBank.demo.modal;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity

public class Donar {
@Id
@GeneratedValue
    Long id;
    int age;
    String name;

    Long phoneNumber;

    int weight;
    String bloodgroup;
    String location;

    public Donar(Long id, int age, String name, Long phoneNumber, int weight, String bloodgroup, String location) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.bloodgroup = bloodgroup;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    public Donar() {

    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getphoneNumber() {
        return phoneNumber;
    }

    public void setphoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
