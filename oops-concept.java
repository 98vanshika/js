// FOUR CONCEPTS OF OOPS IN JAVA
// ABSTRACTION + ENCAPSULATION + INHERITENCE + POLYMORPHISM
// in C++ there are both constructor and destructor
// in java there is only constructors and desconsturctors are present by default
// in java there is an automatic garbage collector is present 
// the garbage collector (GC) is an automatic memory management system that reclaims memory occupied by objects that are no longer in use by the program.
// detect wether that object is use by the code and if not then delete it in very smooth way.



// POLYMORPHISM => POLY (MANY) + MORPHISM (FORMS)
// WHEN WE CAN DONE ONE WORK IN MANY DIFFERENT FORMS IN JAVA THEN IT IS KNOWN AS POLYMORPHISM
// THERE ARE TWO TYPES OF POLYMORPHISM => FUNCTION OVERLOADING + FUNCTION OVERRIDING
// FUNTION OVERLOADING => COMPILE-TIME POLYMORPHISM (can find eror at compiler time)
// FUNCTION OVERRIDING => RUN-TIME POLYMORPHISM (can find any error at run time)

// COMPILE-TIME / FUNCTION OVERLOADING => CREATION OF DIFFERNT FUNCTIONS BUT HAVE SAME NAMES
// detects problem at the time of compiler running

// public void printInfo(String name){
//       System.out.println(name);
//   }
//    public void printInfo(int age){
//       System.out.println(age);
//   }
//     public void printInfo(String name, int age){
//       System.out.println(name + " "+ age);
//   }
// public class OOPS{
//   public static void main(String args[]){
//     Student s1 = new Student();
//     s1.name = "aman";
//     s1.age = 24;

//     s1.printInfo(s1.name);
//     s1.printInfo(s1.age);
//     s1.printInfo(s1.name, s1.age);
//   }
// }



// INHERITANCE => when the properties of one class is inherited by properties of another class
// extends keyword use for inheritance
// increases the reusabilty of the code, one code can be implemented to other sub classes
// the class that inherit the properties are known as child class
// the class from where the properties are inherited are known as base class or parent class
// in java there are 4 types of inheritance
// single level inheritance + multi level inheritance + heirarchial inheritance + hybrid inheritance
// in C++ there are 5 types of inheritance (multiple inheritance)

// class Shape{
//   String color;
// }

// class Triangle extends Shape{
  
// }

// public class OOPS{
//   public static void main (String args[]){
//     Triangle t1 = new Triangle();
//     t1.color ="red";
    
//   }
// }



// SINGLE INHERITANCE
// class Shape{
//   public void area(){
//     System.out.println("displays area");
//   }
// }
// class Trinagle extends Shape{
//   public void area (int l, int h){
//     System.out.println(1/2*l*h);
//   }
// }

//MULTI LEVEL INHERITANCE
// class Shape{
//   public void area(){
//     System.out.println("displays area");
//   }
// }
// class Trinagle extends Shape{
//   public void area (int l, int h){
//     System.out.println(1/2*l*h);
//   }
// }
// class EquilateralTriangle extends Triangle{
//   public void area(int l, int h ){
//     System.out.println(1/2*l*h);
//   }
// }

// HEIRARCHIAL INHERITANCE (multiple derived class from single base class)
// class Shape{
//   public void area(){
//     System.out.println("displays area");
//   }
// }
// class Trinagle extends Shape{
//   public void area (int l, int h){
//     System.out.println(1/2*l*h);
//   }
// }
// class EquilateralTriangle extends Shape{
//   public void area(int l, int h ){
//     System.out.println(1/2*l*h);
//   }
// }
// class Cirle extends Shape {
//   public void area(int lr){
//     System.out.println((3.14)*r*r);
//   }
// }


// HYBRID INHERITANCE
// class Shape{
//   public void area(){
//     System.out.println("displays area");
//   }
// }
// class Trinagle extends Shape{
//   public void area (int l, int h){
//     System.out.println(1/2*l*h);
//   }
// }
// class EquilateralTriangle extends Triangle{
//   public void area(int l, int h ){
//     System.out.println(1/2*l*h);
//   }
// }
// class Cirle extends Shape {
//   public void area(int lr){
//     System.out.println((3.14)*r*r);
//   }
// }

// public class OOPS {
//   public static void main(String args[]){
    
//   }
// }


// ENCAPSULATION =>  involves packages and access modifiers => practice of bundling the data (variables) and the methods (functions) that operate on the data into a single unit called a class, and restricting direct access to some of the object's components.
// PACKAGES => a package is a namespace that organizes a set of related classes and interfaces. Packages are used to group related classes together, which helps to manage and structure the codebase, making it more modular, readable, and maintainable.
// encapsulation helps in data hiding bu using access modifiers
// import util.*;
// import bank;

// package bank;
// class Account {
//   public String name;
// }

// public class Bank{
   
//  }
// public class OOPS{
//   public static void main(String args[]){
//     bank.Account account1 = new bank.Account();
//     account1.name = "customer1";
//   }
// }


// ACCESS MODIFIERS => to ocntrol who can access
// in java 4 types => public, private,protected, default
// in c++ 3 types

// public => can be acces by any member of the class or by different packages => Used to provide wide access to the member across different classes and packages.
// default => The member is accessible only within the same package. This is also called package-private access. => Usage: Used when you want to allow access within the same package but not from outside.
// private => The member is accessible only within the class it is declared (not allowed access by the sub-classes). => Used to hide the implementation details and to protect the data from being accessed directly from outside the class.
// protected => The member is accessible within the same package and by subclasses in other packages. => Used to allow access to the member by subclasses, which is useful for inheritance and code reuse.

// ABSTRACTION => showing important details or data while hiding the unimportant data.
// can be implmented in java in two forms => using keyword abstract  or by using interfacesv (implements)

// abstract class Animal{
//   abstarct void walk();
//   Animal(){
//     System.out.println("You are creating a new animal");
//   }
//   public void eat(){
//     System.out.println("Animal eats");
//   }
// }
// class Horse extends Animal{
//   Horse(){
//     System.out.println("Created a new horse");
//   }
//   public void walk(){
//     System.out.println("Walks on 4 legs");
//   }
// }
// class Chicken extends Animal{
//   public void walk(){
//     System.out.println("Walks on 2 legs");
//   }
// }
// public class OOPS{
//   public static void main(String args[]){
//     Horse horse = new Horse();
//     horse.walk();
//     Animal animal = new Animal();
//     animal.walk();   // cannot be initiate
//     horse.eat();
//   }
// }


// INTERFACES => HIDE ALL UNIMPORTANT DATA AND SHOW IMPORTANT DATA
// interface Animal {
//   public void walk;
// }
// class Horse implements Animal{
//   void walk(){
//     System.out.println("Walks in 4 legs");
//   }
// }
// publc class OOPS{
//   public static void main(String args[]){
//   Horse horse = new Horse();
//     horse.walk();
// }
// }


// STATIC IS A KEYWORD => The static keyword in Java is used to indicate that a member (variable, method, block, or nested class) belongs to the class itself, rather than to instances of the class. This means that static members are shared among all instances of the class and can be accessed without creating an instance of the class.
// use where we want to make the value of the data same
  
// class Student {
//   String name;
//   static String school;
// }
// public class OOPS {
//   public class void main(String args[]){
//   student.school = "JMV";
//   student student1 = new Student();
//   student1.name = "Tony";
//   System.out.println(student.school);
//   }
// }






















