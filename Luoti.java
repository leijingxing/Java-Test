public class Luoti{
	public static void main(String[] args) {
		int s=100;
		int h=100;

		for (int i=0; i<10 ;i++ ) {
			h = h/2;
			s = s+h;
		}
		System.out.println("all:"+s);

		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		

	}
}