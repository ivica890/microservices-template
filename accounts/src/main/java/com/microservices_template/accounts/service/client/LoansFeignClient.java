package com.microservices_template.accounts.service.client;

import com.microservices_template.accounts.dto.LoanDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "loans-service", url = "http://localhost:8070")
public interface LoansFeignClient {
    @GetMapping("/api/loans/{accountNumber}")
    List<LoanDTO> getLoansByAccountNumber(@PathVariable String accountNumber);
}

