
class Car{
  String brand;
  int yob;
  public Car(String brand, int yob){
    this.brand = brand;
    this.yob = yob;
  }
}

class SportCar extends Car{
  int hp;
  public SportCar(String brand, int yob, int hp){
    super(brand, yob);
    this.brand = brand;
    this.yob = yob;
    this.hp = hp;
  }
}

public class inheritance{
  public static void main(String[] args){

  }
}
