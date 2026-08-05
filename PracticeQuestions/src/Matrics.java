
//Print a pattern where:
//
//1 0 1
//0 1 0
//1 0 1
//(Use if-else to decide 1 or 0)

public class Matrics {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if((i+j)%2==0)//for matrics 
				{
					System.out.print(" "+"1"+" ");
				}else {
					System.out.print(" "+"0"+" ");
				}
			}System.out.println();
		}
	}
}