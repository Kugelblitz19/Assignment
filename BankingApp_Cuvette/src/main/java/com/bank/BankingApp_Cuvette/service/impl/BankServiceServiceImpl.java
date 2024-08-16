package com.bank.BankingApp_Cuvette.service.impl;

import com.bank.BankingApp_Cuvette.entity.BankService;
import com.bank.BankingApp_Cuvette.repository.BankServiceRepository;
import com.bank.BankingApp_Cuvette.service.BankServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankServiceServiceImpl implements BankServiceService {
    @Autowired
    private BankServiceRepository bankServiceRepository;
    @Override
    public List<BankService> getAllServices() {
        return bankServiceRepository.findAll();
    }
}
