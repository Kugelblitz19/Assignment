package com.bank.BankingApp_Cuvette.service;

import com.bank.BankingApp_Cuvette.entity.BankBranch;

import java.util.List;

public interface BankBranchService {
    List<BankBranch> getBranchesByCity(String city);

}
