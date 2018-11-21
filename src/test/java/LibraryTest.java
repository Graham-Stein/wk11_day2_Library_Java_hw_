import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book1;
    private Book book2;

    @Before
    public void before(){
    library = new Library();
    book = new Book("Lord of the rings", "J R Tolkien", "Fantasy");
    book1 = new Book("Touching the void", "Joe Simpson", "True story");
    book2 = new Book("The organized mind", "Daniel Levitin", "Self improvement");
    }

    @Test
    public void canAddStockToLibrary(){
        library.addBook(book);
        assertEquals(1, library.getStockLevel());
    }

    @Test
    public void hasMaxCapacity(){
        assertEquals(2, library.getMaxStock());
    }

    @Test
    public void canAddBookUpToMaxCapacity(){
        library.addBook(book);
        library.addBook(book1);
        assertEquals(2, library.getStockLevel());
    }

    @Test
    public void canNotAddBookBeyondMaxCapacity(){
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.getStockLevel());
    }

    @Test
    public void canRemoveBookByTitle(){
        library.addBook(book);
        library.removeBook("Lord of the rings");
        assertEquals(0, library.getStockLevel());
    }
}
