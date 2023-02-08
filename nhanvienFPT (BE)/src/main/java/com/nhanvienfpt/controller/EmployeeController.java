package com.nhanvienfpt.controller;

import com.nhanvienfpt.model.Employee;
import com.nhanvienfpt.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

//    @GetMapping
//    public Page<Blog> getAll(){
//        return blogService.getAll(PageRequest.of(0,2));
//    }

    @GetMapping
    public List<Employee> getAll(){
        return employeeService.getAll();
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @GetMapping("/{id}")
    public Employee showEdit(@PathVariable int id){
        return employeeService.findById(id);
    }

    @PutMapping("/{id}")
    public Employee edit(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @DeleteMapping("/{id}")
    public Employee delete(@PathVariable int id){
        return employeeService.delete(id);
    }

}
