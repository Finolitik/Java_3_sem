package bsu.rfe.java.group9.lab1.kulashchyk.varB1;

import java.util.Objects;

public class Milk extends Food {

    private String fat = "";
    private static int Fat15Amount = 0;
    private static int Fat25Amount = 0;
    private static int Fat50Amount = 0;
    static final String Fat15 = "Fat15";
    static final String Fat25 = "Fat25";
    static final String Fat50 = "Fat50";

    public Milk(String fat)  {
        this.fat = fat;
        this.name = "Milk";

        switch (fat) {
            case (Fat15):
                this.calories = 100;
                Fat15Amount++;
                return;
            case (Fat25):
                this.calories = 200;
                Fat25Amount++;
                return;
            case (Fat50):
                this.calories = 300;
                Fat50Amount++;
                return;
            default:
                break;
        }
    }
    public int Amount(){
        return switch (fat) {
            case (Fat15) -> Fat15Amount;
            case (Fat25) -> Fat25Amount;
            case (Fat50) -> Fat50Amount;
            default -> 0;
        };
    }
    @Override
    public String toString() {
        return "Milk{" +
                "fat='" + fat + '\'' +
                ", calories=" + calories +
                '}';
    }
    @Override
    public void consume(){
        System.out.println(fat + " " + name + " has been drunk.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Milk Milk = (Milk) o;
        return Objects.equals(fat, Milk.fat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fat);
    }

    @Override
    public int calculateCalories() {
        return calories;
    }
}