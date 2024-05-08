package com.security.services;

import com.security.persistence.entities.UserEntity;
import java.util.List;

public interface IUserService {
    public List<UserEntity> findAllUsers();
}
