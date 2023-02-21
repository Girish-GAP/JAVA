/*

 14-04-2022

- Java is comes in 1995
- Son microsystem company make a product which stable in 1989
- First time its comes in 1991
- People started using it by 1995

- "We are the pure objected orinted langauge"


* IN JAVA  IF THE FIRST LETTER IS CAPITAL THEN IT'S A CLASS Wrapper Class

- Virtual environment : JAVA, Python , C#
- JVM(JAVA VIRTUAL MACHINE) : virtual environment
- C# : Common language runtime (CLR)
- Python : Python virtual machine (PVM)


Fish required virtual enviroment if we want them in tank
Just like
Programe(fish) needs virtual environment to run
(virtual environment : Storage device, OS etc..)


Demo.java -> Understandable for JVM

Editor        -> Compiler (java to JVM understandable(Byte code))   -> JVM
Demo.java             Demo.class                                        Run(Demo)



- class not found / Could not found a symbol main

- Write once run anywhere(WORA)
- Platform independant and architecture 


- In java everthing is considerd as Class


*/



/*
 15-04-2022

 * Charecter Size:
 - java support Unicode so charecter size if 2 bytes
 - To store and display multiple language we have the size of charecter 2 bytes (Android also support unicode)
 - In one byte 2^8 = 256  letter can store (all assci or keyboard letter only) thats why they switch to unicode

 
 * Byte :
  - New datatype in Java (Size 1 bytes)

  - Intiger No = 11;     // Intiger class No is a boject    // Its also valid

 // Everyhing is considerd as a class that we use in our program is obj.

// Pacakge is a collection of related classes 
// Study Kapat (Packet) : Study related material (Classes)
// Cloth Kapat (Packet) : Cloth related (Classes)


Access Modifier : Public / Private / Protected / Default

Inheretance : Single level / Multilevel / Multiple

Polymorphisam : Compile time (Not in java) / Run time 
Run time : Function overloading (same name multiple function with different paremert)

Operator overloding (Not in java)

virtual (not in java)



OS - > Job guy (50,000/-)   
JVM - > Mother (25,000/-)   

Example : 
4 GB RAM
- Laptop is turnon
- OS in RAM
- When java first program is run then
- OS Run JVM (JVM takes some memory form OS as temporary (its have to return))
- JVM gives 2 gb - all programs have to be run in this 2 gb
- when .class files comes in memory its give 5kb if extra required then it will give after using we have to return it (it return by garbage collector)

- JVM have to manage this memory (give and take back)


suppose we create a class different than main unless we create object of outiside class JVM not allocate the memory for it

sizeof Operator is not there

0x.. : # code

the garbage collector only scans the memory which is the part of heap (just like water in hotel)



Garbage : its perspective : its unwanted address in our program
(just like in hotel eat empty dishes of other)


-----------------------------------------------------------------

- Non-static method can access static and non static data
- static method can access only static data


- STATIC BLOCK

- if we want to execute  before main it can be done by static block but its not good practice.

- Whenever file is load first static block is called

- It is used to intilize static data

- It runs without creating object




*/


/*
16-04-2022

- INHERETANCE 

- :: replace with exten keyword
- There is only architecture dependant inheretance
- There is no multiple inheretance to avoid ambiguti  


super key word to access the parent data.


every class in java have a parent class which is object class

when we use super keyword in Base class we can access the object class data


 

*/


/*

- Constant method is such method whose contents of caller object is not changed.
- Overriding is the redefination in cpp

- Final
- Final characteristic    (same as constant characteristic)
- Final Behaviour         (NOT same as constant method) if the method of class is final then we cant override that function
- Final Class             (NOT inheritable)

- Final chatecteristic intilization 2 ways : at time of declaration , by constructor


- Function with body is a CONCRETE
- Function without body is a ABSTRACT


HIDING IMPLEMENTATION DETAILS - hide function body

Abstraction is nothing but hiding implementation details.

Debit / Credit 




*/


/*


21-04-2022

// Abstract class 

- We have to abstract key word before class name and method name.
- we cant create the object of abstract class.


// Interface

- Interface is kayword in java just like class.
- Interface contans 100% abstract method in it
- Interface provide 100% abstraction.
- We cant create the object of interface class
- We can keep characteristics
- We cant write constructor (constructor is class related and interface not related to class)
- Class Demo implements Hello  (Implement for interface)
- Book can extend and blank notebook(new) can implement.
- Book is already concrete 
- class Demo 
{
  addition ()
  substraction()
  multiplication()
  Division()
}

- Demo can be inherete but all methods are concrete

- abstract Class Demo (class is abstract because it contans abstract method)
{
  abstract Addition()
  substraction()
}

class Hello implement Demo
- abstract class Demo is half concrete and half implementable 


- interfacce Class Demo
{
  Addition()
}

- its our responsibility to give defination to all interface class (we have to implement it)



// One class can extend another class
// One class can implement another interface
// One Interface can extend another interface
// One class can implement more than one interface but one class can't extend more than one interface
// one class can extend another class as well as implement interface
// One interface can't implement another interface



/*
22-04-2022

create pacakge : pacakge pcakage_name
import package : import pacakge_name 

. for current directry 
.. for parent directry


// EXCEPTION HANDELING : 
// If we not handel exception then program will abnormally.

// Try and Catch=



Memory and resource are different 
every resource required memory
but inside memory there will be no resource
resource deallocate is last priority of garbage collector
because main preferenace of garbage collector is for unused memory 

// it is good practice to deallocate the resource 





*/


/*


29-04-2022
-----------

not serial do parallel : 

Multi Tasking : 
1) Multi Processing
2) Multi Threading 

- os loves to create thread as compare to process

- Parallel is always prefer because our hardware is capable of doing it


- In java we can do multithreading by two ways
1) Thread class (We have to inherete class)
2) runnable Interface (We have to implement Interface)


- Call back function : 
- main function is a call back function because its called by outside entity









