package com.github.malikchettih.java8_new_and_noteworthy.lambda_expressions;

public class LambdaRunnable {
    
    public static void main(String[] args) throws InterruptedException {
        
        Runnable runnable = () -> {
            for(int i=0; i<3; i++){
                System.out.println("Hello World from thread : " + Thread.currentThread().getName());
            }      
        };
        
        Thread t = new Thread(runnable);
        t.start();
        t.join();
    }
}
