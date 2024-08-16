package com.bank.BankingApp_Cuvette.service.impl;

import com.bank.BankingApp_Cuvette.entity.BankBranch;
import com.bank.BankingApp_Cuvette.repository.BankBranchRepository;
import com.bank.BankingApp_Cuvette.service.BankBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankBranchServiceImpl implements BankBranchService {
    @Autowired
    private BankBranchRepository branchRepository;
    @Override
    public List<BankBranch> getBranchesByCity(String city) {
        return branchRepository.getAllBranchByCity(city);
    }
}
