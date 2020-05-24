package org.step;

public class ThreadTest2 extends  Thread {

    @Override
    public void run() {
        new Message("ThreadTest2").print();
    }
}
