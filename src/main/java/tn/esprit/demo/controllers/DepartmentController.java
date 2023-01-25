package tn.esprit.demo.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.demo.entities.Departement;
import tn.esprit.demo.services.IDepartmentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
@RequiredArgsConstructor

public class DepartmentController {
    @Autowired
      IDepartmentService iDepartmentService;

    @GetMapping("/all")
    public List<Departement> getAllDepartements() {
        return iDepartmentService.retrieveAllDepartements();
    }

    @PostMapping("/add")
    public Departement addDepartement(@RequestBody Departement d) {
        return iDepartmentService.addDepartement(d) ;
    }

    @PutMapping("/update")
    public Departement updateDepartement(@RequestBody Departement d) {
        return iDepartmentService.updateDepartement(d);
    }

    @GetMapping("/get/{idDepart}")
    public Optional<Departement> getDepartement(@PathVariable("idDepart") Integer idDepart) {
        return iDepartmentService.retrieveDepartement(idDepart);
    }
}
