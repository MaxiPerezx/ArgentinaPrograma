package com.Portfolio.M.P.Repository;

import com.Portfolio.M.P.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
