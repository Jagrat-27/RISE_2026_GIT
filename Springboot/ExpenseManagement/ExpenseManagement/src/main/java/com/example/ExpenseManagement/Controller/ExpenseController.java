package com.example.ExpenseManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ExpenseManagement.Entity.Expense;
import com.example.ExpenseManagement.Service.ExpenseService;

@RestController
@RequestMapping("/expenses")
@CrossOrigin("*")
public class ExpenseController {
    
    @Autowired
    private ExpenseService expenseService;

    // Create
    @PostMapping
    public Expense addExpense(@RequestBody Expense expense){
        return expenseService.saveExpense(expense);
    }

    // Read all
    @GetMapping
    public List<Expense> getExpenses(){
        return expenseService.getAllExpenses();
    }

    // Read by id
    @GetMapping("/{id}")
    public Expense getExpenseById(@PathVariable long id){
        return expenseService.getExpenseById(id);
    }

    // Update
    @PutMapping("/{id}")
    public Expense updateExpense(@PathVariable Long id, @RequestBody Expense expense){
        return expenseService.updateExpense(id, expense);
    }

    // Delete
    @DeleteMapping("/{id}")
    public String deleteExpense(@PathVariable long id){
        return expenseService.deleteExpense(id);
    }

}
