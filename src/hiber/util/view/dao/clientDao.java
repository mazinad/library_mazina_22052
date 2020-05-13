/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiber.util.view.dao;

import hiber.util.view.pojo.Client;
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
public class clientDao {
    public void addClient(Client client){
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        session.save(client);
        tx.commit();
        session.close();
    }
    public void updateClient(Client cl){
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        session.update(cl);
        tx.commit();
        session.close();
    }
    public void deleteClient(String regno){
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        Client cl=new Client(regno);
        session.delete(cl);
        tx.commit();
        session.close();
    }
    public List<Client>dataclient(){
        List<Client>clients=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        Criteria cx=session.createCriteria(Client.class);
        clients=cx.list();
        tx.commit();
        session.close();
        return clients;
    }
    public List<Client> findbyclient(String regno){
        List<Client>clientss=null;
         Session session=HibernateUtil.getSessionFactory().openSession();
         Transaction tx=session.beginTransaction();
         clientss=session.createCriteria(Client.class).add(Restrictions.eq("regno", regno)).list();
         tx.commit();
         session.close();
         return clientss;
    }
    public String getRegno(String name){
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        Object id=session.createQuery("select regno from client where firstname||' '||latname='"+name+"'").uniqueResult();
        tx.commit();
        session.close();
        return id.toString();
    }
}
