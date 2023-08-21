package com.groupeisi.service.impl;

import com.groupeisi.entities.Declaration;
import com.groupeisi.repository.DeclarationRepository;
import com.groupeisi.service.DeclarationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeclarationServiceImpl implements DeclarationService {

    private DeclarationRepository declarationRepository;

    private DeclarationServiceImpl(DeclarationRepository declarationRepository){
        super();
        this.declarationRepository = declarationRepository;
    }

    @Override
    public List<Declaration> getAllDeclaration() {

        return declarationRepository.findAll();
    }

    @Override
    public Declaration saveDeclaration(Declaration declaration) {
        return declarationRepository.save(declaration);
    }

    @Override
    public Declaration getDeclarationById(Long id) {

        return declarationRepository.findById(id).orElse(null);
    }

    @Override
    public Declaration updateDeclaration(Declaration declaration) {

        return declarationRepository.save(declaration);
    }

    @Override
    public void deleteDeclarationById(Long id) {
        declarationRepository.deleteById(id);
    }
}
