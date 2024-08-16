package com.bank.BankingApp_Cuvette.controller;

import com.bank.BankingApp_Cuvette.entity.BankBranch;
import com.bank.BankingApp_Cuvette.entity.BankService;
import com.bank.BankingApp_Cuvette.service.impl.BankBranchServiceImpl;
import com.bank.BankingApp_Cuvette.service.impl.BankServiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class BankController {
    @Autowired
    private BankBranchServiceImpl bankServiceService;
    @Autowired
    private BankServiceServiceImpl bankService;

    @GetMapping("/branch/{city}")
    public ModelAndView getBranchesByCity(@PathVariable String city) {
        List<BankBranch> branches = bankServiceService.getBranchesByCity(city);
        ModelAndView modelAndView = new ModelAndView("branches"); // "branches" is the name of the HTML page
        modelAndView.addObject("branches", branches);
        modelAndView.addObject("city", city);
        return modelAndView;
    }
    @GetMapping("/service")
    public ModelAndView getAllServices() {
        List<BankService> services = bankService.getAllServices();
        ModelAndView modelAndView = new ModelAndView("services"); // "services" is the name of the HTML page
        modelAndView.addObject("services", services);
        return modelAndView;
    }

}
