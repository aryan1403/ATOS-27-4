package com.example.springbootdemo.Controllers;

import java.util.ArrayList;
import java.util.List;
import com.example.springbootdemo.Models.Employee;
import com.example.springbootdemo.Response.response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/emp")
@RestController
public class EmpController {
    List<Employee> list = new ArrayList<>();
    // Add Employee
    @PostMapping("/insertEmp")
    public response addEmp(@RequestBody Employee emp) {
        // If added successfully to the list
        if(list.add(emp)) {
            return new response(200, "Successfully Inserted in List", emp);
        }
        // On Error
        return new response(500, "Internal Server Error", null);
    }

    // Get All Employee
    @GetMapping("/GetAllEmp")
    public response getAllEmp() {
        if(list.size() > 0) {
            return new response(200, "Successfully Fetched Employees", list);
        }
        return new response(200, "No Employee Present in the List", null);
    }

}
