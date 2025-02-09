package com.user.inside_user.service;

public interface Subject {
    public void addObserver(Observer obs);
    public void removeObserver(Observer obs);
    public void  notifyObserver();
}
