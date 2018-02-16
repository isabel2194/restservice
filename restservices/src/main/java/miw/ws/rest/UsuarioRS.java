package miw.ws.rest;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import miw.ws.model.Rol;
import miw.ws.model.Usuario;
import miw.ws.services.UsuarioService;

@CrossOrigin
@RestController
@RequestMapping("/usuario")
public class UsuarioRS {
	
	@Autowired
	private UsuarioService service;
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON, produces=MediaType.APPLICATION_JSON)
	public Usuario addUser(@RequestBody Usuario usuario){
		System.out.println(usuario.toString());
		usuario.setRol(Rol.usuario);
		return service.addUsuario(usuario);
	}
	
	@PostMapping(path="/login",consumes=MediaType.APPLICATION_JSON, produces=MediaType.APPLICATION_JSON)
	public boolean login(@RequestBody Usuario usuario){
		return service.login(usuario.getNombreUsuario(),usuario.getPassword());
	}

}
