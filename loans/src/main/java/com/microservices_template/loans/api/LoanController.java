package com.microservices_template.loans.api;

import com.microservices_template.loans.dto.LoanDTO;
import com.microservices_template.loans.service.LoanService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loans")
@RequiredArgsConstructor
@Slf4j
public class LoanController {
    private final LoanService loanService;

    @GetMapping("/{accountNumber}")
    public List<LoanDTO> getLoans(@RequestHeader("microservices-correlation-id") String correlationId, @PathVariable String accountNumber) {
        log.info("Correlation ID: {}", correlationId);
        return loanService.getLoansByAccountNumber(accountNumber);
    }
}