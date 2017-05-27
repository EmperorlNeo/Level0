import java.awt.print.Printable;
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[] args) {
	int ok	=new Random().nextInt(9);
	System.out.println(ok);
	String question=JOptionPane.showInputDialog(null,"What is your question?");
	if(ok== 0){
		JOptionPane.showMessageDialog(null, "Yes");
	}
	if(ok== 1){
		JOptionPane.showMessageDialog(null, "No");
	}
	if(ok== 2){
		JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
	}
	if(ok== 3){
		JOptionPane.showMessageDialog(null, "Probably not");
	}
	if(ok== 4){
		JOptionPane.showMessageDialog(null, "Probably");
	}
	if(ok== 5){
		JOptionPane.showMessageDialog(null, "In your dreams");
	}
	if(ok== 6){
		JOptionPane.showMessageDialog(null, "Ask again later");
	}
	if(ok== 7){
		JOptionPane.showMessageDialog(null, "Don't count on it");
	}
	if(ok== 8){
		JOptionPane.showMessageDialog(null, "Without a doubt");
	}
}
}
