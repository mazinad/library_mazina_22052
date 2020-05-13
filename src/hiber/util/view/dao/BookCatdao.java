/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiber.util.view.dao;

import hiber.util.view.pojo.Bookcat;
import hiber.util.view.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BookCatdao {

    public void addCategory(Bookcat book) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(book);
        tx.commit();
        session.close();
    }

    public void updatecategory(Bookcat books) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(books);
        tx.commit();
        session.close();
    }
     public void deletecategory(String categoid) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
         Bookcat cat=new Bookcat(categoid);
        session.delete(cat);
        tx.commit();
        session.close();
     }
    public List<Bookcat> databookcat() {
        List<Bookcat> books = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Criteria cx = session.createCriteria(Bookcat.class);
        books = cx.list();
        tx.commit();
        session.close();
        return books;

    }
}
