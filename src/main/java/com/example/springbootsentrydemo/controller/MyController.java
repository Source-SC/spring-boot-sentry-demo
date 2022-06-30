package com.example.springbootsentrydemo.controller;

import com.bugsnag.Bugsnag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.Exception;
import io.sentry.Sentry;

@RestController
public class MyController {

    @Autowired
    private Bugsnag bugsnag;

    @GetMapping("error1")
    public String error1(){
        bugsnag.notify(new RuntimeException("My TEST 0630"));
        try {
            throw new Exception("This is a test.");
        } catch (Exception e) {
            Sentry.captureException(e);
        }
        return "error1";
    }

    @PostMapping("make/error/{errorId}")
    public void makeError(@PathVariable String errorId){
        bugsnag.notify(new RuntimeException(errorId));
    }
}
