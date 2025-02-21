package com.microservices_template.accounts.service;

import com.microservices_template.accounts.dto.AccountDetailsResponse;

public interface AccountService {
    AccountDetailsResponse getAccountDetails(String correlationId,String accountNumber);
}
