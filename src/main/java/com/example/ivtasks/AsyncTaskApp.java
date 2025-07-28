package com.example.ivtasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AsyncTaskApp {

    public static void main(String[] args) {
        SpringApplication.run(AsyncTaskApp.class, args);
    }

}
