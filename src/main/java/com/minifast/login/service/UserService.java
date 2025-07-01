package com.minifast.login.service;


import com.minifast.login.model.Users;
import com.minifast.login.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users saveUser(Users user){
        return userRepository.save(user);
    }


}
