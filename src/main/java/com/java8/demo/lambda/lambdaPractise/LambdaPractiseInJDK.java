package com.java8.demo.lambda.lambdaPractise;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

/**
 * @author Baikang Lu
 * @date 2018/11/26
 */
public class LambdaPractiseInJDK {

    @Test
    public void executors() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "正在执行任务";
            }
        });


            String result = future.get();
            System.out.println(result);


        executorService.shutdown();
    }


}
