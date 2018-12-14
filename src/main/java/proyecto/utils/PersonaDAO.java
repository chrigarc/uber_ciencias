package proyecto.utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import proyecto.bd.Persona;

import java.util.List;

public class PersonaDAO {

    private Session sesion;
    private Transaction tx;


    public List<Persona> obtenLista() throws HibernateException
    {
        List<Persona> lista = null;

        try
        {
            iniciaOperacion();
            lista = sesion.createQuery("from Persona").list();
        }catch(Exception ex) {
        	ex.printStackTrace();
        }
        finally
        {
            sesion.close();
        }

        return lista;
    }

    private void iniciaOperacion() throws HibernateException
    {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }


}
