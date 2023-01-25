package tn.esprit.demo.services;

import org.springframework.stereotype.Service;
import tn.esprit.demo.entities.Departement;

import java.util.List;
import java.util.Optional;

@Service
public interface IDepartmentService {
    List<Departement> retrieveAllDepartements();
    Departement addDepartement (Departement d);
    Departement updateDepartement (Departement d);
    Optional<Departement> retrieveDepartement (Integer idDepart);
}
