package com.microservices_template.loans.service;

import com.microservices_template.loans.dto.LoanDTO;

import java.util.List;

public interface LoanService {
    List<LoanDTO> getLoansByAccountNumber(String accountNumber);
}
