package Java_Lecture.About_oop.day5_Domain.AccountProgram_Dependecy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class CreateSeqFile extends Frame implements ActionListener {
    private TextField account,name,balance;

    private Button enter, done;

    private DataOutputStream output;

    CreateSeqFile(){
        super("create customer file");
        try{
            output = new DataOutputStream(new FileOutputStream("client.doc"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e1){
            System.err.println(e1.toString());    //에러메세지 출력
            e1.printStackTrace();
            System.exit(1);
        } catch (Exception e2){         //예외처리 범위 순서대로 표시
            e2.printStackTrace();
        }

        setSize(250,150);
        setLayout(new GridLayout(4,2));
        add(new Label("accountNumber"));
        account = new TextField();
        add(account);
        add(new Label("name"));
        name = new TextField(20);
        add(name);

        //balance Frame에 붙이기
        add(new Label("balance"));
        balance = new TextField(20);
        add(balance);

        enter = new Button("inoyt");
        enter.addActionListener(this);
        add(enter);

        done = new Button("exit");
        done.addActionListener(this);
        add(done);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        addRecord();
        if (e.getSource()==done)try {
            output.close();
        }catch (IOException io){
            System.err.println(io.toString());
        }
        System.exit(0);
    }

    public void addRecord(){
        String accountNo = "";
        Double money = 0.0;
        if(!account.getText().equals("")){
            try {
                accountNo = String.valueOf(account.getText());
                if(accountNo != null) {
                    output.writeUTF(accountNo);
                    output.writeUTF(name.getText());
                    //money = new Double(balance.getText());
                    //output.writeDouble(balance.);
                }
            }catch (NumberFormatException e){
                System.err.println(e.toString());
            }catch (IOException e2) {
                System.err.println(e2.toString());
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) {
       new CreateSeqFile();
    }
}
