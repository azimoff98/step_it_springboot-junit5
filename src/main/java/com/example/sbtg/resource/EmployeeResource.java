package com.example.sbtg.resource;

import com.example.sbtg.domain.Employee;
import com.example.sbtg.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeResource {

    private final EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody @Valid Employee employee){
        employeeService.save(employee);
        return ResponseEntity.ok("Employee is created");
    }

}
