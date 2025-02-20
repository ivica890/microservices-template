package com.microservices_template.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDetailsResponse {
    private String accountNumber;
    private List<CardDTO> cards;
    private List<LoanDTO> loans;
}