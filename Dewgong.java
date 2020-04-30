import java.lang.Math;

public class Dewgong extends Pokemon{

    public Dewgong(String name){
        super(name, 250);
      
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + name  + "attack" + enemy.getName());
        enemy.damage(100);


    } 

}