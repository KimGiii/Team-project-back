package com.teamprojectback.DTO.Auth;


import com.teamprojectback.Entity.user_Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class signIn_ResponseDTO {
    private String token;
    private int exprTime;
    private user_Entity user;
}
