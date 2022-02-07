package com.ceep.academia.client;

import com.ceep.academia.domain.Persona;
import com.ceep.academia.service.IPersonaServiceRemote;
import java.util.*;
import javax.naming.*;

public class ClientePersonaService {

    public static void main(String[] args) {

        System.out.println("Iniciando llamada al EJB desde el cliente");

        try {
            Context jndi = new InitialContext();
//            IPersonaServiceRemote personaService = (IPersonaServiceRemote) jndi.lookup("java:global/Academia-JEE-1.0/PersonaServiceImpl!com.ceep.academia.service.IPersonaServiceRemote");
//            List<Persona> personas = personaService.listarPersonas();
//
//            for (Persona persona : personas) {
//                System.out.println(persona);

            

            System.out.println("Fin llamada al EJB desde el Cliente");

        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }

    }
}
