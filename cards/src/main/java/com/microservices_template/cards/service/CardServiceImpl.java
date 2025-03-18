package com.microservices_template.cards.service;

import com.microservices_template.cards.dto.CardDTO;
import com.microservices_template.cards.mapper.CardMapper;
import com.microservices_template.cards.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {
    private final CardRepository cardRepository;
    private final CardMapper cardMapper;

    @Override
    public List<CardDTO> getCardsByAccountNumber(String accountNumber) {
        log.debug("getCardsByAccountNumber method start");
        return cardMapper.toCardDTOs(cardRepository.findByAccountNumber(accountNumber));
    }
}
