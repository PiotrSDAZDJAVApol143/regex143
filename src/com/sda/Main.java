package com.sda;

import com.sda.literature.Author;
import com.sda.literature.Poem;

public class Main {
    public static void main(String[] args) {
        Author author = new Author();

        //nie da sie
        //author.firstName = "Adam";

        //nie da sie
        //author.getNationality();

        //to działa bo dostep publiczny
        author.getAuthorInfo();

        Poem poem = new Poem();
        //nie działa bo poza pakietem
        //poem.stropheNumbers = 1234;
        //poem.title = "Do M*";

        //poem.getTitle();
    }
}