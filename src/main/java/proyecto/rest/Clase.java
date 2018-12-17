package proyecto.rest;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;
import java.util.LinkedList;

import proyecto.bd.*;
import proyecto.utils.HibernateUtil;
import proyecto.utils.PersonaDAO;

@Path("/clase") 
public class Clase{
	
	/*http://localhost:8080/proyecto/app/clase/conductores*/
	@GET
	@Path("/conductores")
	@Produces(MediaType.APPLICATION_JSON)
	public String conductores() {   
	    
	    List result = new LinkedList();
	    try {
	    	Session session = HibernateUtil.getSessionFactory().openSession();
	    	session.beginTransaction();
	        result = session.createQuery( "from Conductor" ).list();
	    }catch(Exception ex) {
	    	result.add(ex.toString());
	    }
	    
        JSONArray json = new JSONArray(result);
		return json.toString();
	}
	
	/*http://localhost:8080/proyecto/app/clase/conductor/?id=x*/
	@GET
	@Path("/conductor")
	@Produces(MediaType.APPLICATION_JSON)
	public String conductor(@QueryParam("id")String id) {
	    
	    Object result = "Not found";
	    try {
	    	Session session = HibernateUtil.getSessionFactory().openSession();
	    	session.beginTransaction();
	    	result = session.get(Conductor.class, id); 
	    }catch(Exception ex) {
	    	result = ex;
	    }
	    
	    JSONObject json = new JSONObject(result);
		return json.toString();
	}
	
	
	/*http://localhost:8080/proyecto/app/clase/personas*/
	@GET
	@Path("/personas")
	@Produces(MediaType.APPLICATION_JSON)
	public String personas() {
	    
	    List result = new LinkedList();
	    try {
	    	Session session = HibernateUtil.getSessionFactory().openSession();
	    	session.beginTransaction();
	        result = session.createQuery( "from Persona" ).list();
	    }catch(Exception ex) {
	    	result.add(ex.toString());
	    }
	    
        JSONArray json = new JSONArray(result);
		return json.toString();
	}
	
	/*http://localhost:8080/proyecto/app/clase/persona/?id=x*/
	@GET
	@Path("/persona")
	@Produces(MediaType.APPLICATION_JSON)
	public String persona(@QueryParam("id")String id) {
	    
	    Object result = "Not found";
	    try {
	    	Session session = HibernateUtil.getSessionFactory().openSession();
	    	session.beginTransaction();
	    	result = session.get(Persona.class, id); 
	    }catch(Exception ex) {
	    	result = ex;
	    }
	    
	    JSONObject json = new JSONObject(result);
		return json.toString();
	}
	
	@POST
	@Path("/persona")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
	@Produces(MediaType.APPLICATION_JSON)
	public String insert_persona(@FormParam("nombre")String nombre,
			@FormParam("paterno")String paterno, 
			@FormParam("materno")String materno, 
			@FormParam("id_direccion")int id_direccion, 
			@FormParam("email")String email, 
			@FormParam("telefono_celular")String telefono_celular, 
			@FormParam("telefono_casa")String telefono_casa, 
			@FormParam("rfc")String rfc) {
		 Object result =  new JSONObject()
				 .put("message", "Error al guardar");
		 Transaction tx = null;
			
		    try {
		    	Session session = HibernateUtil.getSessionFactory().openSession();
		    	tx = session.beginTransaction();		    	
		    	Object objeto = new Persona(nombre, paterno, materno, id_direccion, email, telefono_celular, telefono_casa, rfc);
		    	session.save(objeto); 
		    	result = new JSONObject(objeto);
		    	//tx.rollback();
	            tx.commit(); 
		    }catch(Exception ex) {
		    	result = ex;
		    	ex.printStackTrace();
		    	if(tx != null) {
		    		tx.rollback();
		    	}
		    }
		    		   
			return result.toString();
	}
	
	/*http://localhost:8080/proyecto/app/clase/clientes*/
	@GET
	@Path("/clientes")
	@Produces(MediaType.APPLICATION_JSON)
	public String clientes() {
	    
	    List result = new LinkedList();
	    try {
	    	Session session = HibernateUtil.getSessionFactory().openSession();
	    	session.beginTransaction();
	        result = session.createQuery( "from Cliente" ).list();
	    }catch(Exception ex) {
	    	result.add(ex.toString());
	    }
	    
        JSONArray json = new JSONArray(result);
		return json.toString();
	}
	
