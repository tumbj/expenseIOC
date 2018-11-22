package tum.ku.Model;//package tum.tum.ku.Model;
//
//import tum.tum.ku.Model.ExpenseList;
//
//
//import java.io.*;
//
//public class AccountSimulatorUI {
//    public static void main(String[] args) {
//        ExpenseList myAcc = new ExpenseList();
//
////
////        myAcc.income(100,"Mother give");
////        myAcc.expense(200,"buy model");
////        myAcc.income(500,"Father give");
//
////
//      //  System.out.println(myAcc.getBalanceAndHistoty());
//        //write
//       final String FILENAME = "temp.txt";
//        BufferedWriter bw = null;
//        FileWriter fw = null;
////        try {
////                String content = myAcc.getBalanceAndHistoty();
////                fw = new FileWriter(FILENAME,true);
////                bw = new BufferedWriter(fw);
////                bw.write(content);
////                System.out.println("Done");
////        } catch (IOException e) {
////                e.printStackTrace();
////        } finally {
////                try {
////                    if (bw != null)
////                        bw.close();
////                    if (fw != null)
////                        fw.close();
////                } catch (IOException ex) {
////                    ex.printStackTrace();
////                }
////
////        }
//
//
//
//        //read file
//
////        // The name of the file to open.
//        String fileName = "temp.txt";
////
////        // This will reference one line at a time
//        String line = null;
////        String a = "id :0";
////        char[] b ={'i','d',' ',':','0'};\
//        double balance = 0;
//        String n[] ;
//        try {
//            // FileReader reads text files in the default encoding.
//            FileReader fileReader =
//                    new FileReader(fileName);
//
//            // Always wrap FileReader in BufferedReader.
//            BufferedReader bufferedReader =
//                    new BufferedReader(fileReader);
//
//            while((line = bufferedReader.readLine()) != null) {
//
//               n = line.split(":");
//                if(!n[0].equals("") ) {
//                    balance+= Double.parseDouble(n[0]);
//                }
//               //
//
//              // balance+= Double.parseDouble(n[0]);
//               // System.out.println(n[0]);
//
////                if(bufferedReader.readLine().split(":")){
////                    fw = new FileWriter(fileName,true);
////                    bw = new BufferedWriter(fw);
////                    bw.write(a);
////                    if (bw != null)
////                        bw.close();
////                    if (fw != null)
////                        fw.close();
////                System.out.println(n[0]);
//
//
////                System.out.println(line);
//            }
//            System.out.println(balance);
//            // Always close files.
//            bufferedReader.close();
//        }
//        catch(FileNotFoundException ex) {
//            System.out.println(
//                    "Unable to open file '" +
//                            fileName + "'");
//        }
//        catch(IOException ex) {
//            System.out.println(
//                    "Error reading file '"
//                            + fileName + "'");
//        }
//   //////////////////////////////
//
//
//
//    }
//
//
//
//
//
//
//}
