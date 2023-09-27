package com.sda.literature;

public class TestInPackage {
    public static void main(String[] args) {
        Author author = new Author();

        //nie da sie
        //author.firstName = "Adam";

        //nie da sie
        //author.getNationality();

        author.getAuthorInfo();

        Poem poem = new Poem();
        poem.stropheNumbers = 1234;
        poem.title = "Do M*";

        poem.getTitle();
    }
}