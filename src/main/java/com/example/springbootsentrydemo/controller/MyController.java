package com.example.springbootsentrydemo.controller;

//import com.bugsnag.Bugsnag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.Exception;

import io.sentry.Sentry;

@RestController
public class MyController {

//    @Autowired
//    private Bugsnag bugsnag;

    @GetMapping("error1")
    public String error1() {
//        bugsnag.notify(new RuntimeException("My TEST 0630"));
        try {
            throw new Exception("This is a test.");
        } catch (Exception e) {
            System.out.println("okok");
            Sentry.captureException(e);
        }
        return "error1";
    }
//
//    @GetMapping("error2")
//    public String error2(){
//        bugsnag.setAppVersion("0.2");
//        bugsnag.notify(new RuntimeException("Custom ERROR 2"));
//        try {
//            throw new Exception("This is a test.");
//        } catch (Exception e) {
//            Sentry.captureException(e);
//        }
//        return "error1";
//    }
//
//    @PostMapping("error3/{version}/{title}")
//    public void error3(
//            @PathVariable String version,
//            @PathVariable String title){
//        bugsnag.setAppVersion(version);
//        bugsnag.notify(new RuntimeException(title));
//        try {
//            throw new Exception("This is a test.");
//        } catch (Exception e) {
//            Sentry.captureException(e);
//        }
//    }
//
    @PostMapping("make/error/{errorId}")
    public void makeError(@PathVariable String errorId){
        try {
            throw new Exception(errorId);
        } catch (Exception e) {
            Sentry.captureException(e);
        }
    }

    @PostMapping("make/error2/{errorId}")
    public void makeError2(@PathVariable String errorId){
        try {
            throw new Exception(errorId);
        } catch (Exception e) {
            Sentry.captureException(e);
        }
    }

    @PostMapping("make/error3/{errorId}")
    public void makeError3(@PathVariable String errorId){
        try {
            throw new Exception(errorId);
        } catch (Exception e) {
            Sentry.captureException(e);
        }
    }
}
