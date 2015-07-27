import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//klasa z oknem programu


public class Window	extends JFrame implements ActionListener
{
	JButton bDisplayGuitar, bExit;
	JLabel lDisplayGuitar;
	JTextField tBrand, tModel, tStrings, tPrice, tId; 
//	private Guitar gClass;
//	
//	protected void onCreate(Bundle savedInstanceState)
//	{
//		super.onCreate(savedInstanceState)
//		gClass = new Guitar(this);
//		
//	}
	
	
	
	public Window()
	{
		setSize(300,200);
		setTitle("Guitar Project");
		setLayout(null);
		bDisplayGuitar = new JButton("btn1");
		bDisplayGuitar.setBounds(50, 100, 100, 20);
		add(bDisplayGuitar);
		bDisplayGuitar.addActionListener(this);
		bExit = new JButton("Exit");
		bExit.setBounds(150, 100,  100, 20);
		add(bExit);	
		bExit.addActionListener(this);
		
		lDisplayGuitar = new JLabel("");
		lDisplayGuitar.setBounds(0, 0, 250, 20);
		lDisplayGuitar.setForeground(Color.DARK_GRAY);
		lDisplayGuitar.setFont(new Font("SansSerif", Font.BOLD, 14));
		add(lDisplayGuitar);
		
		tBrand = new JTextField("");
		tBrand.setBounds(150, 20, 100, 20);
		add(tBrand);
		tModel = new JTextField("");
		tModel.setBounds(150,40,100,20);
		add(tModel);
		tStrings = new JTextField("");
		tStrings.setBounds(150, 60, 100, 20);
		add(tStrings);
		tPrice = new JTextField("");
		tPrice.setBounds(150, 80, 100, 20);
		add(tPrice);
		
		
		
	}
	
	public static void main(String[] args) {
		
		Window window = new Window();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object source = e.getSource();
		if(source==bDisplayGuitar)
		{	
			Guitar schecter_omen_6 = new Guitar("Schecter", "omen-6", 6, 1000);
			lDisplayGuitar.setText(new Guitar().toString());
			//System.out.println(new Date());
		}
		else if(source==bExit)
		{
			dispose();
		}
		
		
	}
	
	
}