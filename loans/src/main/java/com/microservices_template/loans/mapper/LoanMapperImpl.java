package com.microservices_template.loans.mapper;

import com.microservices_template.loans.dto.LoanDTO;
import com.microservices_template.loans.entity.Loan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LoanMapperImpl implements LoanMapper {

    @Override
    public LoanDTO toLoanDTO(Loan loan) {
        if (loan == null) {
            return null;
        }

        LoanDTO loanDTO = new LoanDTO();
        loanDTO.setAccountNumber(loan.getAccountNumber());
        loanDTO.setLoanAmount(loan.getLoanAmount());
        loanDTO.setInterestRate(loan.getInterestRate());
        loanDTO.setTenure(loan.getTenure());

        return loanDTO;
    }

    @Override
    public Loan toLoan(LoanDTO loanDTO) {
        if (loanDTO == null) {
            return null;
        }

        Loan loan = new Loan();
        loan.setAccountNumber(loanDTO.getAccountNumber());
        loan.setLoanAmount(loanDTO.getLoanAmount());
        loan.setInterestRate(loanDTO.getInterestRate());
        loan.setTenure(loanDTO.getTenure());

        return loan;
    }

    @Override
    public List<LoanDTO> toLoanDTOs(List<Loan> loans) {
        if (loans == null) {
            return null;
        }

        List<LoanDTO> loanDTOs = new ArrayList<>(loans.size());
        for (Loan loan : loans) {
            loanDTOs.add(toLoanDTO(loan));
        }

        return loanDTOs;
    }
}