package com.hcl.library.service;

import com.hcl.library.repo.UserRepository;
import com.hcl.library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    public UserRepository userRepository;

    @Override
    public boolean validateUser(Long uid, String password) {
        return userRepository.findByUidAndPassword(uid,password)!=null?true:false;
    }
}
