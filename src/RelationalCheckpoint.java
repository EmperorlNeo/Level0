import javax.swing.JOptionPane;

public class RelationalCheckpoint {
public static void main(String[] args) {
	String a= JOptionPane.showInputDialog("How many cups of flour do you have?");
	int b= Integer.parseInt(a);
	if(b<2){
		JOptionPane.showMessageDialog(null, "Go get some more I guess, idk");
	}
	else{
		JOptionPane.showMessageDialog(null, "Why? What are you even doing");
	}
}
}
