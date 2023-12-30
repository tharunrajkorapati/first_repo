package com.tharun.www;

import java.io.IOException;
import java.util.Scanner;

//RELATIONSHIP BETWEEN OBJECTS
//============================

//it is a possible to create objects for different classes and establish relation between them.
//when the objects  are related , it is possible it access and use members of on object in another object.

//there are three ways to relate object in java
//1. using reference
//2. using inner class concept
//3. using inheritance

//1.relating object using reference
//==================================

/*
class One
{
	int x;
	Two t;
	One(Two t)
	{
		this.t=t;
		x=10;
	}
	void display()
	{
		System.out.println("one's x:"+x);
		t.display();
		System.out.println("two's var:"+t.y);
	}
}
class Two
{
	int y;
	Two(int y)
	{
		this.y=y;
	}
	void display()
	{
		System.out.println("two's y:"+y);
	}
}
class Relate
{
	public static void main(String[] args) 
	{
		Two obj2=new Two(22);
		One obj1=new One(obj2);
		obj1.display();
		
		
	}
}
*/

/*
class One
{
	Two obj2;
	One(Two obj2)
	{
		this.obj2=obj2;
	}
	double cube(double x)
	{
		double result1=x*obj2.square(x);
		return result1;
	}
}
class Two
{
	Three obj3;
	Two(Three obj3)
	{
		this.obj3=obj3;
	}
	double square(double x)
	{
		double result=x*obj3.get(x);
		return result;
	}
	
	
}
class Three
{
	double get(double x)
	{
		return x;
	}
	
}
class Relate
{
	public static void main(String[] args) 
	{
		Three obj3=new Three();
		Two obj2=new Two(obj3);
		One obj1=new One(obj2);
		
		double result1=obj1.cube(5);
		System.out.println("cube:"+result1);
		double result2=obj2.square(6);
		System.out.println("square:"+result2);
	}
}

*/


//INNER CLASS
//===========

//inner class is the class written within another class. Inner class is basically a safety mechanism.since it will hidden from other classes in its outer classes.

//note: to make instance variables not avialable outside the class, we use "private" access specifier before the variable.this is how we provide the security mechanism to variables.
//similarly , in some cases,we want to provide security for entire class. in this case can wee you "private" specifier before the class?
//the problem is, if we use "private " specifier before the class , the class is not available to java compailer or JVM. so it is illigal to use"private " before a class name in java.

// but, private specifier is allowed before an inner class and thus it is useful to provide security for the entire inner class.once private is used before the inner class it is not available to other classes.
//this means an object to inner class cannot be created in any other class.

// then how to use the inner class ?
// we can create a oblect to inner class in outer class this purpose, a method contact() can be written ouer class where the inner class object created.
//any programmer should intract with inner class by calling the contact() method.
//some authentication procedure to verify the user can be implemented in contact() method.
//when the user calls this method, he is verified, and if he is a legitimate user , then only the inner class object is created.


//calculating the intrest and add to bank balance and display the balnce

/*
class BankAcc
{
	private double bal;
	BankAcc(double b)
	{
		bal=b;
	}
	void contact(double r)throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the password:");
		String pass=sc.next();
		if(pass.equals("TharunRaj"))
		{
			Interest i=new Interest(r);
			i.calculation();
		}
		else
		{
			System.out.println("incorect password or user not found");
		}
		
		
	}
	private class Interest
	{
		private double rate;
		Interest(double r)
		{
			rate=r;
		}
		void calculation()
		{
			double interest=bal*rate/100;
			bal+=interest;
			System.out.println("balace :"+bal);
		}
		
	}
	
}
class Relate
{
	public static void main(String[] args)throws IOException
	{
		BankAcc a=new BankAcc(10000);
		a.contact(9.5);
	}
}

*/

// lets summarize the inner class concept
//1.inner class is class that defined inside the another class
//2.inner class is a safety mechanism
//3.inner class is hidden from other classes in its outer classes
//4.an object of inner class can not be created in other classes
//5.an object of inner class can be created only in its outer class
//6.inner class can access the members of outer class directly
//7.inner class object and outer class object are created in seperate memory location.
//8.inner class object contains an additional invisible field "this$0" that refers to its outer class object.
//9.when same names are used, we can refer to outer class members in inner class , as
     //outerclassname.this.member;
   //and inner class members in inner class ,as
     //this.member;
//10. inner class decreases readability of the program.



//ANONYMOUS INNER CLASS
//======================

//it is a inner class without a name and for which only a single object is created.


//INHERITANCE
//============

// deriving a new classes from existing classes such that new class acquire all the features of existing classes is calles inheritance.
// it can be implement by using the "extract" keyword

//SUPER KEYWORD
//=============
//if we create object to super class , we can access only the super class members,but not the sub class members
// but if we create sub class Object , all the members of both super and sub classes available to it.
//this is the reason we always create object to sub class in inheritance;
//suppose some times, super class members and sub class members may have name names . 
//in that case by default only sub class members are accessible.

// super.variable
//super.method()
//super(values) ---- constructor--- we need not call the default constractor of the super class, as it is by default available to sub class.
// to call the parameterized constractor use  above .


//Protected specifier
//===================
 // when ever we declare a variable as protected it will available to parent and child class only.


