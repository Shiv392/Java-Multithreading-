package Threads_01.WhatThreadSolves.WithThread;

public class Main {
        public static void main(String[]args){
            System.out.println("Main Thread Starting..........");

            Thread downloadingThread = new Thread(new Downloading());//different thread
            Playing playingThread = new Playing(); //differnet thread 

            downloadingThread.start();
            playingThread.start();

            System.out.println("Main Thread Ending..........");
        }
}
