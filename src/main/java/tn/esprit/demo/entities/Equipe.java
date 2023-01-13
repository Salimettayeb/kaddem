package tn.esprit.demo.entities;


import lombok.Getter;
import lombok.Setter;
import tn.esprit.demo.enums.Niveau;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEquipe ;
    private String nomEquipe ;

    @Enumerated(EnumType.STRING)
    private Niveau niveau ;
}
