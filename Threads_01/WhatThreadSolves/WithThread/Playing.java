package Threads_01.WhatThreadSolves.WithThread;

public class Playing extends Thread {
    @Override
    public void run(){
        long cnt = 1000000000L;
        for(int i=0;i<cnt;i++){
            //playing
        }

        System.out.println("Playing completed..........."+ Thread.currentThread().getName());
    }
}
