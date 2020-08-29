package com.codecool.wasterecycling;

public class Main {

    public static void main(String[] args) {
            Dustbin eu = new Dustbin("red");
            Garbage plastic = new PlasticGarbage("plastic", true);
            Garbage paper = new PaperGarbage("paper", true);
            eu.throwOutGarbage(paper);
            eu.throwOutGarbage(plastic);
            System.out.println(eu.toString());
    }
}
