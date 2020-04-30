import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MainGame extends JFrame{
    private Trainer trainer;
    
   
    public MainGame(Trainer trainer){
        super("Pokemon Game");

        this.trainer = trainer;

       
        Container c = getContentPane();
        JLabel trainerNameLabel = new JLabel(this.trainer.getName());

        JLabel pokemonName = new JLabel();

        JButton FirstPokemon = new JButton(trainer.getBag().get(0).getName() + " Status ");
        JButton button = new JButton(" New Pokemon");
        JPanel panel1 = new JPanel();
        JButton jb1 = new JButton("Clik Me");
        JButton jb2 = new JButton("Bag");
        JButton jb3 = new JButton("Quit");
        JButton jb4 = new JButton("Forest");
        JButton Shop = new JButton("Shop");

        Box buttonBox = Box.createVerticalBox();

        c.add(trainerNameLabel);
        c.add(pokemonName);
        c.add(FirstPokemon);
        c.add(button);
        c.add(panel1);
        c.add(jb1); 
        c.add(jb2);
        c.add(jb3);
        c.add(jb4);
        c.add(Shop);
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS ));
        c.setLayout(new GridBagLayout());
        panel1.setLayout(new GridBagLayout());


		
        c.add(Box.createVerticalStrut(20));
       
        c.add(Box.createVerticalStrut(20));
        
        c.add(Box.createVerticalStrut(20));
        
        c.add(Box.createVerticalStrut(20));
        
        c.add(Box.createVerticalStrut(20));
        jb1.setAlignmentX(JButton.CENTER_ALIGNMENT);
        jb2.setAlignmentX(JButton.CENTER_ALIGNMENT);
        jb3.setAlignmentX(JButton.CENTER_ALIGNMENT);
        jb4.setAlignmentX(JButton.CENTER_ALIGNMENT);
        Shop.setAlignmentX(JButton.CENTER_ALIGNMENT);



        
        String pName = "Pokemon:  ";
        for(Pokemon p: trainer.getBag()){
            pName += p.getName() + ", ";

        }

        pokemonName.setText(pName);

        
        
        
        

        FirstPokemon.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ) {
                PokemonStatus ps = new PokemonStatus(trainer.getBag().get(0));
            }
        });

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) { 
                button b = new button(trainer.getBag().get(0)); 
            }
        });
       

        Shop.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) { 
                Shop s = new Shop(trainer.getBag().get(0));
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(1000,500);
        setVisible(true);

    }
    
    

}