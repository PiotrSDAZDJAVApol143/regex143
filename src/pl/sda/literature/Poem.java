package pl.sda.literature;

public class Poem {
    private Author creator;
    private int stropheNumbers;
   private String title;
    private String getTitle(){
        return title;
    }

    public Author getCreator() {
        return creator;
    }

    public void setCreator(Author creator) {
        this.creator = creator;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public void setStropheNumbers(int stropheNumbers) {
        this.stropheNumbers = stropheNumbers;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String toString() {
        return ":: " + title + " ::" + stropheNumbers;
    }
}
