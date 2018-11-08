package tum.ku.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import tum.ku.Model.Account;

import java.io.*;

public class MainController {
    @FXML
    Button addBtn;
    @FXML
    Button editBtn;
    @FXML
    TextArea view;
    @FXML
    Label showBalance;
    @FXML
    Button saveBtn;
    @FXML
    Button cancelBtn;

    final  String fileName = "temp.txt";
    static Account account = new Account();
    String line = null;
    BufferedWriter bw = null;
    FileWriter fw = null;
    @FXML
    public void initialize(){

        view.appendText(showData());
        view.setEditable(false);
        account.setBalance(getBalanceDB());
        showBalance.setText(account.getBalance()+"");
        saveBtn.setOpacity(0);
        cancelBtn.setOpacity(0);
    }

    @FXML
    public void actionAddBtn(ActionEvent e){
        Button b = (Button) e.getSource();
        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../View/AddPage.fxml"));
        try {
            stage.setScene(new Scene((Parent) loader.load(), 524, 207));
            stage.setResizable(false);
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }


    @FXML
    public void actionEditBtn(ActionEvent a){
        saveBtn.setOpacity(1);
        cancelBtn.setOpacity(1);
        addBtn.setOpacity(0);
        editBtn.setOpacity(0);

        editBtn.setVisible(true);
        view.setEditable(true);


    }
    @FXML
    public void actionSaveBtn(ActionEvent e){


        saveBtn.setOpacity(0);
        cancelBtn.setOpacity(0);
        addBtn.setOpacity(1);
        editBtn.setOpacity(1);
        view.setEditable(false);

        try {
                String content = view.getText();
                fw = new FileWriter(fileName,false);
                bw = new BufferedWriter(fw);
                bw.write(content);
                account.setBalance(getBalanceDB());



        } catch (IOException a) {
               a.printStackTrace();
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
    @FXML
    public void actionCancelBtn(ActionEvent a){
        saveBtn.setOpacity(0);
        cancelBtn.setOpacity(0);
        addBtn.setOpacity(1);
        editBtn.setOpacity(1);
        view.clear();
        view.appendText(showData());
        view.setEditable(false);
    }

    public String showData(){
        String n ="";
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
               n+=(line)+"\n";
            }
            // Always close files.
            bufferedReader.close();

        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
        }
        return n;
    }
    public double getBalanceDB(){
        double balance = 0;
        String n[] ;
        try {

            FileReader fileReader =
                    new FileReader(fileName);


            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {

                n = line.split(":");
                if(!n[0].equals("") ) {
                    balance+= Double.parseDouble(n[0]);
                }

            }
            bufferedReader.close();
            return (balance);

        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
        }
        catch (Exception e){
            System.out.println("ERROR");
        }
        return  0;
    }
}
