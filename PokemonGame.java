
public class PokemonGame{
  
    public static void main(String[] args){
        System.out.println("\n\n-----Welcome to Pokemon game-----");
        Trainer t = new Trainer(" Serena ");
        
        MainGame mg = new MainGame(t);

        t.play();
        System.out.println("\n\n-----End Pokemon game-----");




       
        
        
    }
}    