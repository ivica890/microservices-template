package com.microservices_template.cards.mapper;

import com.microservices_template.cards.domain.Card;
import com.microservices_template.cards.dto.CardDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CardMapperImpl implements CardMapper {

    @Override
    public CardDTO toCardDTO(Card card) {
        if (card == null) {
            return null;
        }

        CardDTO cardDTO = new CardDTO();
        cardDTO.setAccountNumber(card.getAccountNumber());
        cardDTO.setCardNumber(card.getCardNumber());
        cardDTO.setCardType(card.getCardType());
        cardDTO.setCreditLimit(card.getCreditLimit());

        return cardDTO;
    }

    @Override
    public Card toCard(CardDTO cardDTO) {
        if (cardDTO == null) {
            return null;
        }

        Card card = new Card();
        card.setAccountNumber(cardDTO.getAccountNumber());
        card.setCardNumber(cardDTO.getCardNumber());
        card.setCardType(cardDTO.getCardType());
        card.setCreditLimit(cardDTO.getCreditLimit());

        return card;
    }

    @Override
    public List<CardDTO> toCardDTOs(List<Card> cards) {
        if (cards == null) {
            return null;
        }

        List<CardDTO> cardDTOs = new ArrayList<>(cards.size());
        for (Card card : cards) {
            cardDTOs.add(toCardDTO(card));
        }

        return cardDTOs;
    }
}