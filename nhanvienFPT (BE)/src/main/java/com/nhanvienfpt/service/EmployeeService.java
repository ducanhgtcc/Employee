package com.nhanvienfpt.service;

import com.nhanvienfpt.model.Employee;
import com.nhanvienfpt.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeService {
    @Autowired
    IEmployeeRepo iEmployeeRepo;

//    public Page<Blog> getAll(Pageable pageable) {
//        return iBlogRepo.findAll(pageable);
//    }

    public List<Employee> getAll() {
        return (List<Employee>) iEmployeeRepo.findAll();
    }

    public Employee save(Employee employee) {
        return iEmployeeRepo.save(employee);
    }

    public Employee delete(int id) {
        Employee employee = findById(id);
        iEmployeeRepo.deleteById(id);
        return employee;
    }

    public Employee findById(int id) {
        return iEmployeeRepo.findById(id).get();
    }

}
