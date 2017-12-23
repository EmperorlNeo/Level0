import javax.swing.JOptionPane;

import com.spun.util.velocity.ParseCall;

public class IfElseCheckpoint2 {
public static void main(String [] args){
	//1)
	/*String a= JOptionPane.showInputDialog(null, "Was Wednesday fun?");
	if(a.equals("yes")){
		JOptionPane.showMessageDialog(null, "Happy Wednesday");
		
}
	else{
		JOptionPane.showMessageDialog(null, "Sad Wednesday");
	*/
	//2)
	String a= JOptionPane.showInputDialog(null, "How old are you?");
	int i= Integer.parseInt(a);
	if(i<=20){
		JOptionPane.showMessageDialog(null, "It's so great to be young");
	}
	else{
		JOptionPane.showMessageDialog(null, "Don't you wish you were young!");
	}
}
}

