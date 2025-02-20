package com.microservices_template.loans.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoanDTO {
    private String accountNumber;
    private Double loanAmount;
    private Double interestRate;
    private Integer tenure;
}
