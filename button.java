import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class button  extends JFrame {

    Pokemon pokemon;
    public button(Pokemon pokemon){
        super("Pokemon button:  " );
        this.pokemon = pokemon;

        Container c = getContentPane();
        JRadioButton button = new JRadioButton("** >___< **");
        JRadioButton hitokage = new JRadioButton(" Hitokage");
        JRadioButton dewgong = new JRadioButton(" Dewgong ");
        JRadioButton miltank = new JRadioButton(" Miltank ");
        JRadioButton pikachu = new JRadioButton(" Pikachu ");
        JRadioButton raichu = new JRadioButton(" Raichu ");
        JRadioButton togepi = new JRadioButton(" Togepi ");
        c.add(button);
        c.add(hitokage);
        c.add(dewgong);
        c.add(miltank);
        c.add(pikachu);
        c.add(raichu);
        c.add(togepi);

        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 250);
        setVisible(true);
    }


}