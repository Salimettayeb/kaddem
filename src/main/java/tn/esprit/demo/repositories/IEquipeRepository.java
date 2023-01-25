package tn.esprit.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.demo.entities.Equipe;

public interface IEquipeRepository extends CrudRepository<Equipe, Integer> {
}
