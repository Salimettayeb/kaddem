package tn.esprit.demo.services;


import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.demo.entities.Etudiant;
import tn.esprit.demo.repositories.IEtudiantRepository;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Service
@Slf4j

public class EtudiantImpl implements IEtudiantService{

    @Autowired
    IEtudiantRepository iEtudiantRepository;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return (List<Etudiant>) iEtudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return iEtudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return iEtudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return iEtudiantRepository.findById(idEtudiant).orElse(null);
    }



    @Override
    public void removeEtudiant(Integer idEtudiant) {
    iEtudiantRepository.deleteById(idEtudiant);
    }
/*
    @Override
    public List<Etudiant> findEtudiantByDepartement(String nomDepart) {
        return iEtudiantRepository.findEtudiantByDepartement(nomDepart);
    }

 */

   /* @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant etudiant, Integer idContrat, Integer idEquipe) {
        return iEtudiantRepository.;
    }

    */
/*
    @Override
    public List<Etudiant> getEtudiantsByDepartement(Integer idDep) {
        return iEtudiantRepository.getEtudiantsByDepartement(idDep);
    }

 */
}
