package com.tutorialspoint;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by huifeng.hxl on 2015/3/7.
 */
public interface StudentDAO {

    public void setDataSource(DataSource dataSource);

    public void create(String name, Integer age);

    public Student getStudent(Integer id);

    public List<Student> listStudents();

    public void delete(Integer id);

    public void update(Integer id, Integer age);

}
