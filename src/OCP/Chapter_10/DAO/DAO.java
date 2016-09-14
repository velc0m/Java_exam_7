package OCP.Chapter_10.DAO;

import java.util.Collection;

/**
 * Created by LitVV on 13.09.2016.
 */
public interface DAO {

    Collection<Book> findAllBooks();
    Book findBookByIsbn(Book book);
    void createBook(Book book);
    void deleteBook(Book book);
}
