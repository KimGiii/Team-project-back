package com.teamprojectback.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Main_Controller {
    @GetMapping("")
    public String Connection_Check() {
        return "Connection Success!";
    }
}

