package com.tharun.www;

import java.text.NumberFormat;

/*
class Demo
{
	public int a=10;
	public int b=10;
	
	void sum()
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public double sqr(double n)
	{
		return n*n;
		
	}
}
public class Method {

	public static void main(String[] args)
	{
		Demo d=new Demo();
		d.sum();
		double z=d.sqr(25.5);
		System.out.println(z);

	}

}
*/




//method without parameter without return type

/*
class Demo
{
	int a1;
	int a2;
	Demo(int a,int b)
	{
		a1=a;
		a2=b;
		
	}
	void sum()
	{
		int sum=a1+a2;
		System.out.println(sum);
	}
}
class Method
{
	public static void main(String[] args) 
	{
		Demo d=new Demo(1,1);
		d.sum();
		
	}
}

*/


//with parameters with return types

/*class Demo
{
	double sum(double a,double b)
	{
	    double sum=a+b;
	    return sum;
	}
}
class Method
{
	public static void main(String[] args)
	{
		Demo d=new Demo();
		double x=d.sum(10.0,20.0);
		System.out.println(x);
	}
}
*/
		//OBJECT AS A RETURN TYPE
       //========================

//class College
//{
//	int rno;
//	String name;
//}
//class Demo
//{
//	College getData()
//	{
//		College c=new College();
//		c.rno=25;
//		c.name="tharun";
//		return c;
//	}
//	public static void main(String[] args) {
//		Demo d=new Demo();
//		College c1 = d.getData();
//		System.out.println(c1.rno+"--"+c1.name);
//		
//	}
//}


// static method 
// static methods are the methods which does not act upon the instance variables of the class .
//so , to call the static methods , we need not to create a object .
// we call static method as
//         ClassName.methodName();



//static methods accepts the data and return the result

/*
class Demo
{
     static int sum(int a,int b)
     {
    	 int sum=a+b;
    	 return sum;
     }
}
class Method
{
   public static void main(String[] args) {
	
	   int i=Demo.sum(1,3);
	   System.out.println(i);
	   //System.out.println(Demo.sum(1, 3));
}


}

*/




// note: we are trying to read the instance variables of a class in a static method . this gives an error at compaile time.

/*class Demo
{
   public int a=1;
   public int b=2;
   static void sum()
   {
	   int sum=a+b;
	   System.out.println(sum);
   }
   
}
class Method
{
     public static void main(String[] args) {
		Demo.sum();
	}	
}

*/

/*Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Cannot make a static reference to the non-static field a
	Cannot make a static reference to the non-static field b
*/




// note: static methods  can access static static variable 
// static variable are also declared as static 

/*
class Demo
{
   static int a1;
   static int b2;
   Demo(int a,int b)
   {
	   //this.a=a;
	   //this.b=b;
	   a1=a;
	   b2=b;
	   
   }
   static void sum()
   {
	   int sum=a1+b2; //a+b
	   System.out.println(sum);
   }
   
}
class Method
{
     public static void main(String[] args) 
     {
    	Demo d= new Demo(1,2);
    	
		Demo.sum();
	}	
}

*/


//STATIC BLOCK
/*static
{
}
*/
//JVM executes the static block on a HIGHEST PRIORITY BASIS ,
//this means JVM first goes to static block even before it looks for the main method in the program
//if a static block is present, then JVM executes it first of all, after that, it searches for the main method
//if main() method is not found , it will display an error.


// till java 6 version we can write the program without main() method by using the static block
// but after 7 version it is not possible if you donot write main() method JVM will give the eror




//LOCAL VARIABLES

//A local variable is a variable that is declered locally inside a method or constructors and is vaialble only within the methods and consstructors.
/*

class Demo
{
   static int a1;//a
   static int b2;//b
   Demo(int a,int b)
   {
	   //this.a=a;
	   //this.b=b;
	   a1=a;
	   b2=b;
	 System.out.println(a);  
   }
   static void sum()
   {
	   int sum=a1+b2; //a+b
	   System.out.println(sum);
	   System.out.println(a);// exception will came 
   }
   
}
class Method
{
     public static void main(String[] args) 
     {
    	Demo d= new Demo(1,2);
    	
		Demo.sum();
	}	
}

*/


// sometimes a local variable has the same name as that of an instance variable . but when we call the variable by defualt is local variable only.
// now the question is how to refer to the instance variable . for this purpose , we should use the "THIS" keyword.
/*
void m1(int x)
{
    x=x;  // both the x refer only the local variable
}
*/



//THIS Keyword

