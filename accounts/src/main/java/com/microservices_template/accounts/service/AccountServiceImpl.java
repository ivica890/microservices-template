package com.microservices_template.accounts.service;

import com.microservices_template.accounts.dto.AccountDetailsResponse;
import com.microservices_template.accounts.dto.CardDTO;
import com.microservices_template.accounts.dto.LoanDTO;
import com.microservices_template.accounts.service.client.CardsFeignClient;
import com.microservices_template.accounts.service.client.LoansFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final CardsFeignClient cardsFeignClient;
    private final LoansFeignClient loansFeignClient;

    @Override
    public AccountDetailsResponse getAccountDetails(String correlationId, String accountNumber) {
        List<CardDTO> cards = cardsFeignClient.getCardsByAccountNumber(correlationId,accountNumber);
        List<LoanDTO> loans = loansFeignClient.getLoansByAccountNumber(correlationId, accountNumber);
        return new AccountDetailsResponse(accountNumber, cards, loans);
    }
}
