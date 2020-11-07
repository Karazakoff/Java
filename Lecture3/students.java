class Student{
  String name;
  int year;
  public Student(String name, int year){
    this.name = name;
    this.year = year;
  }
  public Student(String name){
    this.name = name;
    this.year = 0;
  }
  public Student(){
  this.name = "Default";
  this.year = 0;
}
  public void display(){
    System.out.println("Name is " + this.name);
    System.out.println("Year of birth is " + this.year);
  }
}

public class students{
  public static void main(String[] args){
    Student n1 = new Student("Yunus", 2001);
    Student n2 = new Student("Yunus");
    Student n3 = new Student();
    n1.display();
    n2.display();
    n3.display();
  }
}
