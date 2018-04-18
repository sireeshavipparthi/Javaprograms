package package3;

public class continueloop
{

	public static void main(String[] args) 
	{
		//print values upto 5
		for (int i=0;i<=5;i++)
		{
			if(i==3)
			{
				continue;
			}
			System.out.println("value of i is" + i);
		}
		//This will print upto 3
		for (int i=0;i<=5;i++)
		{
		    if(i==3)
		     {
			   System.out.println("value of i is:" + i);
		      }
	    }
	}
}
