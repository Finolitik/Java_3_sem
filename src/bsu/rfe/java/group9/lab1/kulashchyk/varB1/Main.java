package bsu.rfe.java.group9.lab1.kulashchyk.varB1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        boolean cals = Arrays.stream(args).anyMatch("-calories"::equals);
        try {

            Food[] food = new Food[9];

            food[0] = new Milk(Milk.Fat15);
            food[1] = new Milk(Milk.Fat25);
            food[2] = new Milk(Milk.Fat50);
            food[3] = new Tea(Tea.Black);
            food[4] = new Tea(Tea.Green);
            food[5] = new Tea(Tea.Red);
            food[6] = new Pie(Pie.Cherry);
            food[7] = new Pie(Pie.Strawberry);
            food[8] = new Pie(Pie.Apple);

            Arrays.sort(food, (Food x, Food y) -> {
                return y.calculateCalories() - x.calculateCalories();
            });

            int sumCalories = 0;
            for (int i = 0; i < food.length; i++) {
                int curCalories = food[i].calculateCalories();
                food[i].consume();
                sumCalories += curCalories;
            }
            if (cals){
                System.out.printf("Sum of calories: " + sumCalories);
            }

        } catch (Exception e) {
            e.getMessage();
        }
    }
}