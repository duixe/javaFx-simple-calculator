package application;

//import java.util.EventObject;

import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
public class Calcontroller {
	
	@FXML
	private Label answer;
	private boolean start = true;
	private double num1 = 0;
	private String operator = "";
	
	CalcModal modal = new CalcModal();
	
	
	@FXML
	public void processNum(ActionEvent e) {
		if(start) {
			answer.setText("");
			start = false;
		}
		String value = ((Button)e.getSource()).getText();
		answer.setText(answer.getText() + value);
	}
	
	@FXML
    public void processOp(ActionEvent e) {
		String value = ((Button)e.getSource()).getText();
		
		if(!value.equals("=")) {
			if(!operator.isEmpty())
				return;
			
			
			operator = value;
			num1 = Double.parseDouble(answer.getText());
			answer.setText("");
 		}else {
 			if(operator.isEmpty())
				return;
 			
 			double num2 = Double.parseDouble(answer.getText());
 			double output = modal.calculate(num1, num2, operator);
 			answer.setText(String.valueOf(output));
 			operator = "";
 			start = true;
 		}
	}
}






