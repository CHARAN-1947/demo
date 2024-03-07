package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Commerce {

	private JFrame frame;
	int items=0;
	int bill=0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Commerce window = new Commerce();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Commerce() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(64, 0, 64));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("E COMMERCE APP");
		lblNewLabel.setBounds(140, 21, 110, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel L1 = new JLabel("CART:0");
		L1.setBounds(324, 21, 78, 14);
		frame.getContentPane().add(L1);
		
		JButton b1 = new JButton("New button");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				bill=bill+290;
				L1.setText("CART :"+items);
			}
		});
		b1.setIcon(new ImageIcon("C:\\Users\\on line lab\\Downloads\\book 1.jpg"));
		b1.setBounds(30, 46, 127, 156);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("New button");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				bill=bill+500;
				L1.setText("CART :"+items);
			}
		});
		b2.setBackground(new Color(128, 128, 255));
		b2.setIcon(new ImageIcon("C:\\Users\\on line lab\\Downloads\\book 3.jfif"));
		b2.setBounds(196, 45, 134, 157);
		frame.getContentPane().add(b2);
		
		JLabel lblNewLabel_2 = new JLabel("RS.290");
		lblNewLabel_2.setBounds(79, 213, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("RS.500");
		lblNewLabel_3.setBounds(268, 213, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton buy = new JButton("BUY");
		buy.addActionListener(new ActionListener() {
			
			
			
			
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(buy, "total items selected:"+items+"\nTotal cost:"+bill);
			}
		});
		buy.setBounds(335, 209, 89, 23);
		frame.getContentPane().add(buy);
				
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBackground(new Color(64, 0, 64));
		lblNewLabel_4.setBounds(10, 0, 414, 250);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBackground(new Color(128, 128, 192));
		lblNewLabel_5.setBounds(10, 0, 424, 261);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
