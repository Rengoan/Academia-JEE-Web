package com.ceep.academia.service;

import com.ceep.academia.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

@Stateless
public class PersonaServiceImpl implements IPersonaServiceRemote {

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Antonio", "Recio", "arecio@gmail.com", "660485729"));
        personas.add(new Persona(2, "Luis", "Alonso", "lalonso@gmail.com", "633728187"));
        return personas;
    }

    @Override
    public Persona encontrarPersonaPorID(Persona persona) {
        return null;
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {
    }

    @Override
    public void actualizarPersona(Persona persona) {
    }

    @Override
    public void borrar(Persona persona) {
    }

}
