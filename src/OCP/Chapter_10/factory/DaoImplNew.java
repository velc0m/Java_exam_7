package OCP.Chapter_10.factory;

import OCP.Chapter_10.DAO.Book;
import OCP.Chapter_10.DAO.DAO;
import OCP.Chapter_10.DAO.DaoImpl;

import java.util.Collection;

/**
 * Created by LitVV on 13.09.2016.
 */
public class DaoImplNew implements DAO {

    DAO dao;

    @Override
    public Collection<Book> findAllBooks() {
        return null;
    }

    @Override
    public Book findBookByIsbn(Book book) {
        Book book1 = dao.findBookByIsbn(book);
        return book1;
    }

    @Override
    public void createBook(Book book) {
        dao = new DaoImpl();
        dao.createBook(book);
    }

    @Override
    public void deleteBook(Book book) {

    }
}
