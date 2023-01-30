package src;
import java.util.Date;
public class Turtle extends Animal {
    Food food = Food.Grass;
    Enviroments env = Enviroments.Ground;

    public Turtle(String name, Date dateB, Enviroments env, Food food){
        super (name, dateB, env, food);
    }

    public void move(){
        System.out.println(this.name + "is crawling");
    }
    public void eat(){
        System.out.println(this.name + "is eating");
    }
}
