package com.java;
public class coder {

        public static void main (String[]args){
        System.out.println("hello world");

        Bank b = new Bank();
        b.sayhello();
        Thread t1 = new Thread(new MyTask());
        t1.start();
    }}
class Bank {
        void sayhello() {
            System.out.println("Hi training trains Account");
        }}
    class MyTask implements Runnable {
        public void run() {
            System.out.println("my thread");
        }
    }


