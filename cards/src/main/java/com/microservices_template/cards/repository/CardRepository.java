package com.microservices_template.cards.repository;

import com.microservices_template.cards.domain.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CardRepository extends JpaRepository<Card, Long> {
    List<Card> findByAccountNumber(String accountNumber);
}

