/**
 * FastFood API
 * API básica para melhoria e implementação.
 * 
 * Endpoint: Usuario
 */
package com.cleanmapping.CmApp.Api.controller;

//import com.cleanmapping.CmApp.domain.model.Usuario;
import com.cleanmapping.CmApp.domain.repository.UsuarioRepository;
//import java.util.List;
//import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implementa RestController de Usuario
 * @author Equipe Clean Mapping - Kaylane e Renan
 */
@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

//    @GetMapping("/usuario")
//    public List<Usuario> showAllUsuario() {
//        return usuarioRepository.findAll();
//    }
//    
//    @GetMapping("/usuario/{usuarioId}")
//    public ResponseEntity<Usuario> showUsuario(@PathVariable Long usuarioId) {
//        Optional<Usuario> usuario = usuarioRepository.findById(usuarioId);
//        if (usuario.isPresent()) {
//            return ResponseEntity.ok(usuario.get());
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//    
//    @PostMapping("/usuario")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Usuario addUsuario(@RequestBody Usuario usuario) {
//        return usuarioRepository.save(usuario);
//    }
}
