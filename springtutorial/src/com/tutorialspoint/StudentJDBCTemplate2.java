package com.tutorialspoint;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * Created by huifeng.hxl on 2015/3/7.
 */
public class StudentJDBCTemplate2 implements StudentDAO2 {

    private DataSource dataSource;
    private SimpleJdbcCall jdbcCall;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        this.jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String name, Integer age) {
        String SQL = "insert into Student (NAME, AGE) values (?, ?)";

        jdbcTemplate.update( SQL, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
    }

    @Override
    public Student getStudent(Integer id) {
        SqlParameterSource in = new MapSqlParameterSource().addValue("in_ID", id);
        Map<String, Object> out = jdbcCall.execute(in);
        Student student = new Student();
        student.setId(id);
        student.setName((String) out.get("out_NAME"));
        student.setAge((Integer) out.get("out_AGE"));
        return student;
    }

    @Override
    public List<Student> listStudents() {
        String SQL = "select * from Student";

        List <Student> students = jdbcTemplate.query(SQL,
                new StudentMapper());
        return students;
    }
}
