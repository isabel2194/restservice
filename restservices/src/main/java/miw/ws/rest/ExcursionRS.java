package miw.ws.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import miw.ws.model.Excursion;
import miw.ws.services.ExcursionService;

@RestController
@RequestMapping("/excursiones")
public class ExcursionRS {
	
	@Autowired
	private ExcursionService service;
	
	@CrossOrigin
	@GetMapping(produces=MediaType.APPLICATION_JSON)
	public List<String> getAllExcursiones(){
		return service.getAllExcursiones();
	}
	
	@CrossOrigin
	@GetMapping(path="/internal",produces=MediaType.APPLICATION_JSON)
	public List<Excursion> getExcursiones(){
		return service.getExcursiones();
	}

}
