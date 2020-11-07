
class Car{
  String brand;
  int yob;
  public Car(String brand, int yob){
    this.brand = brand;
    this.yob = yob;
  }
  public void description(){
    System.out.println("Brand is " + this.brand);
    System.out.println("YOB is " + this.yob);
  }
}

// class SportCar extends Car{
//   int hp;
//   public SportCar(String brand, int yob, int hp){
//     super(brand, yob);
//     this.brand = brand;
//     this.yob = yob;
//     this.hp = hp;
//   }
// }

public class inheritance{
  public static void main(String[] args){
    Car c3 = new Car("Toyota", 2016);
    c3.description();

  }
}
