package com.codingShuttle.jpaTutorial.jpaTutorial.repositories;

import com.codingShuttle.jpaTutorial.jpaTutorial.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
