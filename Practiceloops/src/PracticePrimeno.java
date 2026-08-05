//Prime number  means one and only They can self divisible ex: 1%1=0 
public class PracticePrimeno {

	public static void main(String[] args) {
//		int num = 2;
//		boolean isprime = true;
//		if (num <= 1) {
//			isprime = false;// always boolean is by default false but i want to check the condition then use true 
//
//		} else {
//			for (int i = 2; i <= num / 2; i++) {//Every number divisible by 1 
//				if (num % i == 0) {
//					isprime = false;
//					break;
//				}
//			}
//		}
//		if (isprime) {
//			System.out.println("Prime");
//		} else {
//			System.out.println("not prime");
//		}

		int num=2, count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Prime no ");
		} else {
			System.out.println("not prime");
		}
	}

}
