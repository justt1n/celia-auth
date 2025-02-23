package com.celia.auth.service;

import com.celia.auth.dto.LoginRequest;
import com.celia.auth.dto.RegisterRequest;

public interface AuthService {

    public String authenticateUser(LoginRequest loginRequest);

    public void registerUser(RegisterRequest registerRequest);

}
