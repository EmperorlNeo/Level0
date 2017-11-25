
public class MoustachesCheckpoints {
	public class ElTortuga {

		static int tortoiseLocation;

		public static void main(String[] args) {

			tortoiseLocation = Tortoise.getLocation();

			if (tortoiseLocation < 0)

				System.out.println("El Tortuga se ha ido!");
		}
	}
}