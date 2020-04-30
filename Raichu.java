import java.lang.Math;

public class Raichu extends Pikachu {
    public Raichu(String name){
        super(name,500);
        
    } 

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + name  + " attack " + enemy.getName());
        enemy.damage(100);

    }

}