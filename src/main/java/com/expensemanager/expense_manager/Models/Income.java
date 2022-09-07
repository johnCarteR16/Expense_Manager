package com.expensemanager.expense_manager.Models;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Income {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int date;

    private String amount;

    

    public Income() {
    }

    public Income(int id, int date, String amount) {
        this.id = id;
        this.date = date;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public int getDate() {
        return date;
    }

    public String getAmount() {
        return amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    
}
