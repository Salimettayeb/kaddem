package tn.esprit.demo.entities;

import lombok.Getter;
import lombok.Setter;
import tn.esprit.demo.enums.Option;

import javax.persistence.*;

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


}
