
	//Electricity Bill 
	//Input: units 
	//Conditions: 
	//If units ≤ 100 → ₹5/unit 
	//Else: 
	//If ≤ 200 → ₹7/unit 
	//Else → ₹10/unit 



	public class Electricity{
	    public static void main (String[]args){
	        int unit=1000;
	    
	        if(unit<=1000)
	        {
	            System.out.println("rs 5 per unit");
	        } else if(unit<=200)
	        {
	            System.out.println("rs 7 per unit");
	    }
	    else
	    {
	        System.out.println("rs 10 per Unit ");
	    }
	    }
	}
