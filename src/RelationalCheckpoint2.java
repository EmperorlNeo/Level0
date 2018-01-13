import javax.swing.JOptionPane;

public class RelationalCheckpoint2 {
public static void main(String[] args) {
	String a= JOptionPane.showInputDialog("How many cups of flour do you have?");
	int b=Integer.parseInt(a);
	if (b<2){
		JOptionPane.showMessageDialog(null, "Go to the store and get more.");
	}
	String c=JOptionPane.showInputDialog("How many cookies will you give your guests?");
	int d=Integer.parseInt(c);
	if(d>=30){
		JOptionPane.showMessageDialog(null, "Then you'll have two bake two batches of cookies.");
	}
	String e=JOptionPane.showInputDialog("How many batches did you end up baking?");
	int f=Integer.parseInt(e);
	if(f>=2){
		JOptionPane.showMessageDialog(null, "You are lucky to have so many friends.");
	}
}
}
