package com.example.ivtasks.async.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;


@Service
public class AsyncService {

    Logger logger = LoggerFactory.getLogger(AsyncService.class);

    /**
     * We want this method to perform computations in parallel
     */
    public void testCompute() throws InterruptedException {
        logger.info("before testCompute");
        sum(5, 4).whenComplete((res, ex) -> {
            logger.info("Sum Result {}", res);
        });
        subtract(5, 4).whenComplete((res, ex) -> {
            logger.info("Sub Result {}", res);
        });
        logger.info("after testCompute");
    }

    @Async
    public CompletableFuture<Integer> sum(int a, int b) throws InterruptedException {
        Thread.sleep(6000);
        return CompletableFuture.completedFuture(a + b);
    }

    @Async
    public CompletableFuture<Integer> subtract(int a, int b) throws InterruptedException {
        Thread.sleep(3000);
        return CompletableFuture.completedFuture(a - b);
    }
}
