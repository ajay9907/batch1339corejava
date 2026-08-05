

	//Student Grade System 
	//Input: marks 
	//Conditions: 
	//If ≥ 40 → Pass 
	//If ≥ 90 → A 
	//Else if ≥ 75 → B 
	//Else → C 
	//Else → Fail 


	public class GradeSystem{
	    public static void main (String[]args){
	        double marks=100;
	        
	        if(marks<=45)
	        {
	            System.out.println("Pass");
	        } else if(marks>=90)
	        {
	            System.out.println("A+");
	    }
	    else if(marks>=75)
	    {
	        System.out.println("B+");
	    }
	    else if(marks>=55){
	        System.out.println("C");
	    }else{
	        System.out.println("fail");
	    }
	}
	}

