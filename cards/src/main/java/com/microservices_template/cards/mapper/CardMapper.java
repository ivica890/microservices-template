package com.microservices_template.cards.mapper;

import com.microservices_template.cards.domain.Card;
import com.microservices_template.cards.dto.CardDTO;

import java.util.List;


public interface CardMapper {
    CardDTO toCardDTO(Card card);
    Card toCard(CardDTO cardDTO);
    List<CardDTO> toCardDTOs(List<Card> cards);
}
