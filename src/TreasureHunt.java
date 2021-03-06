
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.ImageBackground;
import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.Tortoise;

/**
 * Note: You will need the latest version of the TKP jar:
 * http://school.wintrisstech.org/jars/TeachingKidsProgramming.jar
 **/

public class TreasureHunt implements KeyEventDispatcher {

	int tortoiseSpeed = 5;

	private void goUp() {
		// 1. Make the tortoise move up the screen
		Tortoise.setAngle(0);
		Tortoise.move(5);
		// System.out.println(Tortoise.getX());
		// System.out.println(Tortoise.getY());

	}

	private void goDown() {
		// 2. make the tortoise move down the screen
		Tortoise.setAngle(180);
		Tortoise.move(5);
		// System.out.println(Tortoise.getX());
		// System.out.println(Tortoise.getY());
	}

	private void goLeft() {
		// 3. make the tortoise move left (3 lines of code)
		// Hint: the turn() method lags more than setAngle()
		Tortoise.setAngle(270);
		Tortoise.move(5);
		// System.out.println(Tortoise.getX());
		// System.out.println(Tortoise.getY());
	}

	private void goRight() {
		// 4. make the tortoise move right
		Tortoise.setAngle(90);
		Tortoise.move(5);
		// System.out.println(Tortoise.getX());
		// System.out.println(Tortoise.getY());
	}

	private void spaceBarWasPressed() {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		// 5. Print out the variables for tortoiseLocationX and
		// tortoiseLocationY
		System.out.println();
		// 6. If tortoise is at same location as the little girl,
		// make a pop-up tell the Tortoise where to go next
		int NWGirlX = 490;
		int NWGirlY = 290;
		int NEGirlX = 515;
		int NEGirlY = 290;
		int SWGirlX = 495;
		int SWGirlY = 350;
		int SEGirlX = 515;
		int SEGirlY = 350;

			if (tortoiseLocationX<SEGirlX && tortoiseLocationX>NWGirlX && tortoiseLocationY<SEGirlY && tortoiseLocationY>NEGirlY) {
				JOptionPane.showMessageDialog(null, "Pirate Robot" );
			}
		
		int NWPirateX = 390;
		int NWPirateY = 225;
		int NEPirateX = 425;
		int NEPirateY = 225;
		int SWPirateX = 390;
		int SWPirateY = 330;
		int SEPirateX = 440;
		int SEPirateY = 330;
		
			if(tortoiseLocationX<SEPirateX && tortoiseLocationX>NWPirateX && tortoiseLocationY<SEPirateY && tortoiseLocationY>NEPirateY) {
				JOptionPane.showMessageDialog(null, "Parrot");
			}
			
		int NWParrotX = 405;
		int NWParrotY = 95;
		int NEParrotX = 420;
		int NEParrotY = 95;
		int SWParrotX = 405;
		int SWParrotY = 115;
		int SEParrotX = 420;
		int SEParrotY = 115;
		
			if(tortoiseLocationX<SEParrotX && tortoiseLocationX>NWParrotX && tortoiseLocationY<SEParrotY && tortoiseLocationY>NEParrotY) {
			JOptionPane.showMessageDialog(null, "Swamp");	
			}
			
		int NWSwampX = 45;
		int NWSwampY = 385;
		int NESwampX = 515;
		int NESwampY = 385;
		int SWSwampX = 45;
		int SWSwampY = 440;
		int SESwampX = 515;
		int SESwampY = 440;
		
			if(tortoiseLocationX<SESwampX && tortoiseLocationX>NWSwampX && tortoiseLocationY<SESwampY && tortoiseLocationY>NESwampY) {
				JOptionPane.showMessageDialog(null, "You're finally done");
			}
		// 7. Give the user subsequent clues at different locations on the image
		// (pirate robot, swamp, parrots, etc.)

	}

	private void go() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		/*
		 * If you want to use your own background, download the image you want,
		 * and change the following line to point to it like: new
		 * ImageBackground("file:/Users/joonspoon/Desktop/dinosaurLand.jpg");
		 */
		Paintable backgroundImage = new ImageBackground(
				"file:/Users/League/Google Drive/league-images/treasure_hunt.jpg");
		Tortoise.getBackgroundWindow().addPaintable(backgroundImage);
		Tortoise.penUp();
		JOptionPane.showMessageDialog(null,
				"Ask the little girl for help with your quest. Press the space bar to ask.");
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			else if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			else if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();
			else if (e.getKeyCode() == KeyEvent.VK_SPACE)
				spaceBarWasPressed();
		}
		return false;
	}

	public static void main(String[] args) throws MalformedURLException {
		new TreasureHunt().go();
	}
}
