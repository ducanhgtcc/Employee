package com.nhanvienfpt.service;

import com.nhanvienfpt.model.Branch;
import com.nhanvienfpt.repository.IBranchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchService {
    @Autowired
    IBranchRepo iBranchRepo;

    public List<Branch> getAll(){
        return (List<Branch>) iBranchRepo.findAll();
    }
}
