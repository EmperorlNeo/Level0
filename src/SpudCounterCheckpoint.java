import javax.swing.JOptionPane;

public class SpudCounterCheckpoint {
public static void main(String[] args) {
	for(int i=0; i<=7; i++){
		String a=" potato";
		if(i==1){
			JOptionPane.showMessageDialog(null, i + a+",");
		}
		else if(i==7){
			JOptionPane.showMessageDialog(null, i+a+"es, more.");
		}
		else if(i==4){
			JOptionPane.showMessageDialog(null, "four");
		}
		else if(i>1){
			JOptionPane.showMessageDialog(null, i + a+"es,");
		}
		
	}
	}
}
