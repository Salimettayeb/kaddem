package tn.esprit.demo.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.demo.entities.Departement;
import tn.esprit.demo.entities.Equipe;
import tn.esprit.demo.services.IDepartmentService;
import tn.esprit.demo.services.IEquipeService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/equipe")
@RequiredArgsConstructor

public class EquipeController {
    @Autowired
    IEquipeService iEquipeService;

    @GetMapping("/all")
    public List<Equipe> getAllEquipes() {
        return iEquipeService.retrieveAllEquipes();
    }

    @PostMapping("/add")
    public Equipe addEquipe(@RequestBody Equipe e) {
        return iEquipeService.addEquipe(e) ;
    }

    @PutMapping("/update")
    public Equipe updateEquipe(@RequestBody Equipe e) {
        return iEquipeService.updateEquipe(e);
    }

    @GetMapping("/get/{idEquipe}")
    public Optional<Equipe> getEquipe(@PathVariable("idEquipe") Integer idEquipe) {
        return iEquipeService.retrieveEquipe(idEquipe);
    }
}
