package miw.ws.services;

import miw.ws.model.Usuario;

public interface UsuarioService {
	
	public Usuario addUsuario(Usuario usuario);
	
	public boolean login(String username, String password);

}
