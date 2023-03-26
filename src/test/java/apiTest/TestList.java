package apiTest;
import org.junit.jupiter.api.Test;
public class TestList extends ConstsAndValues{

    @Test
    public void getBookList() {
        System.out.println("***************POSITIVE*********************");
        System.out.println("***GET_BOOK_LIST***");
        BaseURLTests.getBookList();
    }

    @Test
    public void getBookByID() {
        System.out.println("***************POSITIVE*********************");
        System.out.println("***GET_ONE_BOOK***");
        ByIDTests.getBookByID();
    }

    @Test
    public void getBookByWrongID() {
        System.out.println("*****************NEGATIVE***********************");
        System.out.println("***GET_ONE_BOOK_WITH_WRONG_ID***");
        ByIDTests.getByWrongID();
    }

    @Test
    public void deleteBookByID() {
        System.out.println("***************POSITIVE*********************");
        System.out.println("***DELETE_BOOK_BY_ID***");
        ByIDTests.deleteBookByID();
    }

    @Test
    public void deleteBookByWrongID() {
        System.out.println("*****************NEGATIVE***********************");
        System.out.println("***DELETE_BOOK_BY_WRONG_ID***");
        ByIDTests.deleteBookByWrongID();
    }

    @Test
    public void postBookByName() {
        System.out.println("***************POSITIVE*********************");
        System.out.println("***ADD_NEW_BOOK_BY_NAME***");
        BaseURLTests.postBookByName(book);
    }

    @Test
    public void postBookByEverything() {
        System.out.println("***************POSITIVE*********************");
        System.out.println("***ADD_NEW_BOOK_BY_NAME***");
        BaseURLTests.postBookByEverything(book2);
    }
    @Test
    public void postBookWithoutName() {
        System.out.println("*****************NEGATIVE***********************");
        System.out.println("***ADD_NEW_BOOK_WITHOUT_NAME***");
        BaseURLTests.postWithoutName(book3);
    }
    @Test
    public void putNewInfoByWrongID() {
        System.out.println("*****************NEGATIVE***********************");
        System.out.println("***ADD_NEW_INFO_BY_WRONG_ID***");
        ByIDTests.putNewInfoByWrongID(book);
    }
    @Test
    public void putNewInfoByID() {
        System.out.println("***************POSITIVE*********************");
        System.out.println("***ADD_NEW_INFO_BY_ID***");
        ByIDTests.putNewInfoByID(book);
    }
    @Test
    public void putNewBadInfoByID() {
        System.out.println("*****************NEGATIVE***********************");
        System.out.println("***UPDATE_BOOK_INFO_WITHOUT_name_year_Boolean***");
        ByIDTests.putNewBadInfoByID(book3);
    }

}
