package com.example.springbootsentrydemo;

import com.mindscapehq.raygun4java.core.RaygunClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSentryDemoApplication {

    public static void main(String[] args) throws Throwable  {
        SpringApplication.run(SpringBootSentryDemoApplication.class, args);
//        Thread.setDefaultUncaughtExceptionHandler(new MyExceptionHandler());
    }
//
//    static class MyExceptionHandler implements Thread.UncaughtExceptionHandler {
//        @Override
//        public void uncaughtException(Thread t, Throwable e) {
//            RaygunClient client = new RaygunClient("DgBMtak8ww1wX444eQSvWA");
//            client.Sen
//        }
//    }

}
