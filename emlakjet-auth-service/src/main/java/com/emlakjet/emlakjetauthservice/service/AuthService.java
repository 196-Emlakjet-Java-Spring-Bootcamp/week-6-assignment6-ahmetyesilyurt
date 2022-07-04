package com.emlakjet.emlakjetauthservice.service;

import com.emlakjet.emlakjetauthservice.dao.AuthRequest;
import com.emlakjet.emlakjetauthservice.dao.AuthResponse;
import com.emlakjet.emlakjetauthservice.dto.AuthRepository;
import com.emlakjet.emlakjetauthservice.model.User;
import com.emlakjet.emlakjetauthservice.util.JwtUtil;
import com.emlakjet.emlakjetauthservice.util.UserUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class AuthService {
    private final AuthRepository authRepository;
    private final JwtUtil jwtUtil;

    public AuthResponse getToken(AuthRequest request) throws Exception {
        User user = authRepository.findByEmail(request.getEmail());
        if (user == null) {
            log.error("User not found with email " + request.getEmail());
            throw new Exception("User not found");
        }
        if (!UserUtil.isValidPassword(user.getPassword(), request.getPassword())) {
            log.error("User's password not valid " + request.getEmail());
            throw new Exception("User's password not valid");
        }
        return new AuthResponse(jwtUtil.generateToken(user));

    }

}
