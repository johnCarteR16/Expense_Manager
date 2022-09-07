package com.expensemanager.expense_manager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expensemanager.expense_manager.Models.Income;
import com.expensemanager.expense_manager.service.IncomeService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/Expense-Manager")
public class HomeController {

    @Autowired
    public IncomeService incomeService;

    @GetMapping("/")
    public List<String> test(){
        System.out.println("Hello World");
        return new ArrayList<String>(Arrays.asList("Hi","Hello","How","are","u"));
    }

    @PostMapping("/add")
    public Income addIncome(@RequestBody Income income){
        return incomeService.addIncome(income);
    }
}
