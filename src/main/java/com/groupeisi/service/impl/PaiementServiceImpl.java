package com.groupeisi.service.impl;

import com.groupeisi.entities.Paiement;
import com.groupeisi.repository.PaiementRepository;
import com.groupeisi.service.PaiementService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaiementServiceImpl implements PaiementService {

    private PaiementRepository paiementRepository;

    private PaiementServiceImpl(PaiementRepository paiementRepository){
        super();
        this.paiementRepository = paiementRepository;
    }
    @Override
    public List<Paiement> getAllPaiement() {
        return paiementRepository.findAll();
    }

    @Override
    public Paiement savePaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement getPaiementById(Long id) {
        return paiementRepository.findById(id).get();
    }

    @Override
    public Paiement updatePaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public void deletePaiementById(Long id) {
        paiementRepository.deleteById(id);
    }
}
