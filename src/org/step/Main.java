package org.step;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	 ThreadTest1 test1 = new ThreadTest1();
	 ThreadTest2 test2 = new ThreadTest2();
	 Message message = new Message("ThreadTest3");
	 Thread test3 = new Thread(new RunnableTest());
	 test1.start();
	 test2.start();
	 test3.start();
    }
}
