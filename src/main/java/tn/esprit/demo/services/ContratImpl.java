package tn.esprit.demo.services;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.demo.entities.Contrat;
import tn.esprit.demo.repositories.IContratRepository;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Service
@Slf4j
public class ContratImpl implements IContratService {

    @Autowired
    IContratRepository iContratRepository;
    @Override
    public List<Contrat> retrieveAllContrats() {
        return ((List<Contrat>) iContratRepository.findAll());
    }

    @Override
    public Contrat updateContrat(Contrat ce) {
        return iContratRepository.save(ce);
    }

    @Override
    public Contrat addContrat(Contrat ce) {
        return iContratRepository.save(ce);
    }

    @Override
    public Contrat retrieveContrat(Integer idContrat) {
        return iContratRepository.findById(idContrat).orElse(null);
    }

    @Override
    public void removeContrat(Integer idContrat) {
        iContratRepository.deleteById(idContrat);
    }
}
