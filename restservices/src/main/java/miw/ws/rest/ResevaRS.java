package miw.ws.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import miw.ws.model.Excursion;
import miw.ws.model.Reserva;
import miw.ws.model.Usuario;
import miw.ws.services.ReservaService;

@CrossOrigin
@RestController
@RequestMapping("/reserva")
public class ResevaRS {
	
	@Autowired
	ReservaService reservaService;
	
	@PostMapping(produces=MediaType.APPLICATION_JSON)
	public Response addReserva(Usuario usuario,Excursion excursion) {
		Reserva reserva = reservaService.addReserva(usuario,excursion);
		return Response.status(Response.Status.CREATED).entity(reserva).build();
	}
	
	@DeleteMapping(consumes=MediaType.APPLICATION_JSON,produces=MediaType.APPLICATION_JSON)
	public Response deleteReserva(Reserva reserva) {
		Reserva reservaEliminada = reservaService.deleteReserva(reserva);
		return Response.status(Response.Status.CREATED).entity(reservaEliminada).build();
	}
	
	@GetMapping(consumes=MediaType.APPLICATION_JSON,produces=MediaType.APPLICATION_JSON)
	public List<Reserva> getReservas(Usuario usuario) {
		List<Reserva> reservas = reservaService.getReservas(usuario);
		return reservas;
	}
	
	@GetMapping(path="{idReserva}",consumes=MediaType.APPLICATION_JSON,produces=MediaType.APPLICATION_JSON)
	public Reserva getReserva(@PathVariable int idReserva) {
		Reserva reserva = reservaService.getReserva(idReserva);
		return reserva;
	}

}
