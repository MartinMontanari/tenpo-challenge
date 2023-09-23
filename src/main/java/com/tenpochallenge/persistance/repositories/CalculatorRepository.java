package com.tenpochallenge.persistance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tenpochallenge.domain.entities.Calculator;

@Repository
public interface CalculatorRepository extends JpaRepository<Calculator, Long> {
    
}
