package tn.esprit.demo.entities;

import lombok.Getter;
import lombok.Setter;
import tn.esprit.demo.enums.Option;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEtudiant ;
    private String prenom ;
    private String nom ;
    @Enumerated(EnumType.STRING)
    private Option optionEtudiant ;

    @ManyToOne(cascade = CascadeType.ALL)
    Departement departement;

    @OneToMany(cascade = CascadeType.PERSIST,mappedBy = "etudiant")
    private List<Contrat> contarts;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Equipe> equipes;




}
