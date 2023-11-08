package com.example.splabevelyne;

import com.sun.scenario.animation.shared.TimerReceiver;

import java.util.concurrent.TimeUnit;

public class Image implements Element{
    public String imagename;
    @Override
    public void print(){
        System.out.println("Image with name: " + imagename);
    }

    @Override
    public void add(Element e){
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeElement(Element e){
        throw new UnsupportedOperationException();
    }

    @Override
    public Element get(int i){
        throw new UnsupportedOperationException();
    }
}
