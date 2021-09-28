//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class SwitchFirst
{
   public static String go( String a, String b )
	{
		String step1 =  a.substring(0,1).replace(a.substring(0,1),b.substring(0,1))+a.substring(1, a.length()-1+1);

		return step1;
	}
}