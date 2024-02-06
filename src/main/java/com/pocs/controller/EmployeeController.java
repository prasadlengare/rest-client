package com.pocs.controller;

import com.pocs.client.Employee;
import com.pocs.client.EmployeeServiceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee-client")
public class EmployeeController {

    private final EmployeeServiceClient employeeServiceClient;

    @GetMapping
    public ResponseEntity<List<Employee>> getEmployee(){
        return employeeServiceClient.getAllEmployee();
    }

}
