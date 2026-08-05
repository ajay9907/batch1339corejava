
public class PracticeFibonacci {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;

		for (int i = 1; i <= 76; i++) {
			
			int n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
			System.out.println(n1);

		}
	}
}
