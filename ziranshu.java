import java.util.*;

class ziranshu{

	void show(int a){
		if(a>=0){
			System.out.print("a is ziranshu");
		}
		else{
			System.out.print("a is not ziranshu");
		}
		

	}


	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("input a Number:");
		int a=in.nextInt();
		demo01 demo=new demo01();
		demo.show(a);
		System.out.print("\n");
	}
}