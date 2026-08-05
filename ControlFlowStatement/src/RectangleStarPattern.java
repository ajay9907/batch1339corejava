
public class RectangleStarPattern {

	public static void main(String[] args) {
		int n = 9;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= n; j++) {
				//logic 
				if (i == 1 || j == 1 || i == n || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