	/*http://localhost:8080/proyecto/app/clase/cliente/?id=x*/
	@GET
	@Path("/cliente")
	@Produces(MediaType.APPLICATION_JSON)
	public String cliente(@QueryParam("id")String id) {
	    
	    Object result = "Not found";
	    try {
	    	Session session = HibernateUtil.getSessionFactory().openSession();
	    	session.beginTransaction();
	    	result = session.get(Cliente.class, id); 
//	    	System.out.println(((Cliente)result).getPersona());
	    }catch(Exception ex) {
	    	result = ex;
	    }
	    
	    JSONObject json = new JSONObject(result);
		return json.toString();
	}
	
	/*http://localhost:8080/proyecto/app/clase/tipos_clientes*/
	@GET
	@Path("/tipos_clientes")
	@Produces(MediaType.APPLICATION_JSON)
	public String tipos_clientes() {
	    
	    List result = new LinkedList();
	    try {
	    	Session session = HibernateUtil.getSessionFactory().openSession();
	    	session.beginTransaction();
	        result = session.createQuery( "from TipoCliente" ).list();
	    }catch(Exception ex) {
	    	result.add(ex.toString());
	    }
	    
        JSONArray json = new JSONArray(result);
		return json.toString();
	}
	
	/*http://localhost:8080/proyecto/app/clase/tipo_cliente/?id=x*/
	@GET
	@Path("/tipo_cliente")
	@Produces(MediaType.APPLICATION_JSON)
	public String tipo_cliente(@QueryParam("id")String id) {
	    
	    Object result = "Not found";
	    try {
	    	Session session = HibernateUtil.getSessionFactory().openSession();
	    	session.beginTransaction();
	    	Object r = session.get(TipoCliente.class, id); 
	    	result = r!=null?r:result;
	    }catch(Exception ex) {
	    	result = ex;
	    }
	    
	    JSONObject json = new JSONObject(result);
		return json.toString();
	}
	
	/*http://localhost:8080/proyecto/app/clase/modelos*/
	@GET
	@Path("/modelos")
	@Produces(MediaType.APPLICATION_JSON)
	public String modelos() {
	    
	    List result = new LinkedList();
	    try {
	    	Session session = HibernateUtil.getSessionFactory().openSession();
	    	session.beginTransaction();
	        result = session.createQuery( "from Modelo" ).list();
	    }catch(Exception ex) {
	    	result.add(ex.toString());
	    }
	    
        JSONArray json = new JSONArray(result);
		return json.toString();
	}
	
	/*http://localhost:8080/proyecto/app/clase/modelo/?id=x*/
	@GET
	@Path("/modelo")
	@Produces(MediaType.APPLICATION_JSON)
	public String modelo(@QueryParam("id")String id) {
	    
	    Object result = "Not found";
	    try {
	    	Session session = HibernateUtil.getSessionFactory().openSession();
	    	session.beginTransaction();
	    	Object r = session.get(Modelo.class, id); 
	    	result = r!=null?r:result;
	    }catch(Exception ex) {
	    	result = ex;
	    }
	    
	    JSONObject json = new JSONObject(result);
		return json.toString();
	}
	
	/*http://localhost:8080/proyecto/app/clase/vehiculos*/
	@GET
	@Path("/vehiculos")
	@Produces(MediaType.APPLICATION_JSON)
	public String vehiculos() {
	    
	    List result = new LinkedList();
	    try {
	    	Session session = HibernateUtil.getSessionFactory().openSession();
	    	session.beginTransaction();
	        result = session.createQuery( "from Vehiculo" ).list();
	    }catch(Exception ex) {
	    	result.add(ex.toString());
	    }
	    
        JSONArray json = new JSONArray(result);
		return json.toString();
	}
	
	/*http://localhost:8080/proyecto/app/clase/vehiculo/?id=x*/
	@GET
	@Path("/vehiculo")
	@Produces(MediaType.APPLICATION_JSON)
	public String vehiculo(@QueryParam("id")String id) {
	    
	    Object result = "Not found";
	    try {
	    	Session session = HibernateUtil.getSessionFactory().openSession();
	    	session.beginTransaction();
	    	Object r = session.get(Vehiculo.class, id); 
	    	result = r!=null?r:result;
	    }catch(Exception ex) {
	    	result = ex;
	    }
	    
	    JSONObject json = new JSONObject(result);
		return json.toString();
	}
	
	/*http://localhost:8080/proyecto/app/clase/direcciones*/
	@GET
	@Path("/direcciones")
	@Produces(MediaType.APPLICATION_JSON)
	public String direcciones() {
	    
	    List result = new LinkedList();
	    try {
	    	Session session = HibernateUtil.getSessionFactory().openSession();
	    	session.beginTransaction();
	        result = session.createQuery( "from Direccion" ).list();
	    }catch(Exception ex) {
	    	result.add(ex.toString());
	    }
	    
        JSONArray json = new JSONArray(result);
		return json.toString();
	}
	
