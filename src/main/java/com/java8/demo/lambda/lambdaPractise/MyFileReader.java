package com.java8.demo.lambda.lambdaPractise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.*;

/**
 * @author Baikang Lu
 * @date 2018/11/26
 */
public class MyFileReader {
    //行为参数化
    public static String processFile(BufferedReaderProcessor brp) throws IOException {
            BufferedReader br = new BufferedReader(new FileReader(""));
            return brp.process(br);
    }

    public static void main(String[] args) throws IOException {
        MyFileReader.processFile((BufferedReader br)->br.readLine()+br.readLine());
        MyFileReader.processFile((BufferedReader br) -> br.readLine());

        ExecutorService executorService = Executors.newFixedThreadPool(11);
        Future<Object> submit = executorService.submit(new Callable<Object>() {

            @Override
            public Object call() throws Exception {
                //TODO somthing
                return null;
            }
        });
        executorService.submit(() -> "do task");

    }
}
