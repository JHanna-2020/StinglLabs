//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class LeaveOut
{
	//pre : a.length() > 1
	//post : string returned minus character at i
   public static String go( String a, int i)
	{
		i = a.length()/2;

		return a.substring(i,i+1);
	}
}