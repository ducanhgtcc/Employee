package com.nhanvienfpt.repository;

import com.nhanvienfpt.model.Branch;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBranchRepo extends PagingAndSortingRepository<Branch, Integer> {
}
