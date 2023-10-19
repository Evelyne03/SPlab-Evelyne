package com.example.splabevelyne;

public class Image implements Element{
    private String imagename;
    Image(String imagename){
        this.imagename = imagename;
    }

    public void print(){
        System.out.println("Image name: " + imagename);
    }
}
