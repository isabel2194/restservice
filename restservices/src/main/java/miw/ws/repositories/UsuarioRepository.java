package miw.ws.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import miw.ws.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Serializable>{
	
	public Usuario findByNombreUsuarioAndPassword(String nombreUsuario, String password);

}
