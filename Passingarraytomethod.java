package package3;

public class Passingarraytomethod
{

	public static void main(String[] args)
   {
		
		String [] aMake = {"BMW","HONDA","TOYOTA"};
		Print_Array(aMake);
   }	
		public static void Print_Array(String [] array)
		{
			for(int i=0;i <=array.length-1;i++)
			{
				System.out.println("The length of array is:" + array[i]);
			}
		}
		

	}



