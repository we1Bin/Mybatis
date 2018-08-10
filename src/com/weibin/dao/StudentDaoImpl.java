package com.weibin.dao;

import com.weibin.bean.Student;
import com.weibin.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.InputStream;

/**
 *  @author Weibin on 2018/8/9.
 *  @version 1.0
 *  
 */
public class StudentDaoImpl implements IStudentDao {
    private SqlSession sqlSession;
    @Override
    public void insertStudent(Student student) {
        try {
            //1.加载主配置文件
            //InputStream stream = Resources.getResourceAsStream("mybatis.xml");
            //2.创建SqlSessionFactory
            //SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
            //3.创建SqlSession
             //sqlSession = sqlSessionFactory.openSession();
            //4.相关操作，insert、delete、update等

            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.insert("insertStudent", student);
            sqlSession.commit();
        } finally {
            if (sqlSession != null){
                sqlSession.close();
            }
        }


    }
}
