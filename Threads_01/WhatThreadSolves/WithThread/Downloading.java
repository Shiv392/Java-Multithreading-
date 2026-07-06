package Threads_01.WhatThreadSolves.WithThread;

public class Downloading implements Runnable{
    @Override
    public void run(){
        long cnt = 1000000000L;
        for(int i=0;i<cnt;i++){
            //downloading
        }

        System.out.println("Downloading completed..........."+Thread.currentThread().getName());
    }
}
