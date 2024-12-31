package com.durgesh.SpringSecurityTelusco;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<StudentModel> mockData = new ArrayList<>(List.of(
            new StudentModel(1, "Durgesh", 90),
            new StudentModel(1, "Durgesh", 90)
    ));

    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest req){
        return (CsrfToken) req.getAttribute("_csrf");
    }

    @GetMapping("/students")
    public List<StudentModel> getStudents() {
        return mockData;
    }

    @PostMapping("/students")
    public String addStudent(@RequestBody StudentModel studentModel){
        mockData.add(studentModel);
        return "OK-added";
    }
}
