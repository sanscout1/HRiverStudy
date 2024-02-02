package JAVA.Java_Test.ioex01;

import java.io.*;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;
import java.util.StringTokenizer;

public class MemoDao {
    List<Memo> memoList = new ArrayList<Memo>();
    Memo memo;

    private static volatile MemoDao instance;
    private MemoDao() {}
    public static MemoDao getInstance() {  //싱글톤
        if (instance == null) {
            instance = new MemoDao();
        }
        return instance;
    }

    public void writeMemo(String name) throws IOException {
        System.out.println("작성할 내용을 써주세요");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String content = "\"" + reader.readLine() + "\"";
        System.out.println("중요도를 입력해주세요 0~9");
        String nice = reader.readLine();
        memo = new Memo(nowID(), name, content, getDate(), nice);
        System.out.println("메모를 작성했습니다.");
        System.out.println(memo.toString());
        memoList.add(memo);

        saveMemo();

    }

    public void saveMemo() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/JAVA/Java_Test/ioex01/memo.dat"));
        for (Memo memo1 : memoList) {
            bw.write(memo1.memoInfo());
            bw.newLine();
        }
        System.out.println("메모 저장 완료");
        bw.flush();
        bw.close();
    }
    public void delete(int choice){
        for (Memo memo1 : memoList) {
            if(memo1.getId() == choice){
                memoList.remove(memo1.getId());
                System.out.println("메모 삭제를 했습니다.");
                break;
            }
        }
    }
    public void getMemoList(){
        System.out.println("------------------------------------------------------------------");
        for (Memo memo1 : memoList) {
            System.out.println(memo1.toString());
        }

        System.out.println("-------------------------------------------------------------------");
    }

    public int nowID(){
        int maxID = 0;
        for (Memo memo1 : memoList) {
             maxID = memo1.getId();
        }
        return maxID+1;
    }

    public void partMemolist(){
        System.out.println("------------------------------------------------------------------");
        for (Memo memo1 : memoList) {
            System.out.println("ID : "+ memo1.getId() + "| Nanme : "+memo1.getName() + "| Contnet :" + getContentPart(memo1.getId()) + "| Date : "+memo1.getDate());
        }

        System.out.println("-------------------------------------------------------------------");
    }
    private String getContentPart(int ID){
        String tmpContent = memoList.get(ID).getContent();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(tmpContent," ");
        int countWord = 0;
        while(st.hasMoreTokens()){
            if(countWord==3) break;
            sb.append(st.nextToken()).append(" ");
            countWord++;
        }
        sb.append("...");
        return sb.toString();
    }
    public void getMemo(int choice) {
        System.out.println(memoList.get(choice).toString());
    }

    public void loadMemo() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/JAVA/Java_Test/ioex01/memo.dat"));
        String str;
        while (true) {
            str = reader.readLine();  // 한 줄을 읽어와 변수에 저장
            if (str == null) break;  // 파일의 끝에 도달하면 루프를 종료

            String[] tmpStr = str.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);

            Memo memo = new Memo(Integer.parseInt(tmpStr[0]), tmpStr[1], tmpStr[2], tmpStr[3], tmpStr[4]);
            memoList.add(memo);
        }

        reader.close();

    }


    public String getDate() {
        return String.valueOf(LocalDate.now());
    }

    //Reader reader = new FileReader("src/JAVA/Java_Test/ioex01/memo.dat");
}
