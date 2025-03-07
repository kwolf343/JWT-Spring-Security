package com.security.services;

import com.security.persistence.entities.UserEntity;
import com.security.services.models.dtos.LoginDTO;
import com.security.services.models.dtos.ResponseDTO;
import java.util.HashMap;

public interface IAuthService {
    
    public HashMap<String, String> login(LoginDTO login) throws Exception;
    
    public ResponseDTO register(UserEntity user) throws Exception;
    
}
