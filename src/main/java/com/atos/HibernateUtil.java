package com.atos;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory SESSION_FACTORY = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(Persons.class);
            configuration.configure();
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            System.out.println("Success");

            return sessionFactory;
        }
        catch(Throwable throwable)
        {
            throw new ExceptionInInitializerError(throwable);
        }
    }

    public static SessionFactory getSessionFactory()
    {
        return SESSION_FACTORY;
    }

}