	/*http://localhost:8080/proyecto/app/clase/direccion/?id=x*/
	@GET
	@Path("/direccion")
	@Produces(MediaType.APPLICATION_JSON)
	public String direccion(@QueryParam("id")int id) {
	    
	    Object result = "Not found";
	    try {
	    	Session session = HibernateUtil.getSessionFactory().openSession();
	    	session.beginTransaction();
	    	Object r = session.get(Direccion.class, id); 
	    	result = r!=null?r:result;
	    }catch(Exception ex) {
	    	result = ex;
	    }
	    
	    JSONObject json = new JSONObject(result);
		return json.toString();
	}
	
	@POST
	@Path("/direccion")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
	@Produces(MediaType.APPLICATION_JSON)
	public String insert_direccion(
	    @FormParam("calle")String calle, 
	    @FormParam("avenida")String avenida, 
	    @FormParam("numero")int numero, 
	    @FormParam("colonia")String colonia, 
	    @FormParam("codigo_postal")int codigo_postal)
	   {
	   Object result =  new JSONObject()
	       .put("message", "Error al guardar");
	   Transaction tx = null;
	    
	      try {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        tx = session.beginTransaction();		    	
	        Object objeto = new Direccion(calle, avenida, numero, colonia, codigo_postal);
	        session.save(objeto); 
	        result = new JSONObject(objeto);
	        //tx.rollback();
	            tx.commit(); 
	      }catch(Exception ex) {
	        result = ex;
	        ex.printStackTrace();
	        if(tx != null) {
	          tx.rollback();
	        }
	      }
	             
	    return result.toString();
	}

	@POST
	@Path("/pedir_viaje")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
	@Produces(MediaType.APPLICATION_JSON)
	public String pedir_viaje(
	    @FormParam("email_cliente")String email_cliente, 
	    @FormParam("id_direccion_origen")int id_direccion_origen, 
	    @FormParam("id_direccion_destino")int id_direccion_destino,  
	    @FormParam("cantidad_personas")int cantidad_personas)
	   {
	   Object result =  new JSONObject()
	       .put("message", "Error al guardar");
	   Transaction tx = null;
	    
	      try {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        tx = session.beginTransaction();		    	
	        Direccion origen = session.get(Direccion.class, id_direccion_origen);
	        Direccion destino = session.get(Direccion.class, id_direccion_destino);
	        Object objeto = new Viaje(email_cliente, origen, destino, cantidad_personas);
	        session.save(objeto);  
	        result = new JSONObject(objeto);
	        //tx.rollback();
	            tx.commit(); 
	      }catch(Exception ex) {
	        result = ex;
	        ex.printStackTrace();
	        if(tx != null) {
	          tx.rollback();
	        }
	      }
	             
	    return result.toString();
	}
	
	/*http://localhost:8080/proyecto/app/clase/all*/
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public String all() {	
		ArrayList<Datos> datos = new ArrayList<>();
		datos.add(new Datos("hola","","",""));
		datos.add(new Datos("nombre1", "primerApellido1", "segundoApellido1", "correo1@correo.com"));
		datos.add(new Datos("nombre2", "primerApellido2", "segundoApellido2", "correo2@correo.com"));
		datos.add(new Datos("nombre3", "primerApellido3", "segundoApellido3", "correo3@correo.com"));
		datos.add(new Datos("nombre4", "primerApellido4", "segundoApellido4", "correo4@correo.com"));
		datos.add(new Datos("nombre5", "primerApellido5", "segundoApellido5", "correo5@correo.com"));
		
		JSONArray json = new JSONArray(datos);
		return json.toString();
	}
	
	/*http://localhost:8080/proyecto/app/clase/getOne/?id=x*/
	@GET
	@Path("/getOne")
	@Produces(MediaType.APPLICATION_JSON)
	public String getOne(@QueryParam("id")String id) {
		
		JSONObject json = new JSONObject(new Datos("nombre"+id, "primerApellido"+id, "segundoApellido"+id, "correo"+id+"@correo.com"));
		return json.toString();
	}
	
	/*http://localhost:8080/proyecto/app/clase/setOneData*/
	@POST
	@Path("/setOneData")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String setOneData(@FormParam("valor") String valor) {
		JSONObject json = new JSONObject();
		json.put("object", new Datos(valor, "primerApellido1", "segundoApellido1", "correo1@correo.com"));
		return json.toString();
	}
	
	/*http://localhost:8080/proyecto/app/clase/setData*/
	@POST
	@Path("/setData")
	@Produces(MediaType.APPLICATION_JSON)
	public String setData(@FormParam("nombre") String nombre,
						  @FormParam("primerApellido") String primerApellido,
						  @FormParam("segundoApellido") String segundoApellido) {
		JSONObject json = new JSONObject();
		json.put("message", "Carga exitosa");
		return json.toString();
	}
	
	
	
}