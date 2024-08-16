package com.bank.BankingApp_Cuvette.repository;

import com.bank.BankingApp_Cuvette.entity.BankBranch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankBranchRepository extends JpaRepository<BankBranch,Integer> {
    List<BankBranch>getAllBranchByCity(String city);
}
