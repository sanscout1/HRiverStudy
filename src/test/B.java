package test;

public class B {

    public String receiverData = "";
    public void b1(){
        System.out.println("B타입의 b1() 실행");
    }

    public void b2(){
        System.out.println("B타입의 b2() 실행");
    }

    public  void b3(String data){
        receiverData=data;
        System.out.println("A클래스에서 전달받은 내용 :"+ receiverData);
    }

    public String b4(String data) {
        receiverData=data;
        return "A클래스의 data는 B타입의 x2객체에서 처리하였습니다.";
    }

}
