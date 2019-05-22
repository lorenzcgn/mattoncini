
import java.awt.Color;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
            Menu1 menu=new Menu1();
            JFrame obj2 = new JFrame();
            JFrame obj=new JFrame();
            Gameplay gioco = new Gameplay();
            
            obj.setBounds(10, 10, 700, 600);
            obj.setTitle("Mattoncini - Huqi & Cagni");		
            obj.setResizable(false);
            obj.setVisible(true);
            obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            obj.add(gioco);
            obj.setVisible(true);
            obj2.setBounds(705, 100, 320, 509);
            obj2.setResizable(false);
            obj2.setVisible(true);
            obj2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            obj2.add(menu);
            obj2.setVisible(true);	
	}
}