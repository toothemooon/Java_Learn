public class Main {

  static int myMethod(int x, int y) {
    return x + y;
  }

  int x = 5;

  // constructor
//  public  Main(int y) {
//    x = y;
//  }

  // public method
  public void myMethod() {
    System.out.println("Accessed by objects");
  }

  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  static void myMethod(double x, double y) {
    System.out.println(x + y);
  }
  public static void main(String[] args) {
    // print strings
    System.out.println("Hello, World!~~~");
    System.out.println("I am learning Java again~~~.");
    System.out.println("This is just awesome!");

    // print numbers
    System.out.println(3);
    System.out.println(300);
    System.out.println(3 + 300);

    // comment
    // System.out.println("This is just a comment.");

    // String int float char boolean; type variableName = value
    String name = "John";
    int num_0 = 3;
    char a = '1';
    a = '$';
    System.out.println(a);
    // escape character
    String text = "We now konw the usecase of a \" special \" char";
    System.out.println(text);

    boolean isTrue = true;

    System.out.println(name + num_0);

    // type casting byte short char int long float double
    double num_1 = 9.3;
    int digit = (int) num_1;

    System.out.println(digit);

    // operators + - * / %  or by comparison

    // conditional statements, switch statements
    if (20 > 18) {
      System.out.println("this is always true.");
    }

    int time = 20;
    String result = (time > 18) ? "This is kinda late" : "Not to late.";
    System.out.println(result);

    // loops

    int i = 0;
    while (i < 5) {
      if (i == 4) {
        break;  // when i == 4 loop terminated
      }
      System.out.println(i);
      i++;
    }

    for (int j = 0; j < 3; j++) {
      System.out.println("for loop");
    }

    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String k : cars) {  // loop each element of an array
      if (k == "Ford") {
        continue; // "Ford skipped but loop continue
      }
      System.out.println(k);
    }

    System.out.println();

    for (int i_1 = 0; i_1 < cars.length; i_1++) {
      System.out.println(cars[i_1]);
    }

   // methods
    System.out.println(myMethod(1, 2));

    myMethod(1.0, 5.0);

    // objects
    Main myObj = new Main();
    myObj.x = 20;
    System.out.println(myObj.x);

    myObj.myMethod();



  }
}