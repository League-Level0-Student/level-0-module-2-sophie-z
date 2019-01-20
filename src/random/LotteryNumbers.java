package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	
	Random r=new Random();
int x=r.nextInt(10);
int i=r.nextInt(10);
int y=r.nextInt(10);
int t=r.nextInt(10);
int m=r.nextInt(10);
JOptionPane.showMessageDialog(null, "" + x + i + y + t + m);
}
}