package bsu.rfe.java.group9.lab1.kulashchyk.varB1;

import java.util.Objects;

public class Pie extends Food {

    private String icing = "";

    private static int chocolatePiesAmount = 0;
    private static int creamyPiesAmount = 0;
    private static int caramelPiesAmount = 0;
    static final String Chocolate = "Chocolate";
    static final String Creamy = "Creamy";
    static final String Caramel = "Caramel";

    public Pie(String icing) {
        this.icing = icing;
        this.name = "Pie";

        switch (icing) {
            case (Chocolate):
                this.calories = 100;
                chocolatePiesAmount++;
                break;
            case (Creamy):
                this.calories = 200;
                creamyPiesAmount++;
                break;
            case (Caramel):
                this.calories = 300;
                caramelPiesAmount++;
                break;
            default:
               break;
        }
    }



    public int Amount(){
        return switch (icing) {
            case (Chocolate) -> chocolatePiesAmount;
            case (Creamy) -> creamyPiesAmount;
            case (Caramel) -> caramelPiesAmount;
            default -> 0;
        };
    }

    @Override
    public String toString() {
        return "Pie{" +
                "icing='" + icing + '\'' +
                ", calories=" + calories +
                '}';
    }

    public void consume(){
        System.out.println(icing + " " + name + " has been eaten.");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pie Pie = (Pie) o;
        return Objects.equals(icing, Pie.icing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(icing);
    }

    @Override
    public int calculateCalories() {
        return calories;
    }
}
