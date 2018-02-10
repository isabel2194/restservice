package miw.ws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import miw.ws.model.Usuario;
import miw.ws.repositories.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioRepository repository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public Usuario addUsuario(Usuario usuario) {
		//ciframos la contraseña al guardar en base de datos
		usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
		return repository.save(usuario);
	}

	@Override
	public boolean login(String username, String password) {
		
		if(repository.findByNombreUsuarioAndPassword(username,passwordEncoder.encode(password))!=null)
			return true;
		return false;
	}

}
