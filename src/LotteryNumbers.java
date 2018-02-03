import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[]args){
	String u = ", ";
	String g = "YOUR LOTTERY TICKET NUMBERS:";
	Random lot=new Random();
		for(int i=0; i<5; i++){
			int t= 1+lot.nextInt(50);
g=g+t+u;
		}	
		JOptionPane.showMessageDialog(null, g);
}
}
