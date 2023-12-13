package com.teamprojectback.DTO.Auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class signUp_DTO {
    private String email;
    private String password;
    private String passwordCheck;
    private String name;
    private String phoneNumber;
    private String birth;
    private String gender;
}
