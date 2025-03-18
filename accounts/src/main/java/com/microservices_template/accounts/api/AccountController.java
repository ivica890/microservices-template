package com.microservices_template.accounts.api;

import com.microservices_template.accounts.dto.AccountDetailsResponse;
import com.microservices_template.accounts.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts")
@RequiredArgsConstructor
@Slf4j
public class AccountController {
    private final AccountService accountService;

    @GetMapping("/{accountNumber}")
    public AccountDetailsResponse getAccountDetails(@RequestHeader("microservices-correlation-id") String correlationId, @PathVariable String accountNumber
                                                    ) {
//        log.info("Correlation ID: {}", correlationId);
        log.debug("getCardsByAccountNumber method start");
        return accountService.getAccountDetails(correlationId,accountNumber);
    }
}
