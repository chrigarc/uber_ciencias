package proyecto;

import proyecto.utils.PersonaDAO;

public class Main {

    public static void main(){
        try{
            PersonaDAO pdao = new PersonaDAO();
            System.out.println(pdao.obtenLista());
        }catch (Exception ex){
            System.err.println(ex);
        }
    }
}
