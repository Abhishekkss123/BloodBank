package com.example.bloodBank.demo.donarcontroller;

import com.example.bloodBank.demo.NotFoundException;
import com.example.bloodBank.demo.modal.Donar;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.bloodBank.demo.repository.DonarRepo;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
public class Controller {

    @Autowired
    private DonarRepo donarRepo;

    @PostMapping("/adddonar")

    Donar newDonar (@RequestBody Donar newDonar){
        return donarRepo.save(newDonar);
    }
    @GetMapping("/alldonars")

    List<Donar> getAllDonars(){
        return donarRepo.findAll();
    }
    @GetMapping("/donar/{id}")
    Donar getUserById(@PathVariable Long id) {
        return donarRepo.findById(id)
                .orElseThrow(() -> new NotFoundException(id));
    }

    @PutMapping("/donar/{id}")
    Donar updatedonar(@RequestBody Donar newDonar, @PathVariable Long id) {
        return donarRepo.findById(id)
                .map(existdonar -> {

                    existdonar.setName(newDonar.getName());
                    existdonar.setphoneNumber(newDonar.getphoneNumber());
                    existdonar.setAge(newDonar.getAge());
                    existdonar.setWeight(newDonar.getWeight());
                    existdonar.setBloodgroup(newDonar.getBloodgroup());
                    existdonar.setLocation(newDonar.getLocation());
                    return donarRepo.save(existdonar);
                }).orElseThrow(() -> new NotFoundException(id));
    }

    @DeleteMapping("/deletedonar/{id}")
    String deletedonar(@PathVariable Long id){
        if(!donarRepo.existsById(id)){
            throw new NotFoundException(id);
        }
        donarRepo.deleteById(id);
        return  "User with id "+id+" has been deleted success.";
    }



}


