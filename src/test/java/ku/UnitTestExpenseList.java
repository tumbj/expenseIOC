package ku;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tum.ku.Model.ExpenseList;

import static org.junit.Assert.assertEquals;

/**
 * Created by 708 on 8/31/2018.
 */
public class UnitTestExpenseList {
    ExpenseList expenseList;

    @BeforeEach
    void init() {
        expenseList = new ExpenseList();}

    @Test
    void testIncome(){
        expenseList.incomeExpense(100,"mom give","income");
        assertEquals(100, (int)expenseList.getBalance());
        expenseList.incomeExpense(1000,"mom give","income");
        assertEquals(1100, (int)expenseList.getBalance());


    }

    @Test
    void testExpense(){
        expenseList.incomeExpense(100,"buy fastfood","expense");
        expenseList.incomeExpense(50,"buy cartoon book","expense");
        assertEquals(-150, (int)expenseList.getBalance());
    }

}
