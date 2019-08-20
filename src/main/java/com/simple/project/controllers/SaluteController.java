package com.simple.project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaluteController {

    @GetMapping("/salute")
    public String saySalute() {
        return "Hello my friend!";
    }
}
