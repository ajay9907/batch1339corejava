package StringLiterals_SCP;

public class String_Length {
	public static void main(String[] args) {
		String name = "Ajay";
		String fName = "Ajay";
		String name1 = fName.concat("Agwan");
		System.out.println(name1);
		System.out.println(fName);
		System.out.println(name.hashCode());
		System.out.println(fName.hashCode());
		System.out.println(System.identityHashCode(name));
		System.out.println(System.identityHashCode(fName));

		System.out.println(name == fName);
		System.out.println(name.equals(fName));

	}
}
