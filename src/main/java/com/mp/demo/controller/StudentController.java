package com.mp.demo.controller;

import com.mp.demo.entity.StudentInfo;
import com.mp.demo.serivce.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentInfoService studentInfoService;

    @GetMapping("/getList")
    public List<StudentInfo> getStudentAllList(){
        return studentInfoService.selectAll();
    }


    @GetMapping("/fuzzyQueryStudent")
    public List<StudentInfo> getStudentByName(String name){
        return studentInfoService.fuzzySelectByName(name);
    }

}
