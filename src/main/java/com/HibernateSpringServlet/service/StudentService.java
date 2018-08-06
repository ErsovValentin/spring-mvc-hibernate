package com.HibernateSpringServlet.service;

import com.HibernateSpringServlet.DAO.StudentDAO;
import com.HibernateSpringServlet.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDAO studentDAO;


    public List<Student> getAllStudents()
    {
        return studentDAO.getAllStudents();
    }

}
