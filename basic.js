//OBJECT => PROPERTIES(ENTITIES)+METHOD
//CLASS => blueprint for object and started with capital letter with "class" as a keyword
//In Java, functions (also known as methods) are not classes. Functions in Java are defined within classes and are considered members of those classes.
//Constructor => these are the functions use to construct java's object
// class name = constructor name
// no return value and no return type in constructors 
// for one object, constructor can be call once and called at time of creation of object.
// three types of constructors : NON-PARAMETERISED CONSTRUCTORS + PARAMETRISED CONSTRUCTORS + COPY CONSTRUCTORS
// NON-PARAMETERISED CONSTRUCTOR=> those constructors or functions that do name have parameters.
// PARAMETERISED CONSTRUCTORS => those includes parameters.
// COPY CONSTRUCTORS => alse present in C++, in Java all the copy constructors are defined by users, use to copy one object and add it to the other object.



class Pen // defined
{
  String color;
  String type; // ballpoint;gel

  public void write() //method => function define under the class 
  {     
    System.out.println("Writing something");
  }

  public void printColor(){
    System.out.println(this.color);    // this => keyword in java use to tell which function cals that particular object
  }
}

class Student{
  String name;
  int age;

  public void printInfo(){
    System.out.println(this.name):
    System.out.println(this.age):
  }

  // NON_PARAMETRISED CONSTRUCTOR
//   Student(){
//     System.out.println("Constructor called");
//   }
// }
  
  //PARAMETRSED CONSTRUCTOR
  // Student(String name, int age){
  //   this.name = name;
  //   this.age = age;
  // }

  //COPY CONSTRUCTOR
  Student(Student s2){
    this.name = s2.name;
    this.age = s2.age;
  }
  
// public class OOPS // main function
// {
//   public static void main(String args[]){
//     Pen pen1 = new Pen(); //object
//     pen1.color = "blue";  // properties of object is used by using dott "."
//     pen1.type = "gel";    // properties of object is used by using dott "."

//     Pen pen2 = new Pen();
//     pen2.color = "black";
//     pen2.type = "ballpoint";

//     pen1.printColor;  //OUTPUT => blue
//     pen2.printColor;  //OUTPUT => black
//   }


  //for copy constructor it is neseccary to define the constructor
  Student(){
    
  }
 }

// public class OOPS {
//   // Student s1 = new Student();  // non-parametrised constructor
//   // s1.name = "aman";      // non-parametrised constructor
//   // s1.age = 24;           // non-parametrised constructor
//   // Student s1 = new Student("aman", 24);   // parametrised constructor
//   // s1.printInfo();

//   Student s1 = new Student();  // copy constructor
//   s1.name = "aman";      // copy constructor
//   s1.age = 24;           // copy constructor

//   Student s2 = new Student(s1);
//   s2.printInfo();
// }




