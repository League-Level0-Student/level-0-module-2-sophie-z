package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String age=JOptionPane.showInputDialog("How old are you?");
	int numage=Integer.parseInt(age);
	if (numage>18) {
		JOptionPane.showInputDialog(null, "Who do you think the next president should be?");
	JOptionPane.showMessageDialog(null, "Cool.");
	}
	if(numage<18) {
		JOptionPane.showMessageDialog(null, "You're too young. No one cares what you think.");
	}
}
}
