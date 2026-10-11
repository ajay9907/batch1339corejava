package String_joiner;

import java.util.StringJoiner;

public class String_Joiner_Demo {

    public static void main(String[] args) {

        StringJoiner sj = new StringJoiner(",");

        sj.add("Java");
        sj.add("SQL");
        sj.add("HTML");

        System.out.println(sj);
    }
}