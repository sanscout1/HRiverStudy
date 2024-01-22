package JAVA.Java_assignments.HR_arrayAssignment1;


public class array9066_ex02 {
    public static void main(String[] args) {

        String[] alphabetArray = new String[26];
        char tmpChar = 'A';
        for(int i=0;i<alphabetArray.length;i++){
            alphabetArray[i]= String.valueOf(tmpChar);
            tmpChar++;
        }

        for(int i=alphabetArray.length-1; i>=0; i--){
            System.out.printf("%s ",alphabetArray[i]);
        }
    }
}
