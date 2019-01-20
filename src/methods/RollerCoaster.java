package methods;

import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	String height=JOptionPane.showInputDialog("How tall are you? (in inches)");
	int numheight=Integer.parseInt(height);
	if (numheight>48) {
	JOptionPane.showMessageDialog(null, "Yay! You can go on the roller coaster!");
	}
	}
}

