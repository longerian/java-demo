package com.tutorialspoint;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by huifeng.hxl on 2015/3/7.
 */
public class StudentMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("ID"));
        student.setName(rs.getString("NAME"));
        student.setAge(rs.getInt("AGE"));
        return student;
    }
}
