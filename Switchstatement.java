package package3;

public class Switchstatement 
{

	public static void main(String[] args) 
	{
		String sDay = "Monday";
		int iDay = 1;
		
		switch(iDay)
		{
		  case 1:
				System.out.println("Today is Monday");
				break;
		  case 2:
			    System.out.println("Today is Tuesday");
			    break;
		  case 3:
			    System.out.println("Today is Wednesday");
			    break;
		  case 4:
			    System.out.println("Today is Thursday");
			    break;
		  case 5:
			    System.out.println("Today is Friday");
			    break;
		  case 6:
			    System.out.println("Today is Saturday");
			    break;
		  default:
			    System.out.println("Today is Sunday");
			    break;
		  }

		switch(sDay){
		case "Monday":
			System.out.println("Today is Monday");
			break;
		case "Tuesday":
			System.out.println("Today is Tuesday");
			break;
		case "Wednesday":
			System.out.println("Today is Wednesday");
			break;
		case "Thursday":
			System.out.println("Today is Thursday");
			break;
		case "Friday":
			System.out.println("Today is Friday");
			break;
		case "Saturday":
			System.out.println("Today is Saturday");
			break;
		default:
			System.out.println("Today is Sunday");
			break;
				}
	}


		}



