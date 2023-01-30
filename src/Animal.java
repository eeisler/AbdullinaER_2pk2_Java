package src;
import java.util.Date;

public class Animal {
    String name;
    Date dateB;
    Enviroments env;
    Food food;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        if(name.length() >= 3){
            this.name = name;
        }
    }
    public Date getDateB() {
        return this.dateB;
    }
    public void setDateB(Date dateB){
        this.dateB = dateB;
    }
    public Enviroments getEnv(){
        return this.env;
    }
    public void setEnv(Enviroments env){
        this.env = env;
    }
    public Food getFood(){
        return this.food;
    }
    public void setFood(Food food){
        this.food = food;
    }
    public Animal() {
        this.name = "SomeAnimal";
        this.dateB = new Date();
        this.env = Enviroments.Ground;
        this.food = food;
    }
    public Animal(String name, Date dateB, Enviroments env, Food food){
        this.name = name;
        this.dateB = new Date();
        this.env = Enviroments.Ground;
        this.food = food;
    }
    public void move(){}
    public void eat(){}
}
