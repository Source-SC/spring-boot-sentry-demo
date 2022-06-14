package com.example.springbootsentrydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.Exception;
import io.sentry.Sentry;

@RestController
public class MyController {

    @GetMapping("error1")
    public String error1(){
        try {
            throw new Exception("This is a test.");
        } catch (Exception e) {
            Sentry.captureException(e);
        }
        return "error1";
    }
}
