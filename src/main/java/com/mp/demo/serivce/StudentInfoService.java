package com.mp.demo.serivce;

import com.mp.demo.entity.StudentInfo;

import java.util.List;

public interface StudentInfoService {

    public List<StudentInfo> selectAll();

    public List<StudentInfo> fuzzySelectByName(String name);

}
