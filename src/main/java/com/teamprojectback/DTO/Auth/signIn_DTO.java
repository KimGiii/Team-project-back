package com.teamprojectback.DTO.Auth;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class signIn_DTO {
    @NotNull
    private String email;
    @NotNull
    private String password;
}
