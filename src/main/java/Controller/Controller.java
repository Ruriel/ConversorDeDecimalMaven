package main.java.Controller;
//Comentário  
import main.java.GUI.ConversorGUI;
import main.java.Model.Conversor;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller 
{
	private ConversorGUI view;
	private Conversor model;
	public Controller(ConversorGUI v)
	{
		view = v;
		model = new Conversor();
	}
	
	public class btnListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			double valor = view.getDecimal();
			int precisao = view.getPrecisao();
			model.setCasas(precisao);
			view.setTextBin(model.converter(valor, 2));
			view.setTextOct(model.converter(valor, 8));
			view.setTextHex(model.converter(valor, 16));
		}
		
	}
	public ActionListener getBtnListener()
	{
		return new btnListener();
	}
	
}
