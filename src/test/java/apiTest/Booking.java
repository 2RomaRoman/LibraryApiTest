package apiTest;

public class Booking {

    private String author;
    private Boolean isElectronicBook;
    private String name;
    private Integer year;

    public Booking(String author, Boolean isElectronicBook, String name, Integer year) {
        this.author = author;
        this.isElectronicBook = isElectronicBook;
        this.name = name;
        this.year = year;
    }
    public String getAuthor() {
        return author;
    }
    public Boolean getIsElectronicBook() {
        return isElectronicBook;
    }
    public String getName() {
        return name;

    }
    public Integer getYear() {
        return year;
    }
}
