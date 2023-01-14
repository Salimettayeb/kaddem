package tn.esprit.demo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUniv ;
    private String nom ;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "universite")
    private List<Departement> departements;

}
