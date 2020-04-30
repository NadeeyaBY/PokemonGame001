import java.lang.Math;

public class Hitokage extends Pokemon{
    public Hitokage(String name){
        super(name, 1000);
        
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + name  + "attack" + enemy.getName());
        enemy.damage(80);


    }

}