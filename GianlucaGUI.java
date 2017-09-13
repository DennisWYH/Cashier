import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GianlucaGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public GianlucaGUI() {
		
		
		JPanel panel1 = new JPanel();
		GridLayout panel1Grid = new GridLayout(0, 2);
		panel1.setLayout(panel1Grid);
		panel1.add(new JButton("Customer Name"));
		panel1.add(new JTextField(""));
		panel1.add(new JButton("Product Name"));
		panel1.add(new JTextField(""));
		panel1.add(new JButton("Product Price"));
		panel1.add(new JTextField(""));
		panel1.add(new JButton("Amount"));
		panel1.add(new JTextField(""));
		
		panel1.add(new JButton("Submit"));
		
		JPanel panel2 = new JPanel();
		GridLayout panel2Grid = new GridLayout(0, 1);
		panel2.setLayout(panel2Grid);
		panel2.add(new JButton("Gianluca"));
		panel2.add(new JButton("Maria Grazia"));
		panel2.add(new JButton("Yunhai"));
		
		

		JFrame frame = new JFrame("Gianluca Cashier");
		
		
		GridLayout frameGrid = new GridLayout(0,2);
		frame.setLayout(frameGrid);
		frame.add(panel1);
		frame.add(panel2);
		frame.setIconImage(new ImageIcon("/Users/marve/Documents/Cashier/JFrameIcon/letter-l.png").getImage());
//		frame.setIconImage(iconImage.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 200);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		
		
		
	}

	public static void main(String[] args) {
		
		new GianlucaGUI();
	}
}
