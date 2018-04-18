package package3;

public class Dowhileloop
{

	public static void main(String[] args) 
	{
		int count = 0;
		do
		{
			count = count + 5;
			System.out.println("Count -->" + count);
		}while(count<25);
			
		int countone = 25;
		System.out.println("Next loop");
		
		do
		{
			countone = countone + 5;
			System.out.println("Count -->" + countone);
		
		}while(countone<25);
	}

}
