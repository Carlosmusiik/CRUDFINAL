/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.CRUD.repository;

import com.example.CRUD.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Carlos Molina
 */
public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
}
