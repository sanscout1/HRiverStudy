package JAVA.Java_assignments.HR_assignment;

import java.io.IOException;
import java.util.Scanner;

public class Loop129_ex05 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        float base=0;
        float height =0;

        while (true) {
            System.out.print("Base = ");
            base= sc.nextFloat();
            System.out.print("Height = ");
            height=sc.nextFloat();
            float width =(base*height)/2;
            System.out.println(String.format("Triangle width = %.1f",width));
            System.out.print("Continue? ");
            sc.nextLine();
            String con = sc.nextLine();
            if(!con.equals("Y")&&!con.equals("y")){
                break;
            }
        }
    }


    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//
//        Boolean Flag = true;
//        int base=0;
//        int height =0;
//
//
//
//
//        while (Flag) {
//            System.out.println("Base = ");
//
//            base= Integer.parseInt(br.readLine());
//            System.out.println("Height = ");
//
//            height=Integer.parseInt(br.readLine());
//            System.out.println("Triangle width = ");
//
//            System.out.printf("%.1f\n",(float)(base*height)/2);
//            System.out.println("Continue?");
//
//            if(br.readLine().equals("N")){
//                Flag=false;
//            }
//        }
//
//
//    }
//}


//