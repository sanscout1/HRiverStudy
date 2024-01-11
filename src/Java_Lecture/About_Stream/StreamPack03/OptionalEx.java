package Java_Lecture.About_Stream.StreamPack03;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class OptionalEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
//         1
         OptionalDouble optionalDouble = list.stream()
                 .mapToInt(Integer::intValue).average();
         if(optionalDouble.isPresent()){
             System.out.println("평균 : " + optionalDouble.getAsDouble());
         } else {
             System.out.println("평군: "+ 0.0);
         }
        // 2
        double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);


         // 3
        list.stream().mapToInt(Integer::intValue).average().ifPresent(avgerage -> System.out.println(avgerage));

    }
}
