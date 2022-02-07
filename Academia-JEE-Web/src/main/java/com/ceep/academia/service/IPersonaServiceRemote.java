package com.ceep.academia.service;

import com.ceep.academia.domain.Persona;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface IPersonaServiceRemote {

    public List<Persona> listarPersonas();

    public Persona encontrarPersonaPorID(Persona persona);

    public Persona encontrarPersonaPorEmail(Persona persona);

    public void registrarPersona(Persona persona);

    public void actualizarPersona(Persona persona);

    public void borrar(Persona persona);

}
