package package2;

public class Assop 
{
	static int speed = 80; // speed variable gets the value 80
	static int distance = 20; // distance variable gets the value 20
	static int time = 10; // time variable gets the value 10
	static String name = "ToolsQA"; // name variable gets the value ToolsQA
	static boolean isGood = true; // isGood variable gets the value true
	
	public static void main(String[] args)
	{
		    System.out.println("Value stored in the speed variable is : " + speed);
			System.out.println("Value stored in the distance variable is : " + distance);
			System.out.println("Value stored in the time variable is : " + time);
			System.out.println("Value stored in the name variable is : " + name);
			System.out.println("Value stored in the isGood variable is : " + isGood);
			
			speed = 100; // Previous value of speed is overwritten with 100
			time = distance; // Previous value of time is overwritten with distance value
			name = "ForumsQA"; // Previous value of name is overwritten with ForumsQA
			isGood = false; // Previous value of isGood is overwritten with false
			
			System.out.println("Value stored in the speed variable is : " + speed);
			System.out.println("Value stored in the time variable is : " + time);
			System.out.println("Value stored in the name variable is : " + name);
			System.out.println("Value stored in the isGood variable is : " + isGood);
	 
			//Multiple Assignments
			speed = distance = 0; // 100 (20 = 0) 
			System.out.println("Value stored in the speed variable is : " + speed);
	 
		
	}
}


