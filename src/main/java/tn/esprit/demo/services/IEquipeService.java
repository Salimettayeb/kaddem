package tn.esprit.demo.services;


import org.springframework.stereotype.Service;
import tn.esprit.demo.entities.Equipe;

import java.util.List;
import java.util.Optional;

@Service
public interface IEquipeService {

    List<Equipe> retrieveAllEquipes();
    Equipe addEquipe(Equipe e); // ajouter l’équipe avec son détail
    Equipe updateEquipe (Equipe e);
    Optional<Equipe> retrieveEquipe (Integer idEquipe);
}
