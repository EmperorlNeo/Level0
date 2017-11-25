import javax.swing.JOptionPane;

public class IfElseCheckpoint {

	public static void main(String[] args) {
		// 1.
		// String y = "yes";
		// String a = JOptionPane.showInputDialog("Are you excited for Wednesday?");
		// if (a.equals(y)) {
		// JOptionPane.showMessageDialog(null, "HAPPY WEDNESDAY!");
		// } else {
		// JOptionPane.showMessageDialog(null, "sad wednesday...");
		// }

		// if(a.equals(y)){ ****How to equal two String variables****
		// }
		// If I set the String variable to no, then I would have to switch the message outputs
		// in the if and the else, but it would still serve the same function.

		// 2.
		String a = JOptionPane.showInputDialog("How old are you?");
		int i=Integer.parseInt(a);
		if (i<=20) {
			JOptionPane.showMessageDialog(null, "It’s so great being young");
		} else {
			JOptionPane.showMessageDialog(null, "Don't you wish you were young!");
		}

	}
}