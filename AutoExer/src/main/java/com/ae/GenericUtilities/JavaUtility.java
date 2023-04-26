package com.ae.GenericUtilities;
import java.util.Date;
import java.util.Random;

public class JavaUtility 
{
	public static String getRandomData()
	{
		Random random=new Random();
		int ran=random.nextInt(1000);
		return ""+ran;			
	}
	public static String getCurrentSystemDate()
	{
		Date date = new Date();
		String currentDate=date.toString();
		return currentDate.replace(" ", "_").replace(":", "_");
		
	}
}
