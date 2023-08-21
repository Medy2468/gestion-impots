package com.groupeisi.service.impl;

import com.groupeisi.entities.Declarant;
import com.groupeisi.repository.DeclarantRepository;
import com.groupeisi.service.DeclarantService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeclarantServiceImpl implements DeclarantService {

    private DeclarantRepository declarantRepository;
    public DeclarantServiceImpl(DeclarantRepository declarantRepository) {
        super();
        this.declarantRepository = declarantRepository;
    }

    @Override
    public List<Declarant> getAllDeclarants() {
        return declarantRepository.findAll();
    }

    @Override
    public Declarant saveDeclarant(Declarant declarant) {
        return declarantRepository.save(declarant);
    }

    @Override
    public Declarant getDeclarantById(Long id) {
        return declarantRepository.findById(id).get();
    }

    @Override
    public Declarant updateDeclarant(Declarant declarant) {
        return declarantRepository.save(declarant);
    }

    @Override
    public void deleteDeclarantById(Long id) {
        declarantRepository.deleteById(id);
    }
}
