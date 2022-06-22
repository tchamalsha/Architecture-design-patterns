package com.company.singleton;

public class ClipBoard {

    private String content;

    private static ClipBoard instance = null;

    //private constructor
    private ClipBoard(){

    }

    //static method to get instance
    public static ClipBoard getInstance(){
        if (instance == null){
            instance = new ClipBoard();
        }
        return instance;
    }

    public void copy(String content){
        this.content = content;
    }

    public void paste(){
        System.out.println(content);
    }

}
