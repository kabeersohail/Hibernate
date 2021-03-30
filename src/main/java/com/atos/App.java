package com.atos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Persons p = new Persons();
        p.setFirstName("kabeer");
        p.setLastName("sohail");
        p.setId(110);
        session.save(p);
        transaction.commit();
        session.close();
    }
}
