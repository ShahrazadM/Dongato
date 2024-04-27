package prevencion.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import basedatitos.Clientes;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class ListarCapacitaciones
 */

@WebServlet(name = "ListarCapacitacion", urlPatterns = {"/ListarCapacitacion"})
public class ListarCapacitacion extends HttpServlet {
	 
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	

}
 @Override   
    

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Establecer atributo en la solicitud para que la página JSP pueda acceder a las capacitaciones
    	List <Clientes>listaCapacitacion = new ArrayList<> ();
listaCapacitacion.add(new Clientes("nombre" , "apellidos", "direccion45"));
listaCapacitacion.add(new Clientes("nombre1" , "apellidosg", "direccion45"));
listaCapacitacion.add(new Clientes("nombre2" , "apellidosj", "direccion2"));

HttpSession misesion = request.getSession();
misesion.setAttribute("listarCapacitacion", listaCapacitacion);
response.sendRedirect("listarcapacitacion.jsp");
 }
}
