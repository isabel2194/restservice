package miw.ws.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import miw.ws.model.Excursion;

@Repository
public interface ExcursionRepository extends JpaRepository<Excursion, Serializable>{

}
