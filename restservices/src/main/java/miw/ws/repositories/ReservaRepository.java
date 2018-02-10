package miw.ws.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import miw.ws.model.Reserva;
import miw.ws.model.Usuario;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Serializable>{
	
	public List<Reserva> findAllByUsuario(Usuario usuario);
	public Reserva findOneById(int id);

}
