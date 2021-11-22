package bai01;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class First extends JFrame {

	private JPanel contentPane;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First frame = new First();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public First() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 347, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t1 = new JTextField("");
		t1.setBounds(107, 27, 96, 20);
		contentPane.add(t1);
		
		
		JButton b1 = new JButton("Submit");
		b1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String str=t1.getText(); // read the JTextFeild t1 data
		Second obj= new Second();// obj created for class Second()
		obj.my_update(str); // Execute the method my_update to pass str
		obj.setVisible(true); // Open the Second.java window
		dispose(); // Close the First.java window
	}
		});
		b1.setBounds(107, 70, 89, 23);
		contentPane.add(b1);
	}

}