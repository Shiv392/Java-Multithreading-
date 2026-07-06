package Threads_01.WhatThreadSolves.WithoutThread;

public class Main {
    public static void main(String[]args){
        Downloading downloading = new Downloading();
        Playing playing = new Playing();
        System.out.println("Main Thread Starting..........");

        downloading.download();
        playing.play();

        System.out.println("Main Thread Ending..........");
    }
}
