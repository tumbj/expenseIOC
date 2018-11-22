package ku;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Before;
import tum.ku.Model.ExpenseList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefATM {
    ExpenseList expenseList;

    @Before
    public void init(){
        expenseList = new ExpenseList();
    }

    @Given("a user have balance (\\d+)")
    public void a_user_have_balance(double arg1){
           expenseList = new ExpenseList();
           expenseList.incomeExpense(arg1,"old balance","income");
        }


    @When("I income (\\d+) I can explain(.*)")
    public void i_income_i_can_explain(double arg1,String arg2){
        expenseList.incomeExpense(arg1,arg2,"income");
    }
    @When("I expense (\\d+) I can explain(.*)")
    public void i_expense_i_can_explain(double arg1,String arg2){
        expenseList.incomeExpense(arg1,arg2,"expense");
    }
    @Then("balance is (.*)")
    public void balance_is_minus(int balance){
        assertEquals(balance, expenseList.getBalance());
        }




}


