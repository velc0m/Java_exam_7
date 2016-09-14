package OCP.Chapter_10.DAO;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by LitVV on 13.09.2016.
 */
public class DaoImpl implements DAO {

    private Map<Integer, Book> bookStore = new HashMap<>();

    @Override
    public Collection<Book> findAllBooks() {
        return bookStore.values();
    }

    @Override
    public Book findBookByIsbn(Book book) {
        return bookStore.get(book.getIsbn());
    }

    @Override
    public void createBook(Book book) {
        bookStore.put(book.getIsbn(), book);
    }

    @Override
    public void deleteBook(Book book) {
        bookStore.remove(book.getIsbn());
    }
}
