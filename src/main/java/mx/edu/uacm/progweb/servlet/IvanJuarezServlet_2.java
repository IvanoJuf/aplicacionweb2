package mx.edu.uacm.progweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IvanJuarezServlet_2 extends HttpServlet {
	
  @Override
public void init(ServletConfig config) throws ServletException {
	  /**
	   * Si escribe un metodo init quetome un servlet config
	   * como argumento siempre llame a super.init() en la 
	   * primer linea
	   */
	  
	  /**
	   * ServletConfig cuenta con un metodo getInitParameter con el cual
	   * podemos buscar parametros
	   */
	super.init();
}	

  
  @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  /**
	   * Cada vez que vez que el servidor recibe una peticion par aun servlet 
	   * emite un nuevo subproceso y llama al metodo service  
	   */
		super.service(req, resp);
	}
  
  
  
  @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  
        String nombre = req.getParameter("nombre");
        System.out.println("el nombre es: " + nombre);
        
        String apellido = req.getParameter("apellido");
        System.out.println("el apellido es: " + apellido);
        
	    PrintWriter salida = resp.getWriter();
	 // Utilice salida para enviar el contenido al navegador web
		salida.print("Hola tu nombre es: " + nombre + " y tu apellido es: " + apellido);
	}
}
