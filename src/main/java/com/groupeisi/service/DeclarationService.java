package com.groupeisi.service;


import com.groupeisi.entities.Declaration;

import java.util.List;


public interface DeclarationService {
    List<Declaration> getAllDeclaration();

    Declaration saveDeclaration(Declaration declaration);

    Declaration getDeclarationById(Long id);

    Declaration updateDeclaration(Declaration declaration);

    void deleteDeclarationById(Long id);
}
