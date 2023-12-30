package com.tharun.www;

import java.net.SecureCacheResponse;
import java.util.Scanner;

// read the numbers 12345  54321
/*
public class Numeric {

	public static void main(String[] args)
	{
		int n=12345;
		int digit=0;
		int res=0;
		
		while(n>0)
		{
			digit=n%10;
			n=n/10;
			System.out.print(digit);
			
		}
          
		
	}

}
*/


//Q. sum of the digits of the given number 
// 123 = 6;

/*
class Numeric
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int tem=n;
		int sum=0;
		while(n>0)
		{
			int i=n%10;
			n=n/10;
			sum+=i;
		}
		System.out.println("the sum of the digits of "+tem+"  is  "+sum);
	}
}
*/


// find the power 2^45 =34359738368

/*
class Numeric
{
	public static void main(String[] args) 
	{
		int n=2;
		long res=1;
		for(int i=1;i<=35;i++)
		{
			res=res*n;
			
		}
		System.out.println(res);
	}
}
*/


//find the bigest number and smallest number form a given 5 numbers

/*
class Numeric
{
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of numbers you want");
		int n=sc.nextInt();
		int big=0,small=0,avg=0,sum=0;
		for(int i=1;i<=n;i++)
		{
			System.out.println("enter the "+i+" numbers");
			int j=sc.nextInt();
			if(i==1)//intially set the first number is the small number
				small=n;
			if (j>big)
				big=j;
			if(j<small)
				small=j;
			sum=sum+j;
					
			
		}
		System.out.println("big:"+big+" small:"+small+" sum:"+sum +" avg: "+sum/n);
		
    	
	}
}

*/



// reverse the number  123 321 or palindrome 

/*
class Numeric
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int sum=0,digit=0;
		while(n>0)
		{
			digit=n%10;
			sum=(sum*10)+digit;
			n=n/10;
			
		}
		System.out.println(sum);
		
		
	}
}
*/


// amstrong number or not

/*
class Numeric
{
	public static void main(String[] args)
	{
		int i=153;
		int temp=i;
		int sum=0;
		while(i>0)
		{
			int digit=i%10;
			sum=sum+digit*digit*digit;
			i=i/10;
		}
		System.out.println(sum);
		if(sum==temp)
			System.out.println("it is a amstrong");
		else
			System.out.println("it is not a amstrong");
	}
}

*/


// febinoci series

/*
class Numeric
{
	public static void main(String[] args) {
		
		int a=0,b=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(a+""+b);
		for(int i=1;i<=n;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c);
		}
		System.out.println(" \n "+"nth febinoic series is :"+b);
	}
}

*/


// swap two numbers

/*
class Numeric
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("before swap :"+a+" "+b);
		//int temp=0;
		//temp=a;
		//a=b;
		//b=temp;
		//System.out.println("after swap:"+a+" "+b);
		
		// we can use below  logic also ,when question is ask without using third veriable. 
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap:"+a+" "+b);
		
		
	}
}

*/


//ASCII value of a character
//note: to take char input using Scanner class the syntax is: char c=sc.next().charAt(0);

/*
class Numeric
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		char c=sc.next().charAt(0);
		int a=(int)c;//whether you write type casting or not it will convert.
		System.out.println("ASCII value of "+c+" is "+a);
	}
}
*/

//multiplication table

/*
class Numeric
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("what table you want:");
		int n=sc.nextInt();
		for(int i=1;i<=20;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
		
	}
}
*/

//prime no's between two numbers

/*
class Numeric
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the numbers :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		for (int i=a;i<=b;i++)
		{
			int count=0;
			for(int j=1;j<=b;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}
}

*/

// given number is prime or not

/*
class Numeric
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
		
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("it is prime no:");
			
		}
		else
			System.out.println("it is not a prime no");
		
	}
}

*/


// we can write prime numbers in another logic , above logics says prime numbers means , a number which is divided by one and itself . that is the count is 2.
// the another logic is , boolean is true enter into the loop , in the loop the condition is divide a number with 2 to number-1 , that means boolean is false for prime numbers.






// factorial of a given number

/*
class Numeric
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			 fact=fact*i;
			 
		}
		System.out.println(fact);
		
				
		
		
	}
}

*/