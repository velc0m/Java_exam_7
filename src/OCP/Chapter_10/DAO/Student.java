package OCP.Chapter_10.DAO;

/**
 * Created by LitVV on 13.09.2016.
 */
public class Student {

    public static void main(String[] args) {

        Book book = new Book();
        book.setTitle("Head First Servlet");
        book.setIsbn(1);

        DAO dao = new DaoImpl();
        dao.createBook(book);

        System.out.println(dao.findBookByIsbn(book));
    }
}
