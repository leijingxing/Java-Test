public class print {
	public static void main(String[] args) {
		for (int i=0; i<10 ; i++) {
			System.out.print("*");
			for (int j=0; j<20; j++) {
					if (i>0 && i<9) {
						System.out.print(" ");
					}
					else{
						System.out.print("*");
					}
			}
			System.out.println("*");
		}
		System.out.print("\n");

	}
}