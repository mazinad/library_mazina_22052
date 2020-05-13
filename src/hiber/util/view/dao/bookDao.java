package hiber.util.view.dao;

import hiber.util.view.pojo.Book;
import hiber.util.view.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class bookDao {

    public void addBook(Book book) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(book);
        tx.commit();
        session.close();
    }

    public void updateBook(Book books) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(books);
        tx.commit();
        session.close();
    }
    public void deleteBook(String bookid ){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Book bck=new Book(bookid);
        session.delete(bck);
        tx.commit();
        session.close();
    }

    public List<Book> databook() {
        List<Book> books = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Criteria cx = session.createCriteria(Book.class);
        books = cx.list();
        tx.commit();
        session.close();
        return books;
    }
    public List<Book> findByBook(String bookid){
        List<Book> books = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        books=session.createCriteria(Book.class).add(Restrictions.eq("bookid",bookid)).list();
        tx.commit();
        session.close();
        return books;
    }
}
