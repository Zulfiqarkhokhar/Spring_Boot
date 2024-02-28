package com.example.SpringJDBC;

import StudentDao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"StudentDao"})
public class JDBCconfig {
    @Bean(name = {"ds"})
    public DataSource getDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }
    @Bean(name = {"jdbcTemplate"})
    public JdbcTemplate getTemplate(){
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(getDataSource());
        return template;
    }

//    @Bean(name = {"dao"})
//    public StudentDaoImpl getStudentDao(){
//        StudentDaoImpl dao = new StudentDaoImpl();
//        dao.setTemplate(getTemplate());
//        return dao;
//     }
}
