package com.company.singleton;

public class Main {

    public static void main(String[] args) {
        ClipBoard clipBoard = ClipBoard.getInstance();

        clipBoard.copy("hello");
        clipBoard.paste();

        clipBoard.copy("hi");
        clipBoard.paste();

    }
}
