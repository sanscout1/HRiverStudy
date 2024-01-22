package JAVA.Java_Lecture.About_Lamda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Scratch {
    public static void main(String[] args) {
        Scratch scratch = new Scratch();
        // String[] 배열, 비교 기준이 될 2번째 문자를 지정하기 위한 인덱스 1을 인자로 전달
        String[] strArr = scratch.getSortedStrArr(new String[]{"aba", "bca", "cac"}, 1);
        System.out.println(Arrays.toString(strArr));

        //커스텀(자신이 정한) 정렬 키로 비교하기
        String[] st = {"aba", "bca", "cac"};
        String[] strings = Arrays.stream(st)
                .sorted() // 오름차순 정렬
                .sorted(Comparator.comparing(s -> s.charAt(1))) // 2번째 문자를 기준으로 비교해서 오름차순 정렬
                // sorted 는 스트림 내부 함수이다.
                .toArray(String[]::new); // String[] 배열로 모아서 반환
        System.out.println(Arrays.toString(strings));

        //내림차순으로 정렬하기
        String s = "dafaafq";
        String collect = Stream.of(s.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
        System.out.println(collect);

        //기본타입 배열을 역순으로 정렬하기
        int[] A = {5, 3, 2, 4, 1};
        Integer[] tmp = Arrays.stream(A)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(tmp));

        //Integer[]이 아닌 int[]타입으로 반환
        int[] array = {5, 3, 2, 4, 1};
        int[] ints = Arrays.stream(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(ints));
    }

    public String[] getSortedStrArr(String[] strings, int n) {
        return Arrays.stream(strings).sorted() // 먼저 문자열을 오름차순으로 정렬
                // 각 문자열들을 문자열과 지정된 n번째 문자를 인자로 전달해서 Str 클래스로 치환한다.
                .map(str -> new Str(str, str.charAt(n)))
                .sorted() // Str 클래스에 정의된 compareTo 를 통해 Str 클래스들을 정렬한다.
                .map(Str::getName).toArray(String[]::new); // Str 클래스들을 getName() 메서드를 사용해서 다시 문자열들로 치환한다.
    }
}

class Str implements Comparable<Str> {
    String name;
    char ch;

    public Str(String name, char ch) {
        this.name = name;
        this.ch = ch;
    }

    String getName() {
        return name;
    }

    @Override
    public int compareTo(Str o) {
        return this.ch - o.ch; // 문자열 name 의 n번째 문자를 기준으로 오름차순 정렬
    }
}
