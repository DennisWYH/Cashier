import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class GianlucaGUI extends JFrame {
	
	private static List<String[]> dic = new ArrayList<String[]>();
	
	private static JTextField  customerName = new JTextField();
	private static JTextField productName = new JTextField();
	private static JTextField productPrice = new JTextField();
	private static JTextField amount = new JTextField();
	
	private static JButton Mari = new JButton("Maria Grazia");
	private static JButton Yunhai = new JButton("Yunhai");
	private static JButton Luca = new JButton("Gianluca");
	
	private static final long serialVersionUID = 1L;
	
	public GianlucaGUI() {
		JPanel panel1 = new JPanel();
		GridLayout panel1Grid = new GridLayout(0, 2);
		panel1.setLayout(panel1Grid);
		panel1.add(new JButton("Customer Name"));
		panel1.add(customerName);
		panel1.add(new JButton("Product Name"));
		panel1.add(productName);
		panel1.add(new JButton("Product Price"));
		panel1.add(productPrice);
		panel1.add(new JButton("Amount"));
		panel1.add(amount);
	
		JButton submit = new JButton("Submit");
		submit.addActionListener((e)->{submitAction();});
		panel1.add(submit);
		
		JPanel panel2 = new JPanel();
		GridLayout panel2Grid = new GridLayout(0, 1);
		panel2.setLayout(panel2Grid);
		
		Mari.addActionListener((e) ->{ShowMariaOrders();});
		Yunhai.addActionListener((e) ->{ShowYunhaiOrders();});
		Luca.addActionListener((e) ->{ShowLucaOrders();});
		
		panel2.add(Mari);
		panel2.add(Yunhai);
		panel2.add(Luca);
		

		JFrame frame = new JFrame("Gianluca Cashier");
		
		
		GridLayout frameGrid = new GridLayout(0,2);
		frame.setLayout(frameGrid);
		frame.add(panel1);
		frame.add(panel2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 200);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

	}
	
	/**
	 * ActionListener for sumbit button
	 */
	
	public static void submitAction(){
		String[] temp = new String[4];
		temp[0] = customerName.getText();
		temp[1] = productName.getText();
		temp[2] = productPrice.getText();		
		temp[3] = amount.getText();
		dic.add(temp);
		
	}
	public static List<String[]> ShowMariaOrders(){
		List<String[]> dicMaria = new ArrayList<String[]>();
		for (String[] array : dic){
			if(array[0].equals("Maria")){
				dicMaria.add(array);
			}
		}
		JFrame frameMari = new JFrame("Mari's order");
		JPanel panelMari = new JPanel();
		String[] columnNames = {"Customer Name", "Product Name", "Product Price", "Amount"};
		int sizeMari = dicMaria.size();
		String[][] mariorders = new String[sizeMari][4];
		for(int i = 0; i< sizeMari; i++){
			mariorders[i] = dicMaria.get(0);
		}
		JTable tableMari = new JTable(mariorders, columnNames);
		panelMari.add(tableMari);	
		frameMari.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMari.setSize(500, 200);
		frameMari.setVisible(true);
		frameMari.setLocationRelativeTo(null);
		frameMari.add(panelMari);

		return dicMaria;

		
	}

	public static List<String[]> ShowYunhaiOrders(){
		List<String[]> dicYunhai = new ArrayList<String[]>();
		for (String[] array : dic){
			if(array[0].equals("Yunhai")){
				dicYunhai.add(array);
			}
		}
		JFrame frameYunhai = new JFrame("Yunhai's order");
		JPanel panelYunhai = new JPanel();
		String[] columnNames = {"Customer Name", "Product Name", "Product Price", "Amount"};
		int sizeYunhai = dicYunhai.size();
		String[][] yunhaiorders = new String[sizeYunhai][4];
		for(int i = 0; i< sizeYunhai; i++){
			yunhaiorders[i] = dicYunhai.get(0);
		}
		JTable tableYunhai = new JTable(yunhaiorders, columnNames);
		panelYunhai.add(tableYunhai);	
		frameYunhai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameYunhai.setSize(500, 200);
		frameYunhai.setVisible(true);
		frameYunhai.setLocationRelativeTo(null);
		frameYunhai.add(panelYunhai);
		return dicYunhai;
	}

	public static List<String[]> ShowLucaOrders(){
		List<String[]> dicLuca = new ArrayList<String[]>();
		for (String[] array : dic){
			if(array[0].equals("Luca")){
				dicLuca.add(array);
			}
		}
		JFrame frameLuca = new JFrame("Luca's order");
		JPanel panelLuca = new JPanel();
		String[] columnNames = {"Customer Name", "Product Name", "Product Price", "Amount"};
		int sizeLuca = dicLuca.size();
		String[][] lucaorders = new String[sizeLuca][4];
		for(int i = 0; i< sizeLuca; i++){
			lucaorders[i] = dicLuca.get(0);
		}
		JTable tableLuca = new JTable(lucaorders, columnNames);
		panelLuca.add(tableLuca);	
		frameLuca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameLuca.setSize(500, 200);
		frameLuca.setVisible(true);
		frameLuca.setLocationRelativeTo(null);
		frameLuca.add(panelLuca);

		return dicLuca;

		
	}
	
	

	public static void main(String[] args) {
		new GianlucaGUI();
	}
}
