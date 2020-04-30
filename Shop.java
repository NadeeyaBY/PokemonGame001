
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Shop extends JFrame{
    private Trainer trainer;
    
    public Shop(Trainer trainer){

        super("Pokemon Forest");
        this.trainer = trainer;

        Container c = getContentPane();
        JButton shop = new JButton("Shop");
        c.add(shop);
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        c.add(panel1);
        JButton buypokeball = new JButton("Buy");
        JButton buypotion = new JButton("Buy");
        JButton buyultraball = new JButton("Sold Out");
        c.add(buypokeball);
        c.add(buypotion);
        c.add(buyultraball);
        JLabel pokeball = new JLabel("PokeBall");
        JLabel GB30 = new JLabel("30 GB");
        c.add(pokeball);
        c.add(GB30);

        JLabel potion = new JLabel("Potion");
        JLabel GB15 = new JLabel("15 GB");
        c.add(potion);
        c.add(GB15 );

        JLabel ultraball = new JLabel("UltraBall");
        JLabel GB100 = new JLabel("100 GB");
        c.add(ultraball);
        c.add(GB100);

    
        JLabel GBs = new JLabel("GB : " + trainer.getBag());
        JButton close = new JButton("Back");                                                 
        c.add(GBs);
        c.add(close);


        Box buttonBox = Box.createHorizontalBox();
            buttonBox.add(GBs);
            buttonBox.add(Box.createHorizontalStrut(20));
            buttonBox.add(close);
    

        buypokeball.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
            
                }
        });

        buypotion.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
            
                } 
        });
        
        close.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel1);
        pack();
        setSize(1000, 600);
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width  - getSize().width) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2);
        setVisible(true);    
    }
   
}