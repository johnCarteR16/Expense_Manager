package com.expensemanager.expense_manager.service;

import org.springframework.stereotype.Service;

import com.expensemanager.expense_manager.Models.Income;

@Service
public interface IncomeService {
    
    public Income addIncome(Income income);

    public Income viewAllIncome();

}
