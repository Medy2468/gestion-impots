package com.groupeisi.service;

import com.groupeisi.entities.Declarant;

import java.util.List;

public interface DeclarantService {
    List<Declarant> getAllDeclarants();

    Declarant saveDeclarant(Declarant declarant);

    Declarant getDeclarantById(Long id);

    Declarant updateDeclarant(Declarant declarant);

    void deleteDeclarantById(Long id);
}
