package bsu.rfe.java.group9.lab1.kulashchyk.varB1;

import java.util.Objects;

public class Milk extends Food {

    private String flavour = "";

    private static int mintGumsAmount = 0;
    private static int cherryGumsAmount = 0;
    private static int watermelonGumsAmount = 0;
    static final String Mint = "Mint";
    static final String Cherry = "Cherry";
    static final String Watermelon = "Watermelon";

    public Milk(String flavour)  {
        this.flavour = flavour;
        this.name = "Milk";

        switch (flavour) {
            case (Mint):
                this.calories = 100;
                mintGumsAmount++;
                return;
            case (Cherry):
                this.calories = 200;
                cherryGumsAmount++;
                return;
            case (Watermelon):
                this.calories = 300;
                watermelonGumsAmount++;
                return;
            default:
                break;
        }
    }

    public int Amount(){
        return switch (flavour) {
            case (Mint) -> mintGumsAmount;
            case (Cherry) -> cherryGumsAmount;
            case (Watermelon) -> watermelonGumsAmount;
            default -> 0;
        };
    }

    @Override
    public String toString() {
        return "Milk{" +
                "flavour='" + flavour + '\'' +
                ", calories=" + calories +
                '}';
    }

    public void consume(){
        System.out.println(flavour + " " + name + " has been eaten.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Milk Milk = (Milk) o;
        return Objects.equals(flavour, Milk.flavour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavour);
    }

    @Override
    public int calculateCalories() {
        return calories;
    }
}