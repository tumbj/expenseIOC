package tum.ku.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static tum.ku.Controller.MainController.account;

public class AddPageController {
    @FXML
    Button submitIncomeBtn;
    @FXML
    Button submitExpenseBtn;
    @FXML
    Button cancelBtn;
    @FXML
    TextField fillMoney;
    @FXML
    TextField fillExplain;

    final  String fileName = "temp.txt";
    static double money;
    static String explain;
    static boolean sign; // false = +, true = -
    String line = null;
    BufferedWriter bw = null;
    FileWriter fw = null;
    @FXML
    public void initialize() {
        money=0;
        explain="";
        sign=false;
    }

    @FXML
    public void actionSubmitIncomeBtn(ActionEvent a) {
        try {
            money = Double.parseDouble(fillMoney.getText());
            account.income(money,fillExplain.getText());
            addDataToDB(money,fillExplain.getText());

        }catch (IllegalArgumentException il){
            System.err.println("Missmath Input");
        }catch (Exception e){
            System.err.println("Error");
        }
        backToMain(a);
    }
    @FXML
    public void actionSubmitExpenseBtn(ActionEvent a){
        try {
            money = Double.parseDouble("-"+fillMoney.getText());
            account.expense(money,fillExplain.getText());
            addDataToDB(money,fillExplain.getText());
        }catch (IllegalArgumentException il){
            System.err.println("Missmath Input");
        }catch (Exception e){
            System.err.println("Error");
        }
        backToMain(a);
    }
    @FXML
    public void actionCancelBtn(ActionEvent a){
        backToMain(a);
    }
    public void backToMain(ActionEvent e){
        Button b = (Button) e.getSource();
        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../View/Main.fxml"));
        try {
            stage.setScene(new Scene((Parent) loader.load(), 490, 499));
            stage.setResizable(false);
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
    public void addDataToDB(double money,String explain){
        try {
            String content = money+": " +explain+"\n";
            fw = new FileWriter(fileName,true);
            bw = new BufferedWriter(fw);
            bw.write(content);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

    }


//
}
