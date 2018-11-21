import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Book> loanBooks;

    public Customer (String name){
        this.name = name;
        this.loanBooks = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int getLoanListLength() {
        return this.loanBooks.size();
    }

    public void addBook(Book book) {
        this.loanBooks.add(book);
    }
}
