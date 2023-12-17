package Java_Lecture.About_oop.day2.hamburger;

public class HamburgerBuilder {
    //필수
    private int bun;
    private int patty;

    //선택

    private int cheese;
    private int tomato;
    private int bacon;


    public static class Builder {
        private int bun;
        private int patty;

        //선택

        private int cheese=0;
        private int tomato=0;
        private int bacon=0;

        public Builder(int bun,int patty){
            this.bun=bun;
            this.patty=patty;
        }

        public Builder cheese(int cheese){
            this.cheese=cheese;
            return this;
        }
        public Builder tomato(int tomato){
            this.tomato=tomato;
            return this;
        }
        public Builder bacon(int bacon){
            this.bacon=bacon;
            return this;
        }


        public HamburgerBuilder build(){return new HamburgerBuilder(this);}

    }

    private HamburgerBuilder(Builder builder){
        this.bun=builder.bun;
        this.patty=builder.patty;
        this.cheese=builder.cheese;
        this.tomato=builder.tomato;
        this.bacon=builder.bacon;
    }

    public void showHamburgerDetail() {
        System.out.printf("bun : %d  patty : %d  cheese : %d  tomato : %d  bacon : %d",this.bun,this.patty,this.cheese,this.tomato,this.bacon);
    }




}
