package StringLiterals_SCP;

public class DemoString {
	public static void main(String[] args) {

//		String name = "Ajay";
//		String s = new String("Ajay");
//		System.out.println(name);
//		System.out.println(s);
//
//		System.out.println(System.identityHashCode(name));
//		System.out.println(System.identityHashCode(s));

//		String name = "Swapnil";
//		String fname = "Swapnil + Supekar";// In case String literals assign new memory location we cannot update it. 

//		System.out.println(name);
//		System.out.println(fname);
//		
//		System.out.println(name==fname);

//		System.out.println(System.identityHashCode(name));//
//		System.out.println(System.identityHashCode(fname));

		String s1 = ("Hello");
		String s = s1.concat("Ajay");
		String s2 = s1 + s;

		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s));
//
//		System.out.println(s1.hashCode());
//		System.out.println(s.hashCode());
//		System.out.println(s2.hashCode());

//		System.out.println(System.identityHashCode(s1));
//		System.out.println(System.identityHashCode(s));
//		System.out.println(System.identityHashCode(s2));

	}
}
