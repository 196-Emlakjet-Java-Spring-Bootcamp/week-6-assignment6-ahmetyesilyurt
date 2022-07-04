package com.emlakjet.emlakjetauthservice.dao;

import com.emlakjet.emlakjetauthservice.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse extends BaseEntity {
    private String token;

}
