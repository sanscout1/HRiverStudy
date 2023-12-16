package oop.day2;

public abstract class Burger implements Item {

    public Packing packing(){
        return new Wrapper();
    }
    public abstract float price();
   // public  abstract String name();

}
