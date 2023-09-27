package com.sda.literature;

public class Author {
    private String firstname, surname, nationality;

    private String getNationality() {
        return nationality;
    }
    public String getAuthorInfo(){
return "Moja informacja o Autorze: " + firstname;
    }
}
