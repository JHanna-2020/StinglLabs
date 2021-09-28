//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;


import static java.lang.System.out;
public class LeaveOut
{
	//pre : a.length() > 1
	//post : string returned minus character at i
	public static String go( String a, int i)
	{
		Scanner keyboard = new Scanner( System.in );

		out.print("Enter index of letter to be removed:: ");
		int index = keyboard.nextInt();
		String test = a.substring(index, index+1);
		String newStrign = a-test;
		return test ;
	}
}