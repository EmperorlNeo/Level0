import javax.swing.JOptionPane;

public class BottlesOfBeer {
public static void main(String[]args){
	String a= " bottle";
	String b= " on the wall";
	String c= "Take one down and pass it around, ";
	String d= " of beer";
	for(int i=99; i>=3; i--){
		System.out.println(i+a+"s"+d+b+", "+i+a+"s"+d+"."+c+(i-1)+a+"s"+d+b+".");
	}
	System.out.println();
}
}
