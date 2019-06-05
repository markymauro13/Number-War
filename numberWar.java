import javax.swing.*;
import java.awt.event.*;  

public class numberWar {

	private JTextField player, computer;
	private JButton go;
	
	public numberWar(){
		JFrame frame = new JFrame("Number War");	// creates the JFrame and titles it
	
		player = new JTextField();
		player.setBounds(25,200,125,20);
		frame.add(player);
		
		// these must be after everything or else other components will not display
		frame.setSize(400,400);	// sets the size of the frame
        frame.setLayout(null);	// sets layout   
		frame.setVisible(true);	// sets JFrame to be visible
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new numberWar();
	}

}
