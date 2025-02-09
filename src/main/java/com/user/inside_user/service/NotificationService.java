package com.user.inside_user.service;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements Subject{
    List<Observer> obsList = new ArrayList<>();
    private String msg;
    private String sendTo;
    @Override
    public void addObserver(Observer obs) {
        obsList.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        obsList.remove(obs);
    }

    @Override
    public void notifyObserver() {
        for(Observer o:obsList){
            o.update(msg);
        }
    }
    public void sendMsg(String newMsg){
        this.msg=newMsg;
        notifyObserver();
    }
}
