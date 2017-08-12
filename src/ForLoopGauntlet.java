
public class ForLoopGauntlet {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		for (int x = 100; x >= 0; x--) {
			System.out.println(x);
		}
		for (int w = 2; w <= 100; w=w+2) {
			System.out.println(w);
		}
		for (int e = 1; e<=100; e=e+2) {
			System.out.println(e);
		}
		for(int r =1; r<=500; r++){
		if(r%2==1){
			System.out.println(r+ " odd");
		}
		if(r%2==0){
			System.out.println(r+" even");
		}
		}
		for(int t= 7; t<=777; t++) {
			if(t%7==0){
				System.out.println(t);
			}
		}
		int years= 0;
		for(int y= 2001; y<=2017; y++){
			System.out.println("In "+y+", I was "+years+" years old.");
			years++;
		}
		
}
}