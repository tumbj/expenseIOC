package tum.ku.Model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        ExpenseList expenseList = context.getBean("expenseList", ExpenseList.class);
        Scanner sc  = new Scanner(System.in);
        System.out.println("Choose how to save data .(1 is file , 2 is database)");
        if(sc.nextInt() == 1){
                //write
                final String FILENAME = "temp.txt";
                BufferedWriter bw = null;
                FileWriter fw = null;
                try {
                        String content = expenseList.getBalanceAndHistoty();
                        fw = new FileWriter(FILENAME,true);
                        bw = new BufferedWriter(fw);
                        bw.write(content);
                        System.out.println("Done");
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                        try {
                            if (bw != null)
                                bw.close();
                            if (fw != null)
                                fw.close();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }

                }
        }else{

        }
        expenseList.incomeExpense(100,"mom give","income");
        expenseList.incomeExpense(250,"father give","income");
        expenseList.incomeExpense(100,"brother give","income");
        expenseList.incomeExpense(100,"buy rice","expense");


        System.out.println(expenseList.getBalanceAndHistoty());
        System.out.println(expenseList.getBalance());

    }
}
