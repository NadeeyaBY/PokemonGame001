import java.lang.Math;

public class Miltank extends Pokemon{

    public Miltank(String name){
        super(name, 400);
        
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + name  + "attack" + enemy.getName());
        enemy.damage(40);


    } 

}