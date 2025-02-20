package com.microservices_template.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoanDTO {
    private String accountNumber;
    private Double loanAmount;
    private Double interestRate;
    private Integer tenure;
}
