package tn.esprit.demo.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.demo.entities.Contrat;

@Repository
public interface IContratRepository  extends CrudRepository<Contrat, Integer> {
}
