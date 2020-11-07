

class SportCar extends Car{
  String model;
  int hp;
  public SportCar(String brand, int yob, String model, int hp){
    super(brand, yob);
    this.model = model;
    this.hp = hp;
  }
  public void show(){
    System.out.println("Brand is " + this.brand);
    System.out.println("Year of brand is " + this.yob);
    System.out.println("Model is " + this.model);
    System.out.println("Horse power is " + this.hp);
  }
}

public class sportcar{
  public static void main(String[] args){
    SportCar mashina = new SportCar("Mustang", 2019, "RX-190", 5000);
    mashina.show();
  }
}
