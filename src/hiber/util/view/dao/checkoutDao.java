/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiber.util.view.dao;

import hiber.util.view.pojo.Book;
import hiber.util.view.pojo.Checkout;
import hiber.util.view.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author mazinad
 */
public class checkoutDao {
    public void addcheckout(Checkout out) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(out);
        tx.commit();
        session.close();
    }
    public List<Checkout> datacheck() {
        List<Checkout> check = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Criteria cx = session.createCriteria(Checkout.class);
        check= cx.list();
        tx.commit();
        session.close();
        return check;
}
    
}