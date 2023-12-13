package com.teamprojectback.Controller;

import com.teamprojectback.DTO.Auth.ResponseDTO;
import com.teamprojectback.DTO.Auth.signIn_DTO;
import com.teamprojectback.DTO.Auth.signIn_ResponseDTO;
import com.teamprojectback.DTO.Auth.signUp_DTO;

import com.teamprojectback.Service.Auth_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class Auth_Controller {

    @Autowired Auth_Service Auth_Service;

    @PostMapping("/signup")
    public ResponseDTO<?> signUp(@RequestBody signUp_DTO requestBody) {
        ResponseDTO<?> result = Auth_Service.signUp(requestBody);

        return result;
    }

    @PostMapping("/signIn")
    public ResponseDTO<signIn_ResponseDTO> signIn(@RequestBody signIn_DTO requestbody) {
        ResponseDTO<signIn_ResponseDTO> result = Auth_Service.signIn(requestbody);

        return result;
    }

}
