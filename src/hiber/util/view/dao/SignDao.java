/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiber.util.view.dao;

import hiber.util.view.pojo.Signup;
import hiber.util.view.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author mazinad
 */
public class SignDao {
    public void addSignup(Signup up){
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        session.save(up);
        tx.commit();
        session.close();
    }
     public String createSignup(String username){
         String password=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        List signs=session.createCriteria(Signup.class).add(Restrictions.eq("username", username)).setProjection(Projections.property("password")).list();
        tx.commit();
        session.close();
         for (Object a : signs) {
             password=a.toString();
         }
        return password;
}
}
