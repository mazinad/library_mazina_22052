/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiber.util.view.dao;

import hiber.util.view.pojo.Checkin;
import hiber.util.view.pojo.Checkout;
import hiber.util.view.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author mazinad
 */
public class checkinDao {
    public void addcheckin(Checkin in) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(in);
        tx.commit();
        session.close();
    }
    public List<Checkin> datacheck() {
        List<Checkin> checkiin = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Criteria cx = session.createCriteria(Checkin.class);
        checkiin= cx.list();
        tx.commit();
        session.close();
        return checkiin;
}
    public List<Checkin> findbycheckin(String regno){
        List<Checkin> checkin = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        checkin=session.createCriteria(Checkin.class).add(Restrictions.eq("regno",regno)).list();
        tx.commit();
        session.close();
        return checkin;
    }
}
