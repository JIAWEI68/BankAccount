package com.example.BankAccount;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Loh", "S1234567A",
                "123-123-123-1", "Savings");
        account1.activateAccount();
        account1.creditAccount(5000.09);
        account1.TransferAmount(50.00);
        double newBalance = account1.getBalance();
        System.out.println("The Balance in " + account1.getName() + " is $" + newBalance);

        BankAccount account2 = new BankAccount("Elsa Im","S7654321B","112-113-114-2",
                "Savings");
        account2.activateAccount();
        account2.creditAccount(5000.00);
        double newBalance2 = account2.getBalance();
        System.out.println("The Balance in " + account2.getName() + " is $" + newBalance2);


    }

    }


