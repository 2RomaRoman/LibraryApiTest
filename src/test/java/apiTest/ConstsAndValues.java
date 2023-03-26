package apiTest;

public class ConstsAndValues {

    static final String BASEURL = "http://localhost:5000/api/books";
    static final String BOOKID = "/4";
    static final String IDFORDELETE = "/6";
    static final String BOOKWRONGID = "/972fh26";
    Booking book = new Booking("BookAuthor", true,"BookName",2023),
            book2 = new Booking("BookAuthor", true, "BookName", 2023),
            book3 = new Booking(null,null,null,null);
}
