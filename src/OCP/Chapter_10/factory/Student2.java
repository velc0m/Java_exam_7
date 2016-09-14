package OCP.Chapter_10.factory;

import OCP.Chapter_10.DAO.Book;
import OCP.Chapter_10.DAO.DAO;

/**
 * Created by LitVV on 13.09.2016.
 */
public class Student2 {

    public static void main(String[] args) {
        Book book = new Book();
        book.setIsbn(2);
        book.setTitle("Dfdfrf");

        Factory factory = new FactoryImpl();
        DAO dao = factory.getDao(0);

        dao.createBook(book);
        System.out.println(dao.findBookByIsbn(book).getTitle());
    }
}
