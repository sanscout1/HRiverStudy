package JAVA.Java_Lecture.About_String;

public class StringPareWrapper {
    public static void main(String[] args) {
        String s1 = "10";
        String s2 ="20";
        byte b1 = Byte.parseByte(s1);
        byte b2 = Byte.parseByte(s2);
        byte b3 =(byte) (b1+b2);

        int result = Integer.parseInt(s1)+ Integer.parseInt(s2);


        int value1 = Integer.parseInt("10");

        double value2 = Double.parseDouble("3.14");

        boolean value3 = Boolean.parseBoolean("true");

        String restring = String.valueOf(10);
        String restring1 = String.valueOf(3.14);

    }
}
