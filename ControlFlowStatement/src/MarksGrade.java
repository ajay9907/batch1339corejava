//Write a program to display grade based on marks.

public class MarksGrade {

	public static void main(String[] args) {
		double marks = 90;

//		  if(marks>=75)
//		  {
//			  System.out.println("Distinction");
//		  }else if(marks>=60)
//		  {
//			  System.out.println("First class");
//		  }else if(marks>=50)
//		  {
//			  System.out.println("Second class");
//		  }else if(marks>=35)
//		  {
//			  System.out.println("pass");
//		  }else {
//			  System.out.println("fail");
//		  } 
		// OR

		if (marks >= 80 && marks >= 93) {
			System.out.println("Marks Destinction");
		} else if (marks >= 60 != marks <= 55 && marks >= 45) {
			System.out.println("First class");
		} else if (marks >= 55 && marks <= 60 && marks >= 50) {
			System.out.println("Second class");
		} else {
			System.out.println("pass");
		}
	}
}
