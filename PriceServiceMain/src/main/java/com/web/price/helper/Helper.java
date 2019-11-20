package com.web.price.helper;

public class Helper {

	public String changeString(String text, String indicator)
	{
		String change = "";
		System.out.println(text);
		
		if(indicator.equalsIgnoreCase("was"))
		{
			change = text.substring(text.indexOf('$'), text.length());
	        
		}
		else if(indicator.equalsIgnoreCase("special"))
		{
			change = text.substring(text.indexOf('$'), text.length());
		}
		else if(indicator.equalsIgnoreCase("saving"))
		{
			String temp1 = change = text.substring(text.indexOf('S'), text.indexOf(')'));
			String temp2 = change = text.substring(text.indexOf('t'), text.lastIndexOf('/')+4);
			change = temp1 + temp2;
		}
		/*String s2=s1.replaceAll("\\s","");

        System.out.println(s2);

        String was=s2.substring(5, 13);

        String savings = s2.substring(17, 48);

        System.out.println("Was " + was);

        System.out.println("Savings " + savings)*/;
		return change;
	}
	
}
