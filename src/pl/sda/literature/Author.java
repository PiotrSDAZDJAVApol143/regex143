package pl.sda.literature;

public class Author {
    private String firstname, surname, nationality;

    public String getNationality() {
        return nationality;
    }
    public String getAuthorInfo(){
return "Moja informacja o Autorze: " + firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Author(String firstname, String surname) {
        this.firstname = firstname;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}

