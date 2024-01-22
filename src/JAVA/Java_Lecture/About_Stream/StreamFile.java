package JAVA.Java_Lecture.About_Stream;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFile {
    public static void main(String[] args) throws URISyntaxException, IOException {
        // 파일로부터 스트림 얻기
        // java.nio.file.Files 의 line() 이용하면, 텍스트 파일의 행단위 스트림을 얻을 수 있다.

        Path path = Paths.get(StreamFile.class.getResource("productlist.txt").toURI());
        // 경로를 저장하는 메서드 와 변수
        Stream<String> filestream = Files.lines(path, Charset.defaultCharset());
        // filestream 에 lines 메서드를 이용해 경로와 utf 설정
        filestream.forEach(line -> System.out.println(line));
        // filestream.forEach(System.out::println);
        filestream.close();

    }
}
