package com.security.services.impl;

import com.security.persistence.entities.UserEntity;
import com.security.persistence.repositories.UserRepository;
import com.security.services.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }
    
}
