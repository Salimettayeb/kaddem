package tn.esprit.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.demo.entities.Etudiant;

@Repository
public interface IEtudiantRepository extends CrudRepository<Etudiant, Integer> {

}
