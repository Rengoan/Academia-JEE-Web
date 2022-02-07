package com.ceep.academia.web;

import com.ceep.academia.domain.Persona;
import com.ceep.academia.service.IPersonaService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/personas")
public class PersonaServlet extends HttpServlet {
    
    @Inject
    IPersonaService personaService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        List<Persona> personas = personaService.listar();
        System.out.println("Persona: "+personas);
        
        request.setAttribute("personas", personas);
        request.getRequestDispatcher("/listadoPersonas.jsp").forward(request,
                response);
        
    }
    
    
    
}
