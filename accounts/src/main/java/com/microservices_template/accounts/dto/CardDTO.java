package com.microservices_template.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardDTO {
    private String accountNumber;
    private String cardNumber;
    private String cardType;
    private Double creditLimit;
}
