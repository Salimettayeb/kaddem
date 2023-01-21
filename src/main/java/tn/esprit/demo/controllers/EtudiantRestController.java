package tn.esprit.demo.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.demo.entities.Etudiant;
import tn.esprit.demo.services.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
@RequiredArgsConstructor

public class EtudiantRestController {

    private final IEtudiantService iEtudiantService;

    @GetMapping("all")
    public List<Etudiant> getAllEtudiants() {
        return iEtudiantService.retrieveAllEtudiants();
    }

    @PostMapping("add")
    public Etudiant addEtudiant(@RequestBody Etudiant E) {
        return iEtudiantService.addEtudiant(E);
    }

    @PutMapping("/update")
    public Etudiant updateEtudiant(@RequestBody Etudiant E) {
        return iEtudiantService.updateEtudiant(E);
    }

    @GetMapping("/get/{idetudiant}")
    public Etudiant getEtudiant(@PathVariable("idetudiant") Integer idEtudiant) {
        return iEtudiantService.retrieveEtudiant(idEtudiant);
    }
    @DeleteMapping("/remove/{id}")
    public void removeetudiant (@PathVariable("id") Integer idEtudiant) {
          iEtudiantService.removeEtudiant(idEtudiant);

    }
    /*
    @GetMapping("/get/bydep/{name}")
    public List<Etudiant> getByNamedep(@PathVariable("name") String name) {
       return iEtudiantService.findEtudiantByDepartement(name);
    }

     */
/*
    @GetMapping("/get/byDep/{idDepart}")
    public List<Etudiant> getEtudiantsByDepartement(@PathVariable("idDepart") Integer idDepart) {
        return iEtudiantService.getEtudiantsByDepartement(idDepart);
    }

 */

   /* @PutMapping("/affecter/{idContrat}/{idEquipe}")
    public void addAndAssignEtudiantToEquipeAndContract(@RequestBody Etudiant E ,
                                                        @PathVariable("idContrat") Integer idContrat,
                                                        @PathVariable("idEquipe") Integer idEquipe) {
        iEtudiantService.addAndAssignEtudiantToEquipeAndContract(E,idContrat,idEquipe);
    }

    */
}
