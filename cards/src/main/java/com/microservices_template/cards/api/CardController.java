package com.microservices_template.cards.api;

import com.microservices_template.cards.dto.CardDTO;
import com.microservices_template.cards.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cards")
@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;

    @GetMapping("/{accountNumber}")
    public List<CardDTO> getCards(@PathVariable String accountNumber) {
        return cardService.getCardsByAccountNumber(accountNumber);
    }
}