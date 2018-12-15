package proyecto.utils;


import org.hibernate.SessionFactory;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil
{
    private static final SessionFactory sessionFactory;

    static
    {
        try
        {
        	 StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
     				.configure() // configures settings from hibernate.cfg.xml
     				.build();
        	 sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
        } catch (Exception he)
        {
            System.err.println("Ocurrió un error en la inicialización de la SessionFactory: " + he);
            throw new ExceptionInInitializerError(he);
        }
    }

    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
}
