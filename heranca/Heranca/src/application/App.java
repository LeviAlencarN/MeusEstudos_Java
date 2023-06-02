package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {

	public static void main(String[] args) {
        List<Account> list = new ArrayList<>();

        list.add(new BusinessAccount(1001, "Maria", 2000.0, 400.0));
        list.add(new BusinessAccount(1002, "Antoin", 3000.0, 500.0));
        list.add(new SavingsAccount(1003, "Chica",100.0, 0.03));

        double sum = 0.0;
        for(Account acc : list){
            sum += acc.getBalance();
        }

        System.out.println(sum);

        for(Account acc : list){
            acc.deposit(10.0);
        }

        for(Account acc : list){
            System.out.println(acc.getBalance());
        }
    }

}
