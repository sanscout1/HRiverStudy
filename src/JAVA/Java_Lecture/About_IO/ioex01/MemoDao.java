package JAVA.Java_Lecture.About_IO.ioex01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MemoDao {
    List<Memo> memoList = new ArrayList<Memo>();
    Memo memo;

    public void load() {
        StringBuilder sb = new StringBuilder();

        try {
            Reader reader = new FileReader("C:/Temp/memo.dat");
            while (true) {
                int n = reader.read();
                if (n == -1) break;
                sb.append((char) n);
            }
            String[] tokens = String.valueOf(sb).split(",|\\r\\n");

            boolean flag = true;
            int index = 0;
            while (true) {
                try {
                    if (tokens[index].equals("============")) {
                        break;
                    } else {
                        memo = new Memo(tokens[index], tokens[index + 1], tokens[index + 2], tokens[index + 3], tokens[index + 4]);
                        memoList.add(memo);
                        index += 5;
                    }
                } catch (Exception e) {
                    System.out.println("저장 완료");
                    break;
                }
            }
            System.out.println(memoList);

            reader.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