/*
class Demo
{
   static int a;
   static int b;
   Demo(int a,int b)
   {
	   this.a=a;
	   this.b=b;
	   
	   
   }
   static void sum()
   {
	   int sum=a+b;
	   System.out.println(sum);
   }
   
}
class Method
{
     public static void main(String[] args) 
     {
    	Demo d= new Demo(1,2);
    	
		Demo.sum();
	}	
}

*/

// this keyword is used for the instance variables , methods , constructors 

/*
class Demo
{
	private int i;
	Demo()
	{
		this(1);
		this.m1();
	}
	Demo(int i)
	{
		this.i=i;
	}
	void m1()
	{
		System.out.println(i+i);
	}
}
class Method
{
 public static void main(String[] args) {
	
	 Demo d= new Demo();
	 
}	
}

*/





// INSTANCE METHODS 

// instance methods are the methods which can acts upon instance variables. to call the instance methods object is need, since the instance variable are contained in the object .
// we can call the instance methods by using >> objectName.methodName();
// the speciality of the instance variable is that they can access not only instance variables but also static variables directly.
//there are two types of instance methods
// 1.accessor methods
// 2.mutator methods

// accessor methods are the methods that simply access or read the instance variables.they do not modify the instance variable .
// mutator methods not only access the instance variable but also modify them.

//suppose , we take person class with name and age as instance variables . to store the data into these instance variables, we can use the setName() and setAge() methods . these methods are called mutator methods.
//similarly to read and return the instance variables , we can write methods like getName() and getAge() . these methods are called accessor methods.

/*
class Demo
{
	private String name;
	private int age;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
		
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}
class Method
{
	public static void main(String[] args) {
		Demo d=new Demo();
		d.setName("tharun");
		d.setAge(22);
		System.out.println("name:"+d.getName());
		System.out.println("age:"+d.getAge());
		
	}
}

*/


// RECURSION
//===========



// a method calling it self is known as recursive method. and its phenomenon is called RECURSION.

// factorial of a number without recursion

/*
class NoRecursion
{
	public static long factorial(int num)
	{
	    long fact=1;
	   while(num>0)
	   {
		   fact=fact*num--;
		   
	   }
	return fact;
	}
	
}
class Method
{
	public static void main(String[] args)
	{
		System.out.println(NoRecursion.factorial(5));
		
	}
}

*/


// factorial of a number using Recursion

/*
class Recursion
{
	public static long factorial(int num)
	{
		long result;
			if(num==1)
				return 1;
			result=factorial(num-1)*num;
		return result;
	}
}
class Method
{
	public static void main(String[] args)
	{
		System.out.println(Recursion.factorial(6));
		
	}
	
}

*/


// FACTORY METHODS
//=================


/* a factory method is a method that creates and return an object to the class to which it belongs.
   A single factory method replaces several constructors in the class by accepting different options 
  from the user,while creating the object.abstract
 */

// ex. getNumberInstance() is a factory method , because it belong to the NumberFormat class and return an object to NumberFormate class.

//NumberFormat class ---- present in java.text package
//==================

//ex. 123.789532353526
// there are 13 digits ofter the decimal point . for most of the general purpuse , these mani digits are not needed.
// for ex, an electrical bill we need not to display more than 2 digits after the decimal point to indicate paise.

// this number format is achieve by NumberFormat class

//step.1 : create NumberFormat object ,we should use the factory method getNumberInstance();
        //Numberformat obj = NumberFormat.getNumberInstance();
//step 2: decide how many digits . NumberFormat class Methods are
       //setMaximumIntegerDigits();
       //setMinimumIntegerDigits();
       //setMaximumFactionDigits();
       //setMinimumFractionDigits();
// step 3: apply the format() method to final result . this method returns a "String".


//Q) area of a circle . the area is format to have 7 max integer digits and  2 min fraction digits.

/*
class Method
{
	public static void main(String[] args)
	{
		final double PI=(double) 22/7;
		double r=15.5;
		double area = PI*r*r;
		System.out.println("without format:"+area);// without format
		
		NumberFormat obj=NumberFormat.getNumberInstance();
		obj.setMaximumFractionDigits(2);
		obj.setMinimumIntegerDigits(7);
		
		
		
		String s=obj.format(area);
		System.out.println("after the format:"+ s);
		
	}
}

*/



// HOW MANY WAYS CAN YOU CREATE AN OBJECT IN JAVA?

// there are four ways to create object in java 
//1. using "new" operator
//2. using "factory methods"
     //NumberFormat obj=NumberFormat.getNumberInstance();
    // here, we create NumberFormat object using the factory method "getNumberIstance()"
//3.using newInstance() method
//4.cloning an alredy avaliable oblect.


// CONCLUSION
//=============
// in java, we got static methods,Instance methods,factory methods. again insatnce methods are classified into accessor and mutator methods.

