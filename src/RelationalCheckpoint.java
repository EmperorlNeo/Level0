import javax.swing.JOptionPane;

public class RelationalCheckpoint {
public static void main(String[] args) {
	String a= JOptionPane.showInputDialog("How many cups of flour do you have?");
	int b= Integer.parseInt(a);
	if(b<2){
		JOptionPane.showMessageDialog(null, "Go get some more I guess, idk");
	}
	else{
		JOptionPane.showMessageDialog(null, "Great,you'll need it.");
	}
	String c=JOptionPane.showInputDialog("How many people are you going to give cookies to?");
	int d= Integer.parseInt(c);
	if(d>=30){	
		JOptionPane.showMessageDialog(null, "Then you'll have to bake two batches of cookies!");
	}
	else{
		JOptionPane.showMessageDialog(null, "You only need to bake one batch.");
	}
	String e=JOptionPane.showInputDialog("How many batches of cookies did you bake?");
	int f= Integer.parseInt(e);
	if(f>=2){
		JOptionPane.showMessageDialog(null, "Wow, you have a lot of friends");
	}
}
}
