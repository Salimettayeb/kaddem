package tn.esprit.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.demo.entities.Departement;

@Repository
public interface IDepartmentRepository extends CrudRepository<Departement, Integer> {
}
