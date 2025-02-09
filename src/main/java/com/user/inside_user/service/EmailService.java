package com.user.inside_user.service;

public class EmailService implements Observer{
    private String msg;

    @Override
    public void update( String msg) {
        this.msg=msg;
        send();
    }

    private void send() {
        System.out.println("Email sent >> \nSubject >>"+msg);
    }
}
