package com.example.bloodBank.demo.repository;

import com.example.bloodBank.demo.modal.Donar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonarRepo extends JpaRepository <Donar, Long> {

}
