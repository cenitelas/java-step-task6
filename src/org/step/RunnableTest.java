package org.step;

public class RunnableTest implements Runnable {
    @Override
    public void run() {
        new Message("ThreadTest3").print();
    }
}
