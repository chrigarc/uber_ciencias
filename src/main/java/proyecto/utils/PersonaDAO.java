package proyecto.utils;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import proyecto.bd.Persona;

public class PersonaDAO {

    private Session sesion;
    private Transaction tx;

    public static void main(String[] pps) {
    	System.out.println("gola");
    	try
    	{	
    		
    		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();	
    		Connection  conn = DriverManager.getConnection("jdbc:sqlserver://;serverName=localhost;databaseName=master", "fciencias", "fciencias");
    		Statement stmt = null;
    		ResultSet rs = null;
    		stmt = conn.createStatement();
		    rs = stmt.executeQuery("SELECT 1 as uno");	
		    while(rs.next()) {
		    	System.out.println(rs.getInt("uno"));
		    }


    	}catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
    
    public List<Persona> obtenLista() throws HibernateException
    {
        List<Persona> lista = null;

        try
        {
            iniciaOperacion();
            lista = sesion.createQuery("from Persona").list();
        }catch(Exception ex) {
        	System.err.println(ex);
        	ex.printStackTrace();
        }
        finally
        {
        //    sesion.close();
        }

        return lista;
    }

    private void iniciaOperacion() throws HibernateException
    {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }


}
