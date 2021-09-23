//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class AvgLen
{
	public static double go( String a, String b )
	{
		//grab length
		double aLength = a.length();
		double bLength = b.length();
		// add them
		double add = aLength+bLength;
		double result = add/2;
		return result;
	}
}