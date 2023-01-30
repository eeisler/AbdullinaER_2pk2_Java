package src;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Turtle turtle = new Turtle("Cherepashka", new Date(2023, 1, 10), Enviroments.Ground, Food.Grass);
        System.out.println("It's name is " + turtle.getName());
        System.out.println(turtle.getName() + " was born on " + turtle.getDateB());
        System.out.println(turtle.getName() + " eats " + turtle.getFood());

        Jellyfish jell = new Jellyfish ("Moahn", new Date(2023, 5, 15), Enviroments.Water, Food.Whatever);
        System.out.println("It's name is " + jell.getName());
        System.out.println(jell.getName() + " was born on " + jell.getDateB());
        System.out.println(jell.getName() + " eats " + jell.getFood());
    }
}