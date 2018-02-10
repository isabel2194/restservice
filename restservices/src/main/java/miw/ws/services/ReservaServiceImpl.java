package miw.ws.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import miw.ws.model.Excursion;
import miw.ws.model.Reserva;
import miw.ws.model.Status;
import miw.ws.model.Usuario;
import miw.ws.repositories.ReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService{
	
	@Autowired
	private ReservaRepository repository;
	

	public Reserva addReserva(Usuario usuario, Excursion excursion) {
		Reserva reserva = new Reserva();
		reserva.setEstado(Status.ACTIVE);
		reserva.setExcursion(excursion);
		reserva.setUsuario(usuario);
		return repository.save(reserva);
	}

	public Reserva deleteReserva(Reserva reserva) {
		reserva.setEstado(Status.CANCELLED);
		return repository.save(reserva);
	}

	public List<Reserva> getReservas(Usuario usuario) {
		return repository.findAllByUsuario(usuario);
	}

	public Reserva getReserva(int idReserva) {
		return repository.findOneById(idReserva);
	}

}
