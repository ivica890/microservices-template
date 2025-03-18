package com.microservices_template.cards.api;

import com.microservices_template.cards.dto.CardDTO;
import com.microservices_template.cards.service.CardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cards")
@RequiredArgsConstructor
@Slf4j
public class CardController {
    private final CardService cardService;

    @GetMapping("/{accountNumber}")
    public List<CardDTO> getCards( @RequestHeader("microservices-correlation-id") String correlationId, @PathVariable String accountNumber) {
//        log.info("Correlation ID: {}", correlationId);
        log.debug("getCards method start");
        return cardService.getCardsByAccountNumber(accountNumber);
    }
}
