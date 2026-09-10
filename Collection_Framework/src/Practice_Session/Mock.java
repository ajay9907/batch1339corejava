package Practice_Session;

import java.util.*;
import java.util.stream.Collectors;

public class Mock {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("Ajay", "xyz", "aBC");

		String result = list.stream().map(String::toUpperCase).collect(Collectors.joining(","));
		System.out.println(result + " ");
	}

}
