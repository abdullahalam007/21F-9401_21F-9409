package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.calculatormodel;
import view.calculatorview;

public class calculatorcontroller  {

	private calculatormodel model;
	private calculatorview view;

	public calculatorcontroller(calculatormodel m, calculatorview v) {
		super();
		this.model = m;
		this.view = v;
		this.view.setActionListner(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
                
				String operation = e.getActionCommand();
				double a = view.getfirstoperand();
				double b = view.getsecondoperand();
				double result = 0;

				switch (operation) {
				case "+":
					result = model.add(a, b);
					break;
				case "-":
					result = model.subtract(a, b);
					break;
				default:
				}
				view.updateresult(result);
		}
		
	});

/*	class calculationListner implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {

			String operation = e.getActionCommand();
			double a = view.getfirstoperand();
			double b = view.getsecondoperand();
			double result = 0;

			switch (operation) {
			case "+":
				result = model.add(a, b);
				break;
			case "-":
				result = model.subtract(a, b);
				break;
			default:
			}
			view.updateresult(result);
	}
	
	

	}
	*/

}
}