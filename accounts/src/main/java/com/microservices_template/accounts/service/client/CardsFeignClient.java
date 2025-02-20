package com.microservices_template.accounts.service.client;

import com.microservices_template.accounts.dto.CardDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "cards-service", url = "http://localhost:8090")
public interface CardsFeignClient {
    @GetMapping("/api/cards/{accountNumber}")
    List<CardDTO> getCardsByAccountNumber(@PathVariable String accountNumber);
}
