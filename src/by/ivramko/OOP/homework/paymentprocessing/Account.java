package by.ivramko.OOP.homework.paymentprocessing;

import java.util.Arrays;
import java.util.Objects;

public class Account {

       private static final int DEFAULT_AMOUNT_OF_TRANSACTION = 10;


    private int id;
    private int lastIndexOfTransaction;
    private Transaction[] transactions;


    {
            transactions = new Transaction[DEFAULT_AMOUNT_OF_TRANSACTION];
            }

public Account(int id) {
        this.id = id;
        }

public int getId() {
        return id;
        }

public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
        if( accountTo == null || moneyAmount<=0){
        return;
        }
        Transaction newTransaction
        = new Transaction(this, accountTo, moneyAmount, StandardAccountOperations.MONEY_TRANSFER_SEND);
        addTransaction(newTransaction);
        accountTo.receiveMoneyFromAccount(this, moneyAmount);
        }

private void receiveMoneyFromAccount(Account accountFrom, double moneyAmount){

        if(accountFrom == null || moneyAmount<=0){
        return;
        }
        Transaction newTransaction
        = new Transaction(accountFrom,this, moneyAmount, StandardAccountOperations.MONEY_TRANSFER_RECEIVE);
        addTransaction(newTransaction);
        }

public void withdrawMoney(double moneyAmount) {
        if (moneyAmount<=0){
        return;
        }
        Transaction newTransaction
        = new Transaction(this, null, moneyAmount,StandardAccountOperations.WITHDRAW);
        addTransaction(newTransaction);
        }

private void addTransaction(Transaction transaction){
        if(transaction==null){
        return;
        }
        if(transactions.length<=lastIndexOfTransaction){
        transactions = Arrays.copyOf(transactions, transactions.length*2);
        }
        transactions[lastIndexOfTransaction++]=transaction;
        }


public Transaction[] getTransactions() {
        return Arrays.stream(transactions)
        .filter(Objects::nonNull)
        .toArray(Transaction[]::new);
        }



public static class Transaction {
    Account accountFrom;
    Account accountTo;
    double moneyAmount;
    StandardAccountOperations operation;


    public Transaction(Account accountFrom, Account accountTo, double moneyAmount, StandardAccountOperations operation) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.moneyAmount = moneyAmount;
        this.operation = operation;
    }

    public Account getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(Account accountFrom) {
        this.accountFrom = accountFrom;
    }

    public Account getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(Account accountTo) {
        this.accountTo = accountTo;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public StandardAccountOperations getOperation() {
        return operation;
    }

    public void setOperation(StandardAccountOperations operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "accountFrom=" + accountFrom +
                ", accountTo=" + accountTo +
                ", moneyAmount=" + moneyAmount +
                ", operation=" + operation +
                '}';
    }
}



}
