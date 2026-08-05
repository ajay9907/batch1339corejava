//Count the number of digits in a given number.
public class PracticeCount {
	public static void main(String[] args) {
		int num = 1234457;
		int count = 0;
		int i=1;
		for (; num > 0; num = num / 10) {
			count++;

		}
		System.out.println(count);

//		int num = 345676;
//		int count =0;
//		while (num > 0) {
//			num=num/10;
//			count++;
//			
//
//		}System.out.println(count);
	}
}
