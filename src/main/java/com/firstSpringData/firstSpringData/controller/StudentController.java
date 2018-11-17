package com.firstSpringData.firstSpringData.controller;

import com.firstSpringData.firstSpringData.entity.Students;
import com.firstSpringData.firstSpringData.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<Students> listStudent(){
        return this.studentRepository.findAll();
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Students saveStudant(@RequestBody Students student){
        return this.studentRepository.save(student);
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public Optional<Students> findById(@PathVariable String id){
        return this.studentRepository.findById(id);
    }

    @RequestMapping(value = "/student/{name}/name", method = RequestMethod.GET)
    public List<Students> findByName(@PathVariable String name){
        return this.studentRepository.findByNameLikeIgnoreCase(name);
    }
    
}
