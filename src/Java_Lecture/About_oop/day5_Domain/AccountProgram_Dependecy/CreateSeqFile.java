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
        super("고객 정보 파일 생성");
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
        add(new Label("계좌 번호"));
        account = new TextField();
        add(account);
        add(new Label("이름"));
        name = new TextField(20);
        add(name);

        //balance Frame에 붙이기
        add(new Label("잔고"));
        balance = new TextField(20);
        add(balance);

        enter = new Button("입력");
        enter.addActionListener(this);
        add(enter);

        done = new Button("종료");
        done.addActionListener(this);
        add(done);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void addRecord(){

    }
}
