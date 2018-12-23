package tum.ku.Model;

import java.util.ArrayList;

/**
 * Created by 708 on 8/31/2018.
 */
public class ExpenseList {
    private ArrayList<Expense> expenses;

    public ExpenseList() {
        expenses = new ArrayList<>();
    }

    public void incomeExpense(double money,String explain,String type){
        expenses.add(new Expense(money,explain,type));
    }

    public double getBalance(){
        double total=0;
        for (Expense e:expenses) {
            if(e.getType().equals("income")) {
                total += e.getMoney();
            }
            else{
                total-=e.getMoney();
            }
        }
        return total;

    }
    public String getBalanceAndHistoty(){
        String tmp = "";
        for (Expense e:expenses) {
            tmp+="money: "+e.getMoney()+" explain: "+e.getExplain()+"\n";
        }
        return tmp;
    }
    public ArrayList<Expense> getBalanceList(){
        return expenses;
    }



}
