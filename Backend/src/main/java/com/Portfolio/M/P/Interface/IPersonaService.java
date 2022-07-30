package com.Portfolio.M.P.Interface;

import com.Portfolio.M.P.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    // Traer una lista de personas 
    public List<Persona> getPersona ();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    // Eliminar una objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por id
    public Persona findPersona (Long id);
    
} 
