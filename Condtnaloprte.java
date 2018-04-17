package package2;

public class Condtnaloprte 
{

	public static void main(String args [])
	{
		
			int a = 10;	
			int b = 20;
			int c = 30;
		    boolean bValue;
		    int iValue;
	 
		    bValue = (a == b + c) ? true: false;
		    System.out.println( "The boolean value of the variable 'bValue' is : " +  bValue ); 
	 
		    iValue = ((a == b + c)) ? 50: 100;
		    System.out.println( "The int Value of the variable iValue is : " + iValue ); 
	 
		    //This is a use of Not Logical Operator
		    iValue = (!(a == b + c)) ? 50: 100;
		    System.out.println( "The int Value of the variable iValue is : " + iValue ); 
		}
	 
	}
	
	 

