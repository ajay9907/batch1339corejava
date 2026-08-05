
public class MixOperatorsEx {

	
	public static void main(String []args) {
		
//		System.out.println(Integer.toBinaryString(55));
//		
//		System.out.println(17&55);
//		System.out.println(17|55);
//		System.out.println(3>>2);
//		System.out.println(4<<6);
//		
		int a=4;
		
		a++;//5
		
		System.out.println(a+=5);//10
		
		a+=4;//14
		a--;//14-1=13
		System.out.println(a+=3);//13+=3--->16
		
		++a;//16+1-->17
		
		System.out.println(a);// as it is print 17
		
		a%=2;//17%2=-->1
		
		System.out.println(a);// as it is print of 1
		
		a*=3;//1*=3-->3
		
		a--;//3-1=2
		
		a++;//2+1--->3
		
		System.out.println(a-=2);//3-=2 -->1
		
		a%=5;
		
		--a;
		
		

		System.out.println(a);
		
		
		
	}
}
