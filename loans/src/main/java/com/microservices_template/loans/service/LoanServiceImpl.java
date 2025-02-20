package com.microservices_template.loans.service;

import com.microservices_template.loans.dto.LoanDTO;
import com.microservices_template.loans.mapper.LoanMapper;
import com.microservices_template.loans.repository.LoanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoanServiceImpl implements LoanService{
    private final LoanRepository loanRepository;
    private final LoanMapper loanMapper;

    @Override
    public List<LoanDTO> getLoansByAccountNumber(String accountNumber) {
        return loanMapper.toLoanDTOs(loanRepository.findByAccountNumber(accountNumber));
    }
}