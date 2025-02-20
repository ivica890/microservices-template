package com.microservices_template.loans.mapper;

import com.microservices_template.loans.dto.LoanDTO;
import com.microservices_template.loans.entity.Loan;

import java.util.List;

public interface LoanMapper {
    LoanDTO toLoanDTO(Loan loan);
    Loan toLoan(LoanDTO loanDTO);
    List<LoanDTO> toLoanDTOs(List<Loan> loans);
}