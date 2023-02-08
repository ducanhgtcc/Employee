package com.nhanvienfpt.repository;

import com.nhanvienfpt.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IEmployeeRepo extends PagingAndSortingRepository<Employee, Integer> {
}
