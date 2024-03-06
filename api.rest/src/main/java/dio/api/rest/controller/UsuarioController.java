package dio.api.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.api.rest.model.Usuario;
import dio.api.rest.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @GetMapping()
    public List<Usuario> getUsuarios() {
        return repository.findAll();
    }

    @GetMapping("/{username}")
    public Usuario getUsuario(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }

    @PostMapping()
    public void store(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }
}
