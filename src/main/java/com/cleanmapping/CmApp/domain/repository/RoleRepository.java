/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cleanmapping.CmApp.domain.repository;

import com.cleanmapping.CmApp.domain.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author REN
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name); 
}
