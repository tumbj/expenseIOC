package tum.ku.Model;

import java.util.ArrayList;

/**
 * Created by 708 on 8/31/2018.
 */
public class Account {
    private double balance;
    private static int id;
    private ArrayList<String> explain;
    private ArrayList<Double> history;
    public Account(int money) {
        balance = money;
        id = 0;
        explain = new ArrayList<>();
        history = new ArrayList<>();
    }
    public Account() {
        this.balance = 0;
        id=0;
        explain = new ArrayList<>();
        history = new ArrayList<>();
    }

    public void income(double moneyIncome,String explainIncome){
        id++;
        this.balance+=moneyIncome;
        this.history.add(moneyIncome);
        this.explain.add(explainIncome);
    }
    public void expense(double moneyExpense,String explainExpense){
        id++;
        this.balance -=moneyExpense;
        this.history.add(moneyExpense);
        this.explain.add(explainExpense);
    }
    public double getBalance(){
        return balance;
    }
    public String getBalanceAndHistoty(){
        String tmp = "";
        for (int j = 0; j < history.size(); j++) {
            tmp += "id :"+j+" " + history.get(j) + " " + explain.get(j) +"\n";
        }
        return tmp;
    }
//    public void editIncome(double money,String exp){
//        if (money > history.get(id)){
//
//        }
//
//    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
