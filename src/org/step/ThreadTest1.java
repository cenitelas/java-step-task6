package org.step;

public class ThreadTest1 extends Thread {

    @Override
    public void run() {
        new Message("ThreadTest1").print();
    }
}
