package com.portfolio.mgb.Interface;

import com.portfolio.mgb.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    // Traer persona
    public List<Persona> getPersona();
    
    //Guardar objeto tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar persona
    public void deletePersona(Long id);
    
    //Buscar persona por ID
    public Persona findPersona(Long id);
    
    
}
