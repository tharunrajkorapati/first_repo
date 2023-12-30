package com.tharun.www;
/*
 * CHAPTER19
 * 
the last chapter, we learned that an abstract class is a class which contains some abstract methods as well as concrete methods also 
Imagine there is a class that contains only abstract methods and there are no concrete methods. It becomes an interface.
This means an interface contains methods which are all abstract and hence none of the methods will have body. Only method prototypes will be written in the interface.
First line of method definition that contains the access specifier, return type, method name and a list of parameters is called method prototype.
*/
// WHAT IS INTERFACE?
//A) an interface is a specification of method prototypes . all the methods of the interface are PUBLIC and ABSTRACT.

//DIFFERENCE BETWEEN CLASS AND INTERFACE
//=======================================
/*You have some rupees in your hands. You can spend in rupees only by going to a shop where billing is done in rupees. 
 * Suppose you have gone to a shop where only dollars are accepted, you can not use your rupees there.
 *  This money is like a 'class' A class satisfies the only requirement intended for it. It is not useful to handle a different situation
 */

/*Suppose, you have a credit card. Now, you can pay by using your credit card in rupees in a shop. 
 * If you go to another shop where they expect you to pay in dollars, you can pay in dollars. The same credit card can be used to pay in pounds also.
 *  Here, the credit card is like an interface which performs several tasks
 */


//creating object using newInstance() method
//===========================================

/* step1: first, store the class name "Employee" as a string into an object . for these purpuse fectory method forName() of the class "Class" will be useful
     Class c = Class,forName("Employee");
   note: we should note that there is class with the name "Class" in java.lang package.

   step2: next, create another object to the class whose name is in the object c. for these purpose , we need newInstance() method of the class "Class" . 
        Employee odj = (Employee)c.newInstance();
        or
        MyInterface mi=(MyInterface)c.newInstance();
*/
// write a code , to use this we can connect to any data base by implementing the database we want

/*
interface MyInter
{
	//every method in interface are by defalute public and abstract.
	//so we need not declare them explicitly as public abstrct.
	void connect();
	public abstract void disconnect();
}
class OracleDB implements MyInter
{
	public void connect()
	{
		
		System.out.println("connected to oracleDB");
	}
	public void disconnect()
	{
		System.out.println("disconnect to oracle DB");
	}
}
class SybaseDB implements MyInter
{
	public void connect()
	{
		
		System.out.println("connected to sybaseDB");
	}
	public void disconnect()
	{
		System.out.println("disconnect to sybaseDB");
	}
}
class Interface
{
	public static void main(String[] args) throws Exception 
	{
		// accept the implementation classname from command line argument 
		//and store it in the Object c.
		Class c = Class.forName(args[0]);//"com.tharun.www.OracleDB"
		//create an object to the class whose name is in c by using newInstance method.
		//let the reference variable of interface  pointed to it.
		MyInter mi = (MyInter)c.newInstance();
		mi.connect();
		mi.disconnect();
	}
}*/



//SUMMERY
//=======
/*Now let us summarize the following points on interfaces, before we proceed further 
 * An interface is a specification of method prototypes This means, only method names are
written in the interface without method bodies

An interface will have 0 or more abstract methods which are all public and abstract by default An interface can have variables which are public static and final by default. This means all the variables of the interface are constants None

of the methods in Interface can be private, protected or static. We cannot create an object to an interface, but we can create a reference of interface type

All the methods of interface should be implemented in its implementation classes If any method is not implemented, then that implementation class should be declared as 'abstract Interface reference can refer to the objects of its implementation classes.

When an interface is written. any third party vendor can provide implementation classes to it

*An interface can extend another interface

*An interface cannot implement another interface 

It is possible to write a class within an interface

Interface forces the implementation classes to implement all of its methods compulsory Java compiler checks whether all the methods are implemented in the implementation classes or not

A class can implement (not extend) multiple interfaces For example, we can write
*/

//NOTE
//=====

//Q) can we implement one interface form another?
//a) no , we can not ," implementing an interface means writing body for the methods". this can not be done again in an interface.
//   since none of the methods of the interface can have body.
//Q) can we write class within an interface?
// A) yes, it is possible to write a class within an interface.


// MULTIPLE INHERITANCE USING INTERFACES.
//======================================

//    class MyClass implements A,B;

// now, there is no confusion to refer to any of the members of the interfaces from MyClass . for example
//  to refers to interface A's X we can write   ---->  A.X
//  similarlly to refers to interface B's X we can write   ---->  B.X

/* similarly , there will not be any confusion regarding wich methods is available to the implementation class . 
 * since both the methods in the interfaces do not have body , and the body is provided in the implementation class i.e MYClass.
 */
/*   
interface Father
{
	float HT=6.2f;
	void height();
}
interface Mother 
{
	float HT=5.8f;
	void height();
}
class MyClass implements Father,Mother
{
	public void height()
	{
	float ht=(Father.HT+Mother.HT)/2;
	System.out.println("child's height:"+ht);
	}
}
class Interface
{
	public static void main(String[] args) {
		MyClass c=new MyClass();
		c.height();
	}
}
*/