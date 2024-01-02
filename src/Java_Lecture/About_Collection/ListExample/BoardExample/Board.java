package Java_Lecture.About_Collection.ListExample.BoardExample;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Board {


    private  int bno;
    private String btitle;
    private String bcontent;
    private String bwriter;
    private String bdate;

}
