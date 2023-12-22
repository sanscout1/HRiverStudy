package Java_Lecture.About_oop.day5_Domain.AccountProgram_Dependecy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadSeqFile extends Frame implements ActionListener {


    private TextField account,name,balance;

    private Button next, done;

    private DataInputStream input;  //필드에 입력되는 account, name ,balance 의 스트링객체를 담는 객체

    public ReadSeqFile(){
        super("고객 파일을 읽겠습니다.");
//        try{
//            input = new DataInputStream(new FileInputStream("client.doc"));
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e1){
//            System.err.println(e1.toString());    //에러메세지 출력
//            e1.printStackTrace();
//            System.exit(1);
//        } catch (Exception e2){         //예외처리 범위 순서대로 표시
//            e2.printStackTrace();
//        }
        setSize(250,150);
        setLayout(new GridLayout(4,2));
        account = new TextField();
        account.setEditable(false);
        add(account);
        add(new Label("이름"));
        name = new TextField(20);
        name.setEditable(false);
        add(name);

        //balance Frame에 붙이기
        add(new Label("잔고"));
        balance = new TextField(20);
        balance.setEditable(false);
        add(balance);

        next = new Button("출력");
        next.addActionListener(this);
        add(next);
        setVisible(true);


    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==next) readRecord();  //데이터를 한 레코드씩 읽는 메서드
        else closeFile();
    }


    public void closeFile(){

    }

    public  void readRecord() {

    }

    public static void main(String[] args) {
        new ReadSeqFile();
    }
}
