package com.expensemanager.expense_manager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.expensemanager.expense_manager.Models.Income;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Integer>{
    
}
