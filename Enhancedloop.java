package package3;

public class Enhancedloop {

	public static void main(String[] args) {
		String [] Days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		// Enhanced for loop, this will automatically iterate on the array list 
		for (String dayname:Days)
		{
			System.out.println("Days is:" + dayname);
		}
			
           System.out.println("<==== Normal For Loop ====>");
	    // Normal for loop
	    for (int i=0; i < Days.length; i++) 
	    {
	        System.out.println("Days ==> "+ Days[i]);
	    }
		
	}

}
