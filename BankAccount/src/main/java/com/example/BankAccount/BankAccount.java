package com.example.BankAccount;

public class BankAccount {
    String name;
    String nric;
    String accountNumber;
    String accountType;
    double balance;
    boolean activation;
    public BankAccount(String _name, String _nric,
                       String _accountNumber, String _accountType)
    {
        this.name = _name;
        this.nric = _nric;
        this.accountNumber = _accountNumber;
        this.accountType = _accountType;
        this.balance = 0.0;
        this.activation = false;
}
public void activateAccount()
{
    this.activation = true;
}
public void debitAccount(double amountToDebit)
{
    this.balance -= amountToDebit;
}
public void creditAccount(double amountToCredit)
{
    this.balance +=amountToCredit;
}
public double TransferAmount(double amountToTransfer){this.balance -=amountToTransfer;}
public double getBalance()
{
    return this.balance;
}
public String getName()
{
    return this.name;
    }
}