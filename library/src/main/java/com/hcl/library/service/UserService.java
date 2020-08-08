package com.hcl.library.service;

import com.hcl.library.model.User;

public interface UserService {
    public boolean validateUser(Long uid, String password);
    public void registerUser(User u) throws Exception;
}
