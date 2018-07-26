/*有一堆煤球，堆成三角棱锥形。具体：
第一层放1个，
第二层3个（排列成三角形），
第三层6个（排列成三角形），
第四层10个（排列成三角形），
....
如果一共有100层，共有多少个煤球？*/
public class Test02{
	
	public static void main(String[] args){
		int a=0;
		for(int i=0;i<=100;++i){
			a += (1+i)*i/2;

		System.out.println("第1到"+(i+1)+"层煤球总数目：\t"+a);
		}
	}

}
