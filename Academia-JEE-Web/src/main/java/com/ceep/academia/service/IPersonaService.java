package com.ceep.academia.service;

import com.ceep.academia.domain.Persona;
import java.util.List;
import javax.ejb.Local;

@Local
public interface IPersonaService {

    public List<Persona> listar();

    public Persona buscarPorId(Persona persona);

    public Persona buscarPorEmail(Persona persona);

    public void agregar();

    public void actualizar();

    public void borrar();

}
