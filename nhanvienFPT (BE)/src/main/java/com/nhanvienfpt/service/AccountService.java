package com.nhanvienfpt.service;

import com.nhanvienfpt.model.Account;
import com.nhanvienfpt.repository.IAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    IAccountRepo iAccountRepo;
    public Account checkLogin(String username, String password){
        return iAccountRepo.checkLogin(username,password);
    }
}
