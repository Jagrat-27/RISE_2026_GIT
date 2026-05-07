package com.example.ExpenseManagement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExpenseManagement.Entity.Expense;
import com.example.ExpenseManagement.Repository.ExpenseRepository;

@Service
public class ExpenseService {
    
    @Autowired
    private ExpenseRepository expenseRepository;

    // Create
    public Expense saveExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    // Read all
    public List<Expense> getAllExpenses(){
        return expenseRepository.findAll();
    }

    // Read by id
    public Expense getExpenseById(long id){
        Optional<Expense> expense = expenseRepository.findById(id);
        return expense.orElse(null);
    }

    // Update
    public Expense updateExpense(Long id, Expense updatedExpense){
        Expense expense = expenseRepository.findById(id).orElse(null);
        if(expense != null){
            expense.setTitle(updatedExpense.getTitle());
            expense.setAmount(updatedExpense.getAmount());
            expense.setCategory(updatedExpense.getCategory());
            expense.setDate(updatedExpense.getDate());
            return expenseRepository.save(expense);
        }
        return null;
    }

    // Delete
    public String deleteExpense(long id){
        expenseRepository.deleteById(id);
        return "Expense deleted successfully";
    }
}
