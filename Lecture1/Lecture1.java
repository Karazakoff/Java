class Student {
    private String name;
    private String surname;
    private int age;
    public Student(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public String getSurame(){
        return surname;
    }
    public int getAge(){
        return age;
    }
    public void hello(){
        System.out.println("My name is: "+name+" and age is: "+age);
    }
    public boolean toComapareAge(Student s){
        if (this.age > s.getAge()){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean toComapre(Student s){
        if ((this.age == s.getAge()) && this.surname.equals(s.getSurame()) && this.name.equals(s.getName())){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Lecture1 {
    public static void main(String[] args) {
        Student student1 = new Student("Hubert","Szczepaniuk",30);
        Student student2 = new Student("Anna","Kowalska",25);
        student1.hello();
        if (student1.toComapareAge(student2)){
            System.out.println("S1 is older");
        }
        else{
            System.out.println("S2 is older");
        }
        Student s3 = new Student("Adam","Potocki",32);
        Student s4 = new Student("Adam","Potocki",32);
        if (s3.toComapre(s4)){
            System.out.println("Objects are the same");
        }
        else{
            System.out.println("Objects are not the same");
        }
    }
}
