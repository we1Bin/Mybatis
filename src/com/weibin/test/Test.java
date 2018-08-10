package com.weibin.test;

import com.weibin.bean.Student;
import com.weibin.dao.IStudentDao;
import com.weibin.dao.StudentDaoImpl;
import org.junit.Before;

/**
 *  @author Weibin on 2018/8/9.
 *  @version 1.0
 *  
 */
public class Test {

    private IStudentDao dao;

    @Before
    public void before(){
         dao = new StudentDaoImpl();
    }


    @org.junit.Test
    public void testInsert(){
        Student student = new Student("张山", 23, 95.5);
        dao.insertStudent(student);
    }
}
