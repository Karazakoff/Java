import java.util.Scanner;
import java.io.*;

public class scan{
  public static void main(String[] args){
    // I way

    Scanner in = new Scanner(System.in);

    System.out.print("Your name: ");

    String name;

    name = in.nextLine();


    // II way

    BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Your surname: ");

    String surname;
    try{
    surname = in2.readLine();
    System.out.println("Hello, " + name + " " + surname);
    }
    catch(Exception e){}
    Scanner in3 = new Scanner(System.in);
    int age;
    System.out.print("Your age: ");
    age = in3.nextInt();
    if(age < 40){
      System.out.println("You are young!");
    }
    else{
      System.out.println("You are old");
    }
  }
}
