import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    private Book book;
    private Book book1;
    private Book book2;
    private Library library;

    @Before
    public void before(){
        customer = new Customer("William");
        book = new Book("Lord of the rings", "J R Tolkien", "Fantasy");
        book1 = new Book("Touching the void", "Joe Simpson", "True story");
        book2 = new Book("The organized mind", "Daniel Levitin", "Self improvement");
        library = new Library();
    }

    @Test
    public void hasName(){
        assertEquals("William", customer.getName());
    }

    @Test
    public void hasEmptyLoanList(){
        assertEquals(0, customer.getLoanListLength());

    }

    @Test
    public void canLoanBooksToCustomer(){
        customer.addBook(book);
        customer.addBook(book1);
        customer.addBook(book2);
        assertEquals(3, customer.getLoanListLength());
    }

}
