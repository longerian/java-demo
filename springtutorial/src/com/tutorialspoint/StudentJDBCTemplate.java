package com.tutorialspoint;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by huifeng.hxl on 2015/3/7.
 */
public class StudentJDBCTemplate implements StudentDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String name, Integer age) {
        String sql = "INSERT INTO Student (NAME, AGE) values(?, ?);";
        jdbcTemplate.update(sql, name, age);
        System.out.println("Create record name = " + name + " age = " + age);
    }

    @Override
    public Student getStudent(Integer id) {
        String sql = "SELECT * FROM Student WHERE ID = ?";
        Student student = jdbcTemplate.queryForObject(sql, new Object[]{id}, new StudentMapper());
        return student;
    }

    @Override
    public List<Student> listStudents() {
        String sql = "SELECT * FROM Student";
        List<Student> students = jdbcTemplate.query(sql, new StudentMapper());
        return students;
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM Student WHERE ID = ?";
        jdbcTemplate.update(sql, id);
        System.out.println("Delete record with id = " + id);
    }

    @Override
    public void update(Integer id, Integer age) {
        String sql = "UPDATE Student SET AGE = ? WHERE ID = ?";
        jdbcTemplate.update(sql, age, id);
        System.out.println("Update record with ID = " + id);
    }
}
