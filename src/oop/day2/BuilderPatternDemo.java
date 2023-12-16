package oop.day2;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost : "+ vegMeal.getCost());


        Meal nonvegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNonVeg Meal");
        nonvegMeal.showItems();
        System.out.println("Total Cost : "+ nonvegMeal.getCost());

    }
}
