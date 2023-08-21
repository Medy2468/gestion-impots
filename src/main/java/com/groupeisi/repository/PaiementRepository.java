package com.groupeisi.repository;

import com.groupeisi.entities.Declaration;
import com.groupeisi.entities.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {

    List<Paiement> findByDeclaration(Declaration declaration);
    List<Paiement> findAll();
}
