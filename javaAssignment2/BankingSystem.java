// Implement a banking system using java.
// Create 3 sub class of Bank : SBI,BOI,ICICI
// All 4 should have following methods:
// 1.getDetails which provide their specific details like rateofinterest etc
// 2.printDetails of every bank.
// 3.Every bank account should have a type (enum): SAVINGS, CURRENT
// 4.Implement a feature to deduct amount from account. Throw InsufficientAmountException if amount being deducted is less than the current balance.
// 5.Every banking transaction should be saved in a file of each bank's transaction log which would have all details of the transaction like (time of transaction,account number,amount withdrawn, amount before deduction, amount after deduction,transaction status (can also be enum), failure reason if any)


package javaAssignment2;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.io.*;

enum AccountType {
    SAVINGS,
    CURRENT
}

enum TransactionStatus {
    SUCCESS,
    FAILURE
}

class InsufficientAmountException extends Exception {
    public InsufficientAmountException(String message) {
        super(message);
    }
}

abstract class Bank {
    protected String bankName;
    protected double rateOfInterest;
    protected Map<String, Double> accounts = new HashMap<>();
    protected String transactionLogFile;

    public Bank(String bankName, double rateOfInterest) {
        this.bankName = bankName;
        this.rateOfInterest = rateOfInterest;
        this.transactionLogFile = "C:/Users/ABC/Desktop/java practice file/javaAssignment2/" + bankName + "_transactions.log";
    }
    
    public abstract String getDetails();

    public void printDetails() {
        System.out.println(getDetails());
    }

    public void createAccount(String accountNumber, double initialBalance, AccountType accountType) {
        accounts.put(accountNumber, initialBalance);
        System.out.println("Account created in " + bankName + " with Account Number: " + accountNumber);
    }

    public void deductAmount(String accountNumber, double amount) throws InsufficientAmountException {
        if (!accounts.containsKey(accountNumber)) {
            logTransaction(accountNumber, amount, 0, 0, TransactionStatus.FAILURE, "Account does not exist");
            throw new InsufficientAmountException("Account does not exist");
        }

        double currentBalance = accounts.get(accountNumber);
        if (amount > currentBalance) {
            logTransaction(accountNumber, amount, currentBalance, currentBalance, TransactionStatus.FAILURE, "Insufficient balance");
            throw new InsufficientAmountException("Insufficient balance");
        }

        double newBalance = currentBalance - amount;
        accounts.put(accountNumber, newBalance);
        logTransaction(accountNumber, amount, currentBalance, newBalance, TransactionStatus.SUCCESS, "");
        System.out.println("Transaction successful. Remaining balance: " + newBalance);
    }

    private void logTransaction(String accountNumber, double amount, double beforeBalance, double afterBalance, TransactionStatus status, String failureReason) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String logEntry = String.format("%s | Account: %s | Amount: %.2f | Before: %.2f | After: %.2f | Status: %s | Reason: %s", 
                timestamp, accountNumber, amount, beforeBalance, afterBalance, status, failureReason);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(transactionLogFile, true))) {
            writer.write(logEntry);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error writing to transaction log: " + e.getMessage());
        }
    }
}

// SBI Bank Class
class SBI extends Bank {
    public SBI() {
        super("SBI", 3.5);
    }

    @Override
    public String getDetails() {
        return "Bank: SBI, Rate of Interest: " + rateOfInterest + "%";
    }
}

// BOI Bank Class
class BOI extends Bank {
    public BOI() {
        super("BOI", 4.0);
    }

    @Override
    public String getDetails() {
        return "Bank: BOI, Rate of Interest: " + rateOfInterest + "%";
    }
}

// ICICI Bank Class
class ICICI extends Bank {
    public ICICI() {
        super("ICICI", 4.5);
    }

    @Override
    public String getDetails() {
        return "Bank: ICICI, Rate of Interest: " + rateOfInterest + "%";
    }
}


public class BankingSystem {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank boi = new BOI();
        Bank icici = new ICICI();

        sbi.createAccount("SBI123", 5000, AccountType.SAVINGS);
        boi.createAccount("BOI456", 10000, AccountType.CURRENT);
        icici.createAccount("ICICI789", 15000, AccountType.SAVINGS);

        try {
            sbi.deductAmount("SBI123", 2000);
            boi.deductAmount("BOI456", 12000);
            icici.deductAmount("ICICI789", 5000);
        } catch (InsufficientAmountException e) {
            System.err.println(e.getMessage());
        }

        sbi.printDetails();
        boi.printDetails();
        icici.printDetails();
    }
}
