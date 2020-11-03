import java.util.Scanner;


public class compare{
  public static void main(String[] args){
    boolean check = true;
    while(check){
    try{
      Scanner in = new Scanner(System.in);
      System.out.print("First number: ");
      int a = in.nextInt();
      System.out.print("Second number: ");
      int b = in.nextInt();
      if(a > b){
        System.out.println("The first number is greater");
        check = false;
      }
      else if(a == b){
        System.out.println("Your numbers are equal");
        check = false;
      }
      else{
        System.out.println("The second number is greater");
        check = false;
      }
    }
    catch(Exception e){
      System.out.println("Enter a valid number!");
    }
  }
  }
}
