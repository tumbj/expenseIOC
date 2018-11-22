package tum.ku.Model;

public class Expense {
    private double money;
    private String explain;
    private String type;



    public Expense(double money, String explain, String type) {
        this.money = money;
        this.type = type.toLowerCase();
        this.explain=explain;


    }



    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
