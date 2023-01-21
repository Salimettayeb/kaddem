package tn.esprit.demo.services;


import org.springframework.stereotype.Service;
import tn.esprit.demo.entities.Etudiant;

import java.util.List;

@Service
public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiants();
    Etudiant  addEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
    Etudiant retrieveEtudiant(Integer idEtudiant);
    void removeEtudiant(Integer idEtudiant);
   /* List<Etudiant> findEtudiantByDepartement(String nomDepart);*/
   /* Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant etudiant, Integer idContrat, Integer
            idEquipe);

    */
  /*  List<Etudiant> getEtudiantsByDepartement(Integer idDep);*/

}
