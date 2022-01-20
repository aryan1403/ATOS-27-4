package com.example.springdemo;

public class meow {
    private String word;
    public void saymeow() {
        System.out.println("Meow meow");
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void speak() {
        System.out.println(word);
    }
}
