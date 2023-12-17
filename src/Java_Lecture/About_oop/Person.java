package Java_Lecture.About_oop;

public class Person {

        private final String name;
        private final int age;
        private final String address;
        private final String phoneNum;

        public static class Builder{

            private final String name;
            private final int age;
            private final String address;
            private final String phoneNum;


            public Builder(String name,int age,String address,String phoneNum){
                this.name=name;
                this.age=age;
                this.address=address;
                this.phoneNum=phoneNum;

            }

            public  Person build(){
                return new Person(this);
            }


        }

    private Person(Person.Builder builder){
        name=builder.name;
        age=builder.age;
        address=builder.address;
        phoneNum=builder.phoneNum;
    }

        public void personInformation(){
        System.out.printf("%s의 나이는 %d살이고 주소는 %s이며 전화번호는 %s",this.name,this.age,this.address,this.phoneNum);
    }

//    Person(String name,int age,String address,String phoneNum){
//        this.name=name;
//        this.age=age;
//        this.address=address;
//        this.phoneNum=phoneNum;
//    }
//
//    public void personInformation(){
//        System.out.printf("%s의 나이는 %d살이고 주소는 %s이며 전화번호는 %s",this.name,this.age,this.address,this.phoneNum);
//    }
}
