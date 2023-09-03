// Java Program to Check Leap Year
public class LeapYear {
	public static void main(String[] args) {
		int year = 1996;
		boolean leap = false;
		if(year%400==0)
		{
			leap = true;
		}
		else if(year%100==0)
		{
			leap = false;
		}
		else if(year%4==0)
		{
			leap = true;
		}
		else
		{
			leap = false;
		}
		
		if(leap == true)
			System.out.println(year+" is a leap year.");
		else
			System.out.println(year+" is not a leap year.");
	}
}
