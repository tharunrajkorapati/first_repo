package com.tharun.www;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;

/*
public class Test {

	public static void main(String[] args)
	{
		int[] arr1={3,5,1,9,7};
		int[] arr2={2,6,8,4,10};
	    int[] temp=new int[arr1.length];
	    
	    for(int i=0;i<arr1.length;i++)
	    {
	    	temp[i]=arr1[i]+arr2[i];
	    }
	    for(int i=0;i<temp.length;i++)
	    {
	    	System.out.print(temp[i]+" ");
	    }

	}

}
*/

/*
public class Test 
{

	public static void main(String[] args)
	{
		int[] arr1={3,5,10,9,17};
		int[] arr2={2,6,8,4,5};
		int[] temp=new int[arr1.length];
		int sum=0;
		for(int i=0;i<arr1.length;i++)
		{
		    temp[i]=arr1[i]%arr2[i];
		}
		for(int i=0;i<temp.length;i++)
		{
			sum=sum+temp[i];
		}
		System.out.println(sum);
	}
}

*/
/*
class tooYoungException extends RuntimeException
{
	tooYoungException(String s)
	{
		super(s);
	}
}
class tooOldException extends RuntimeException
{
	tooOldException(String s)
	{
		super(s);
	}
}
class Test
{
	public static void main(String[] args)
	{
		int i =Integer.parseInt(args[0]);
		if(i<20)
		{
			throw new tooYoungException("your are too young so your are not aligible to get marrie wait for some time ");
		}
		if(i>30)
		{
			throw new tooOldException("your are too late for getting marriage you will not get lifepartern");
			
		}
		else
		{
			System.out.println("congrats you are aligible to marrie");
		}
	}
}
*/


class Test
{
	public static void main(String[] args)throws Exception
	{
		String s="ABBCCCDDDD";
		char[] carr=s.toCharArray();
		
		for(char i:carr)
		{
			int count=0;
			if(i==carr[i])
			{
				count++;
			}
			System.out.println(carr[i]+" "+count);
		}
	}
	
}