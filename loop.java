package package3;

public class loop
{

	public static void main(String[] args) 
	{
		//Increment and Prints the values upto 5
		for(int i=0;i<=5;i++)
		{
			System.out.println("values are:" + i);
		}
		//Decrement and print the values upto 0
		for(int i=5;i>=0;i--)
		{
			System.out.println("values are:" + i);
		}
		
		// This will print -- 0,2,4
		for(int i = 0;i<=5;i+=2)
		{
			System.out.println("Skip every one another  ==> " + i );
		}
	}
	

}
