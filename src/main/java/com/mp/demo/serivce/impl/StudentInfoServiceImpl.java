package com.mp.demo.serivce.impl;

import com.mp.demo.dao.StudentInfoDao;
import com.mp.demo.entity.StudentInfo;
import com.mp.demo.serivce.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentInfoServiceImpl implements StudentInfoService {

    @Autowired
    private StudentInfoDao studentInfoDao;

    @Override
    public List<StudentInfo> selectAll() {
        return studentInfoDao.selectList(null);
    }

    @Override
    public List<StudentInfo> fuzzySelectByName(String name) {
        return studentInfoDao.fuzzySelectByName(name);
    }
}
