package package3;

public class Returningarrayfrommethod 
{

	public static void main(String[] args) 
	{
		String [] amake = Returnarray();
		for(int i=0; i<=amake.length-1; i++)
		{
			System.out.println("The length of array is:" + amake[i]);
		}
	}

	public static String [] Returnarray()
	{
		String [] aArray = {"BMW","HONDA","TOYOTA"};
		return aArray;
		
	}
}
