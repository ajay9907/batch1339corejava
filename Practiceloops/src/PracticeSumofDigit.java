//Find the sum of digits of a number-->1345=1+3+4+5=13

public class PracticeSumofDigit {
	public static void main(String[] args) {
		int num = 1345;//-->ans 10
		int sum = 0;
		while (num> 0) {
			int d=num%10;//1234
			sum=sum+d;//0+1234=1234
			num/=10;//1234/

		}System.out.println(sum);

	}
}
