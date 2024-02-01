package JAVA.Java_Lecture.About_network.json;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ReadJson {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/JAVA/Java_Lecture/About_network/json/member.json",
                Charset.forName("UTF-8")));
        String data = br.readLine();
        br.close();

        // JSON 파싱
        JSONObject root = new JSONObject(data);
        System.out.println(root.getString("id"));
        System.out.println(root.getInt("password"));
        System.out.println(root.getBoolean("student"));

        JSONObject tel = root.getJSONObject("tel");
        System.out.println(tel.getString("home"));
        System.out.println(tel.getString("mobile"));

        // 배열 속성
        JSONArray hobby = root.getJSONArray("hobby");
        for (Object o : hobby) {
            System.out.println(o+",");

        }




    }
}
