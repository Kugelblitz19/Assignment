package com.bank.BankingApp_Cuvette.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankServiceRepository extends JpaRepository<com.bank.BankingApp_Cuvette.entity.BankService,Integer> {
}
