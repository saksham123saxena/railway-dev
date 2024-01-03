package com.jwtauthentication.models;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JwtRequest {
    private String email;
    private String password;
}
