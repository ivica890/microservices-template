package com.microservices_template.loans.service;

import com.microservices_template.loans.dto.LoanDTO;
import com.microservices_template.loans.mapper.LoanMapper;
import com.microservices_template.loans.repository.LoanRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class LoanServiceImpl implements LoanService{
    private final LoanRepository loanRepository;
    private final LoanMapper loanMapper;

    @Override
    public List<LoanDTO> getLoansByAccountNumber(String accountNumber) {
        log.debug("getLoansByAccountNumber method start");
        return loanMapper.toLoanDTOs(loanRepository.findByAccountNumber(accountNumber));
    }
}
