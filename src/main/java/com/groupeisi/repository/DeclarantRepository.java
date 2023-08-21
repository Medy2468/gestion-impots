package com.groupeisi.repository;

import com.groupeisi.entities.Declarant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeclarantRepository extends JpaRepository<Declarant, Long> {

    List<Declarant> findAll();
}
