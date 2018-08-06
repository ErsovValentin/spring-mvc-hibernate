package com.HibernateSpringServlet.controller;

import com.HibernateSpringServlet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/")
    public String getIndex()
    {
        return "index";
    }

    @RequestMapping("/welcome")
    public String getWelcome()
    {
        return "welcome";
    }

    @RequestMapping("/student")
    public @ResponseBody String getOneName()
    {
        return studentService.getAllStudents().get(0).getName();
    }
}
