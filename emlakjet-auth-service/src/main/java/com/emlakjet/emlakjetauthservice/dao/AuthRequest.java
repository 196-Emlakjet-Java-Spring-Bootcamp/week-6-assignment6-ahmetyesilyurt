package com.emlakjet.emlakjetauthservice.dao;

import com.emlakjet.emlakjetauthservice.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequest extends BaseEntity {
    private String email;
    private String password;
}
