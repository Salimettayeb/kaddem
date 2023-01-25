package tn.esprit.demo.services;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.demo.entities.Equipe;
import tn.esprit.demo.repositories.IEquipeRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Service
@Slf4j
public class EquipeImpl implements IEquipeService{

    @Autowired
    IEquipeRepository iEquipeRepository;
    @Override
    public List<Equipe> retrieveAllEquipes() {
        return (List<Equipe>) iEquipeRepository.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return iEquipeRepository.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return iEquipeRepository.save(e);
    }

    @Override
    public Optional<Equipe> retrieveEquipe(Integer idEquipe) {
        return iEquipeRepository.findById(idEquipe);
    }
}
