package com.tutorialspoint;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by huifeng.hxl on 2015/3/7.
 */
public interface StudentDAO2 {

    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    public void setDataSource(DataSource ds);
    /**
     * This is the method to be used to create
     * a record in the Student table.
     */
    public void create(String name, Integer age);
    /**
     * This is the method to be used to list down
     * a record from the Student table corresponding
     * to a passed student id.
     */
    public Student getStudent(Integer id);
    /**
     * This is the method to be used to list down
     * all the records from the Student table.
     */
    public List<Student> listStudents();

}
