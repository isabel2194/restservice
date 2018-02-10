package miw.ws.services;

import java.util.List;

import miw.ws.model.Excursion;
import miw.ws.model.Reserva;
import miw.ws.model.Usuario;

public interface ReservaService {
	
	public Reserva addReserva(Usuario usuario, Excursion excursion);

	public Reserva deleteReserva(Reserva reserva);
	
	public List<Reserva> getReservas(Usuario usuario);
	
	public Reserva getReserva(int idReserva);

}
