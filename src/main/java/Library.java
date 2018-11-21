import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int maxStock;

    public Library() {
        this.stock = new ArrayList<>();
        this.maxStock = 2;
    }

    public int getStockLevel(){
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (this.stock.size() < this.maxStock) {
            this.stock.add(book);
        }
        return;
    }

    public int getMaxStock() {
        return maxStock;
    }

//    public void removeBook(String book) {
//        this.stock.remove(book);
//    }
}
