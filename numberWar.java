import java.awt.*;
import javax.swing.*;
import java.awt.event.*;  
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

public class numberWar implements ActionListener {

	private JTextField player, computer, winner, decoy;
	private JButton go;
	private JLabel playerLabel, computerLabel, numberWar, gameDesc, gameDesc1;
	private ImageIcon thumbsUp, thumbsDown;
	private JLabel tU,tD;
	private int range = 100;
	private int randomNum = (int) (Math.random() * range) + 1;
	
	public numberWar() {
		JFrame frame = new JFrame("Number War");	// creates the JFrame and titles it

		Font font = new Font("Segoe UI",Font.BOLD,15);
		gameDesc = new JLabel("Verse the computer and see who wins!");
		gameDesc.setForeground(Color.BLACK);
		gameDesc.setFont(font);
		gameDesc.setBounds(60,-20,400,200);
		frame.add(gameDesc);
		
		gameDesc1 = new JLabel("Person/Robot with the highest number wins.");
		gameDesc1.setForeground(Color.BLACK);
		gameDesc1.setFont(font);
		gameDesc1.setBounds(45,10,400,200);
		frame.add(gameDesc1);
		
		Font font0 = new Font("Segoe UI",Font.BOLD,30);
		numberWar = new JLabel("Number War!");
		numberWar.setForeground(Color.BLACK);
		numberWar.setFont(font0);
		numberWar.setBounds(100,-70,2000,200);
		frame.add(numberWar);
		
		Font font1 = new Font("Segoe UI",Font.BOLD,20);	
		playerLabel = new JLabel("Player 1"); 
		playerLabel.setForeground(Color.BLACK);
		playerLabel.setFont(font1);
		playerLabel.setBounds(55,160,125,30);
		frame.add(playerLabel);
		
		
		player = new JTextField();
		player.setBounds(35,200,125,30);
		frame.add(player);

		
		Font font2 = new Font("Segoe UI",Font.BOLD,20);
		computerLabel = new JLabel("Computer"); 
		computerLabel.setForeground(Color.BLACK);
		computerLabel.setFont(font2);
		computerLabel.setBounds(240,160,125,30);
		frame.add(computerLabel);
		
		decoy = new JTextField("I already chose my #");
		decoy.setBounds(220,200,125,30);
		frame.add(decoy);
		
		computer = new JTextField("2");
		computer.setBounds(220,200,125,30);
		frame.add(computer);
	
		
		go = new JButton("Go");
		go.setBounds(164,250,50,30);
		frame.add(go);
	
		
		winner = new JTextField();
		winner.setBounds(125,315,125,30);
		frame.add(winner);
		
		computer.addActionListener(this);
		player.addActionListener(this);
		go.addActionListener(this);
	    winner.setEditable(true);
		
	    frame.getContentPane().setBackground(Color.pink);
		frame.setSize(400,450);	// sets the size of the frame
        frame.setLayout(null);	// sets layout   
		frame.setVisible(true);	// sets JFrame to be visible
	
	}
	
	public int getRandomNumber() {
		return randomNum;
	}

	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String s1 = player.getText();
        int a = Integer.parseInt(s1);  
        
        String s2 = computer.getText();
        int b = Integer.parseInt(s2);
        
        if(e.getSource() == go) {
        	if(a > range) {
        		String result = "Pick a # <= 100";
        		winner.setText(result);
        	}
        	else if(a > getRandomNumber()) {
        		String result = "You win!";
        		winner.setText(result);
        	}
        	else if(getRandomNumber() > a) {
        		String result = "You lose!";
        		winner.setText(result);
        	}
        	else {
        		String result = "You tied!";
        		winner.setText(result);
        	}
        }
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new numberWar();
	}



}
