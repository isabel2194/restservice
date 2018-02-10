package miw.ws.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import miw.ws.model.Excursion;
import miw.ws.repositories.ExcursionRepository;

@Service
public class ExcursionServiceImpl implements ExcursionService{
	
	@Autowired
	private ExcursionRepository repository;

	@Override
	public List<String> getAllExcursiones() {
		List<String> excursiones = new ArrayList<String>();
		for(Excursion exc:repository.findAll()){
			excursiones.add(exc.toString());
		}
		return excursiones;
	}

	@Override
	public List<Excursion> getExcursiones() {
		return repository.findAll();
	}

}
