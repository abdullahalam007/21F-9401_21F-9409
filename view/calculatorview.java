package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class calculatorview extends Frame {

	private Label num1lbl;
	private Label num2lbl;
	private Label resultlbl;

	private TextField num1Text;
	private TextField num2Text;
	private TextField resultText;

	private Button addbtn;
	private Button subbtn;

	public calculatorview() {
		num1lbl = new Label("Number 1");
		num2lbl = new Label("Number 2");
		resultlbl = new Label("Result");

		num1Text = new TextField(10);
		num2Text = new TextField(10);
		resultText = new TextField(10);

		addbtn = new Button("Add");
		subbtn = new Button("Subtract");

		this.add(num1lbl);
		this.add(num1Text);

		this.add(num2lbl);
		this.add(num1Text);

		this.add(resultlbl);
		this.add(resultText);
		
		
		addbtn.setActionCommand("+");
		addbtn.setActionCommand("-");

		setSize(200, 200);
		setLocation(300, 300);

		setLayout(new FlowLayout());
		
		this.addWindowListener(new WindowAdapter()
				{
			        @Override
			        public void windowClosing(WindowEvent e)
			        {
			        	dispose();
			        }
				});

	}
	
	public double getfirstoperand()
	{
		return Double.parseDouble(num1Text.getText());
	}
	
	public double getsecondoperand()
	{
		return Double.parseDouble(num2Text.getText());

	}
	public void updateresult(double result)
	{
		resultText.setText(result + "");
	}
	public void setActionListner(ActionListener a1)
	{
		this.addbtn.addActionListener(a1);
		this.subbtn.addActionListener(a1);

	}

}
