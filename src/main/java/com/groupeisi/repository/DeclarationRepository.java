package com.groupeisi.repository;

import com.groupeisi.entities.Declarant;
import com.groupeisi.entities.Declaration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeclarationRepository extends JpaRepository<Declaration, Long> {
    List<Declaration> findByDeclarant(Declarant declarant);
    List<Declaration> findAll();
}
