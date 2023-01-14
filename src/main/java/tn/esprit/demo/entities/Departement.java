package tn.esprit.demo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Getter
@Setter
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDepart ;
    private String nomDepart ;

    @ManyToOne(cascade = CascadeType.ALL)
    Universite universite;

    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "departement")
    private List<Etudiant> etudiants;
}
