//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class FirstLast
{
   public static String go(String a, String b )
	{
		String firstA = a.substring(0,1);
		String lastB = b.substring(b.length()-1);
		String ab = firstA+lastB;
		return ab;

	}
}