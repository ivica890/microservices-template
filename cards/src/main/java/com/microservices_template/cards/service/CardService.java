package com.microservices_template.cards.service;

import com.microservices_template.cards.dto.CardDTO;

import java.util.List;

public interface CardService {
    List<CardDTO> getCardsByAccountNumber(String accountNumber);
}
