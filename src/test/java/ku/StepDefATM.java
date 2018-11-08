package ku;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Before;
import tum.ku.Model.Account;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefATM {
    Account account;

    @Before
    public void init(){
        account = new Account();
    }

    @Given("a user have balance (\\d+)")
    public void a_user_have_balance(int arg1){
           account = new Account(arg1);
        }


    @When("I income (\\d+) I can explain(.*)")
    public void i_income_i_can_explain(int arg1,String arg2){
        account.income(arg1,arg2);
    }
    @When("I expense (\\d+) I can explain(.*)")
    public void i_expense_i_can_explain(int arg1,String arg2){
        account.expense(arg1,arg2);
    }
    @Then("balance is (.*)")
    public void balance_is_minus(int balance){
        assertEquals(balance, account.getBalance());
        }




}


