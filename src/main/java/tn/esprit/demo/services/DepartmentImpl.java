package tn.esprit.demo.services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.demo.entities.Departement;
import tn.esprit.demo.repositories.IDepartmentRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Service
@Slf4j
public class DepartmentImpl implements IDepartmentService{

    @Autowired
    IDepartmentRepository iDepartmentRepository;

    @Override
    public List<Departement> retrieveAllDepartements() {
        return (List<Departement>) iDepartmentRepository.findAll();
    }

    @Override
    public Departement addDepartement(Departement d) {
        return iDepartmentRepository.save(d);
    }

    @Override
    public Departement updateDepartement(Departement d) {
        return iDepartmentRepository.save(d);
    }

    @Override
    public Optional<Departement> retrieveDepartement(Integer idDepart) {
        return iDepartmentRepository.findById(idDepart) ;
    }
}
