package com.mp.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mp.demo.entity.StudentInfo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentInfoDao extends BaseMapper<StudentInfo> {

    public List<StudentInfo> fuzzySelectByName(String name);

}
