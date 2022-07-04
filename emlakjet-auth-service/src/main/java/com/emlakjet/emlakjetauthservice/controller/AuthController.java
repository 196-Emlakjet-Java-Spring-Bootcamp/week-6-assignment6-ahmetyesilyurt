package com.emlakjet.emlakjetauthservice.controller;

import com.emlakjet.emlakjetauthservice.dao.AuthRequest;
import com.emlakjet.emlakjetauthservice.dao.AuthResponse;
import com.emlakjet.emlakjetauthservice.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/auth")
    public ResponseEntity<AuthResponse> getToken(@RequestBody AuthRequest request) throws Exception {
        return new ResponseEntity<>(authService.getToken(request), HttpStatus.OK);
    }
}
