package miw.ws.rest;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import miw.ws.model.Usuario;
import miw.ws.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioRS {
	
	@Autowired
	private UsuarioService service;
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON, produces=MediaType.APPLICATION_JSON)
	public Usuario addUser(Usuario usuario){
		return service.addUsuario(usuario);
	}
	
	@PostMapping(path="/login",consumes=MediaType.APPLICATION_JSON, produces=MediaType.APPLICATION_JSON)
	public boolean login(String username, String password){
		return service.login(username, password);
	}

}
