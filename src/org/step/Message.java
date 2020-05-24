package org.step;

public class Message {
    private String message;

    public Message(String message) {
        this.message = message;
    }

    public void print(){
        for(int i = 0 ;i<10;i++) {
            System.out.println(this.message);
        }
    }
}
