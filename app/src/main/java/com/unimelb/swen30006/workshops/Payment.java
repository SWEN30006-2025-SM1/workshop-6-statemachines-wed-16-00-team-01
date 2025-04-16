package com.unimelb.swen30006.workshops;

import java.time.LocalDateTime;

public class Payment {
    private LocalDateTime dueDate;
    private double amount;

    Payment(LocalDateTime dueDate, double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isOverdue() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        if (currentDateTime.isAfter(this.dueDate)) {
            return true;
        } else {
            return false;
        }
    }
}
