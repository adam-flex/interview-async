package com.example.ivtasks.controller;

import com.example.ivtasks.async.service.AsyncService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AsyncTaskController {

    private final AsyncService asyncService;

    public AsyncTaskController(AsyncService asyncService) {
        this.asyncService = asyncService;
    }


    @GetMapping("/asyncs")
    public void testAsyncs() throws InterruptedException {
        asyncService.testCompute();
    }
}
