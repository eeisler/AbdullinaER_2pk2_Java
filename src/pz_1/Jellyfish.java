package src.pz_1;
import java.util.Date;
public class Jellyfish extends Animal{
    Food food = Food.Whatever;
    Enviroments env = Enviroments.Water;
    public Jellyfish (String name, Date dateB, Enviroments env, Food food){
        super (name, dateB, env, food);
    }
    public void move(){
        System.out.println(this.name + "is floating with the flow");
    }
    public void eat(){
        System.out.println(this.name + "is eating");
    }
}
