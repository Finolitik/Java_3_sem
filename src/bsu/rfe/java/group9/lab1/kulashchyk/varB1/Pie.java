package bsu.rfe.java.group9.lab1.kulashchyk.varB1;

import java.util.Objects;

public class Pie extends Food {

    private String stuffing = "";

    private static int cherryPiesAmount = 0;
    private static int strawberryPiesAmount = 0;
    private static int applePiesAmount = 0;
    static final String Cherry = "Cherry";
    static final String Strawberry = "Strawberry";
    static final String Apple = "Apple";

    public Pie(String stuffing) {
        this.stuffing = stuffing;
        this.name = "Pie";

        switch (stuffing) {
            case (Cherry):
                this.calories = 100;
                cherryPiesAmount++;
                break;
            case (Strawberry):
                this.calories = 200;
                strawberryPiesAmount++;
                break;
            case (Apple):
                this.calories = 300;
                applePiesAmount++;
                break;
            default:
               break;
        }
    }

    public int Amount(){
        return switch (stuffing) {
            case (Cherry) -> cherryPiesAmount;
            case (Strawberry) -> strawberryPiesAmount;
            case (Apple) -> applePiesAmount;
            default -> 0;
        };
    }

    @Override
    public String toString() {
        return "Pie{" +
                "stuffing='" + stuffing + '\'' +
                ", calories=" + calories +
                '}';
    }
    @Override
    public void consume(){
        System.out.println(stuffing + " " + name + " has been eaten.");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pie Pie = (Pie) o;
        return Objects.equals(stuffing, Pie.stuffing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuffing);
    }

    @Override
    public int calculateCalories() {
        return calories;
    }
}
