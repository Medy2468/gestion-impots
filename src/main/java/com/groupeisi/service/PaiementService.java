package com.groupeisi.service;

import com.groupeisi.entities.Paiement;

import java.util.List;

public interface PaiementService {
    List<Paiement> getAllPaiement();

    Paiement savePaiement(Paiement paiement);

    Paiement getPaiementById(Long id);

    Paiement updatePaiement(Paiement paiement);

    void deletePaiementById(Long id);
}
