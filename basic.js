class Pen // defined
{
  String color;
  String type; // ballpoint;gel

  public void write() //method => function define under the class 
  {     
    System.out.print("Writing");
  }
}

public class OOPS // main function
{
  public static void main(String args[]){
    Pen pen1 = new Pen(); //object
    pen1.color = "blue";  // properties of object is used by using dott "."
    pen1.type = "gel";    // properties of object is used by using dott "."

    pen1.write();
  }
}
