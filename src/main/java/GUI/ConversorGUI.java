package main.java.GUI;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import main.java.Controller.Controller;
 
import java.text.NumberFormat;

public class ConversorGUI extends JFrame {

	private JPanel contentPane;
	private JFormattedTextField jtfDecimal;
	private JFormattedTextField jtfBin;
	private JFormattedTextField jtfOct;
	private JFormattedTextField jtfHex;
	private JFormattedTextField jtfPrecisao;
	private JButton btnConverter;
	private Controller c;
	
	/**
	 * Create the frame.
	 */
	public ConversorGUI() {
		c = new Controller(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 179);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jtfDecimal = new JFormattedTextField(NumberFormat.getNumberInstance());
		jtfDecimal.setBounds(13, 33, 117, 19);
		
		contentPane.add(jtfDecimal);
		
		JLabel lblDecimal = new JLabel("Decimal");
		lblDecimal.setBounds(13, 12, 70, 15);
		contentPane.add(lblDecimal);
		
		jtfBin = new JFormattedTextField();
		jtfBin.setEditable(false);
		jtfBin.setBounds(255, 33, 152, 19);
		contentPane.add(jtfBin);
		
		jtfOct = new JFormattedTextField(NumberFormat.getNumberInstance());
		jtfOct.setEditable(false);
		jtfOct.setBounds(255, 77, 152, 19);
		contentPane.add(jtfOct);
		
		jtfHex = new JFormattedTextField(NumberFormat.getNumberInstance());
		jtfHex.setEditable(false);
		jtfHex.setBounds(255, 127, 152, 19);
		contentPane.add(jtfHex);
		
		JLabel lblBinrio = new JLabel("Binário");
		lblBinrio.setBounds(256, 12, 70, 15);
		contentPane.add(lblBinrio);
		
		JLabel lblOctal = new JLabel("Octal");
		lblOctal.setBounds(255, 64, 70, 15);
		contentPane.add(lblOctal);
		
		JLabel lblHexadecimal = new JLabel("Hexadecimal");
		lblHexadecimal.setBounds(255, 108, 110, 15);
		contentPane.add(lblHexadecimal);
		
		btnConverter = new JButton("Converter");
		btnConverter.setBounds(13, 98, 117, 25);
		btnConverter.addActionListener(c.getBtnListener());
		contentPane.add(btnConverter);
		
		jtfPrecisao = new JFormattedTextField(NumberFormat.getIntegerInstance());
		jtfPrecisao.setBounds(13, 77, 60, 19);
		contentPane.add(jtfPrecisao);
		
		JLabel lblPreciso = new JLabel("Precisão");
		lblPreciso.setBounds(13, 64, 70, 15);
		contentPane.add(lblPreciso);
	}
	
	public double getDecimal()
	{
		String entrada = jtfDecimal.getText();
		if(entrada.equals(""))
			return 0;
		entrada = entrada.replaceAll("\\.", "");
		entrada = entrada.replace(',', '.');
		return Math.abs(Double.parseDouble(entrada));
	}
	
	public int getPrecisao()
	{
		if(jtfPrecisao.getText().equals(""))
			return 0;
		return Math.abs(Integer.parseInt(jtfPrecisao.getText()));
	}
	
	public void setTextBin(String txt)
	{
		jtfBin.setText(txt);
	}
	
	public void setTextOct(String txt)
	{
		jtfOct.setText(txt);
	}
	
	public void setTextHex(String txt)
	{
		jtfHex.setText(txt);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		ConversorGUI frame = new ConversorGUI();
		frame.setVisible(true);
	}
	
}
