package JAVA.Java_Test.BoardProject_2.src;

import lombok.Getter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
    @Getter
    private int bno;
    @Getter
    private String btitle;
    @Getter
    private String bcontent;
    @Getter
    private String bwriter;
    private String Bdate;

    public Board() {
    }

    public Board(int bno, String btitle, String bcontent, String bwriter, String date) {
        this.bno = bno;
        this.btitle = btitle;
        this.bcontent = bcontent;
        this.bwriter = bwriter;
        this.Bdate =  date;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public void setBwriter(String bwriter) {
        this.bwriter = bwriter;
    }

    public String getDate() {
        return Bdate;
    }

    @Override
    public String toString() {
        return "Board{" +
                "bno=" + bno +
                ", btitle='" + btitle + '\'' +
                ", bcontent='" + bcontent + '\'' +
                ", bwriter='" + bwriter + '\'' +
                ", date='" + Bdate + '\'' +
                '}';
    }

    public void setDate(){
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.Bdate = date.format(new Date());
    }
    public void pickDate(String date){
        this.Bdate = date;
    }
}
