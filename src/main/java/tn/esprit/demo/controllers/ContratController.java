package tn.esprit.demo.controllers;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.demo.entities.Contrat;
import tn.esprit.demo.services.IContratService;

import java.util.List;

@RestController
@RequestMapping("/contrat")
@RequiredArgsConstructor
public class ContratController {

    @Autowired
    IContratService iContratService;

    public List<Contrat> retrieveAllContrats() {
        return  iContratService.retrieveAllContrats();
    }

    @PostMapping("/updateContrat")
    public Contrat updateContrat(@RequestBody Contrat ce) {
        return iContratService.updateContrat(ce);
    }

    @PostMapping("/addContrat")
    public Contrat addContrat(@RequestBody Contrat ce){
       return iContratService.addContrat(ce);

    }
    @GetMapping("/addContrat/{idContrat}")
    public Contrat retrieveContrat(@PathVariable("idContrat") Integer idContrat) {
        return iContratService.retrieveContrat(idContrat);
    }
    @DeleteMapping("/deleteContrat/{idContrat}")
    public void removeContrat(@PathVariable("idContrat") Integer idContrat) {
        iContratService.removeContrat(idContrat);
    }

}
