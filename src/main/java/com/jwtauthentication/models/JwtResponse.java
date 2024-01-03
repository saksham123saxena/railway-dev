package com.jwtauthentication.models;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class JwtResponse {
    private String jwtToken;
    private String username;
}
