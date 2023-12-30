package com.tharun.www;

// ABSTRACT CLASSES AND ABSTRACT METHODS
//=======================================

// a abstract method does not contains any body.it contains only method header. so we can say it is a incomplete method
// a abstract class is a class that generally contains some abstract methods .
// both abstract class and methods should be declared by using the word "abstract".

/* abstract class contains incomplete methods , it is not possible to estimate the total memory required to create the oblect.
   so,JVM cannot create a object to abstrct class . we should create sub classes and all the abstract methods should be implemented(body should be writen in sub classes).
   it is possible to create object to the sub classes snice there are complete classes.
 */


/*
abstract class Demo
{
	abstract void cal(double x);
}
class Sub1 extends Demo
{
	void cal(double x)
	{
		
		System.out.println("square:"+x*x);
	}
}
class Sub2 extends Demo
{
	void cal(double x)
	{
		System.out.println("cube:"+x*x*x);
	}
}
class Abstract 
{
	public static void main(String[] args) {
		Sub1 obj1=new Sub1();
		Sub2 obj2=new Sub2();
		obj1.cal(10);
		obj2.cal(10);
	}
}
*/



/*
//SUMMARY
 //==========
 
 * A ABSTRCT class is a class that contain 0 or more abstrct methods .

*An abstract class can contain instance variables and concrete methods in addition to abstract methods.

Abstract class and the abstract methods should be declared by using the key word 'abstract All the abstract methods of the abstract class should be implemented (body) in its sub classes.

If any abstract method is not implemented, then that sub class should be declared as 'abstract In this case, we cannot create an object to the sub class. We should create another sub class to this sub class and implement the remaining abstract method there.

We cannot create an object to abstract class

But, we can create a reference of abstract class type

The reference of abstract class can be used to refer to objects of its subclasses

The reference of abstract class can not refer to individual methods of its subclasses

It is possible to derive an abstract class as a sub class from a concrete super class.

We cannot declare a class as both abstract and final. For example, abstract final class A // invalid
because, the key word abstrct reprents an incomplete class which depends on the sub classes for its implementation. creating sub classes is compulsory for abstract calss .
final key word prevents inheritance. this means we cannot create sub class to a final class. so, the key words "abstract" and "final" are contradictory and hence both cannot be use simultaneously for a class.

*/
