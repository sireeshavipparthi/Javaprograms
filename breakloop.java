package package3;

public class breakloop 
{

	public static void main(String[] args)
	{
		for(int count=0;count<=10;count++)
		{
			if(count==6)
			{
				break;
			}
				System.out.println("value of count is:" + count);
		}
			System.out.println("You have exited the loop");
	}

	

}
