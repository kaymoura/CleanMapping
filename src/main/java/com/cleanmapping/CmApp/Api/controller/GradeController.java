/**
 * FastFood API
 * API básica para melhoria e implementação.
 * 
 * Endpoint: Grade
 */
package com.cleanmapping.CmApp.Api.controller;

import com.cleanmapping.CmApp.domain.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implementa RestController de Usuario
 * @author Equipe Clean Mapping - Kaylane e Renan
 */
@RestController
public class GradeController {
    @Autowired
    private GradeRepository gradeRepository;
}
