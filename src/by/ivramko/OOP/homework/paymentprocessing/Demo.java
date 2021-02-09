package by.ivramko.OOP.homework.paymentprocessing;

public class Demo {

    public static void main(String[] args) {
        Account account = new Account(0);
        Account account1 = new Account(1);

        account.sendMoneyToAccount(account1,100);

        account.withdrawMoney(200);



    }
}
