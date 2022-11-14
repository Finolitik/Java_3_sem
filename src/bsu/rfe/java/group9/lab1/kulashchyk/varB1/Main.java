package bsu.rfe.java.group9.lab1.kulashchyk.varB1;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        boolean cals = Arrays.stream(args).anyMatch("-calories"::equals);
        try {

            Food[] food = new Food[10];

            food[0] = new Milk(Milk.Mint);
            food[1] = new Milk(Milk.Cherry);
            food[2] = new Milk(Milk.Watermelon);
            food[3] = new Tea(Tea.Black);
            food[4] = new Tea(Tea.Green);
            food[5] = new Tea(Tea.Blue);
            food[6] = new Pie(Pie.Caramel);
            food[7] = new Pie(Pie.Chocolate);
            food[8] = new Pie(Pie.Creamy);
            food[9] = new Milk(Milk.Mint);

            Arrays.sort(food, (Food x, Food y) -> {
                return y.calculateCalories() - x.calculateCalories();
            });

            int sumCalories = 0;
            for (int i = 0; i < 10; i++) {
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

    interface Lambda{
        boolean compare(Food x, Food y);
    }
}