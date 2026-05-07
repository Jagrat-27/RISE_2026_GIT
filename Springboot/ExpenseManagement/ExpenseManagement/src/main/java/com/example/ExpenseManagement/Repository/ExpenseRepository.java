package com.example.ExpenseManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ExpenseManagement.Entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    
} 
