package com.expensemanager.expense_manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expensemanager.expense_manager.Models.Income;
import com.expensemanager.expense_manager.Repository.IncomeRepository;

@Service
public class IncomeServiceImpl implements IncomeService {
    
    @Autowired
    private IncomeRepository incomeRepository;

    @Override
    public Income addIncome(Income income) {
        
        return incomeRepository.save(income);
        
    }

    @Override
    public Income viewAllIncome() {
        
        return null;
    }
}
