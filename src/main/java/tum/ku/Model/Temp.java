package tum.ku.Model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Temp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Account account = context.getBean("account", Account.class);
        account.income(100,"mom give");
        account.income(250,"father give");
        account.income(100,"brother give");
        account.expense(100,"buy rice");


        System.out.println(account.getBalanceAndHistoty());

    }
}
