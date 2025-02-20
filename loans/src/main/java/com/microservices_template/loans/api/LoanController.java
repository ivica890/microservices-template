package com.microservices_template.loans.api;

import com.microservices_template.loans.dto.LoanDTO;
import com.microservices_template.loans.service.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/loans")
@RequiredArgsConstructor
public class LoanController {
    private final LoanService loanService;

    @GetMapping("/{accountNumber}")
    public List<LoanDTO> getLoans(@PathVariable String accountNumber) {
        return loanService.getLoansByAccountNumber(accountNumber);
    }
}