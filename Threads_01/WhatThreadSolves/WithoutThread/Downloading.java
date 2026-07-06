package Threads_01.WhatThreadSolves.WithoutThread;

public class Downloading {
    public void download(){
        long cnt = 1000000000L;
        for(int i=0;i<cnt;i++){
            //downloading
        }

        System.out.println("Downloading completed...........");
    }
}
