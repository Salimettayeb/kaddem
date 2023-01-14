package tn.esprit.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import tn.esprit.demo.enums.Option;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEtudiant ;
    private String prenom ;
    private String nom ;
    @Enumerated(EnumType.STRING)
    private Option optionEtudiant ;

    @ManyToOne(cascade = CascadeType.ALL)
    Departement departement;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.PERSIST,mappedBy = "etudiant" ,fetch = FetchType.EAGER)
    private List<Contrat> contarts;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Equipe> equipes;

}
