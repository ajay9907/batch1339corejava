
public class Palandrome {
	public static void main(String[] args) {
		int num = 124;
		int o=num;
		int rev = 0;
		while (num != 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num/=10;

		}if(o==rev)
		{
			System.out.println("palindrome ");
		}else {
			System.out.println("not palindrome");
		}

	}
}