class ClassIntro {

  String name;
  int age;

  ClassIntro(String name, int age) {
    this.name = name;
    this.age = age; 
  }

  String getName() {
    return "[" + this.name + " " + this.age + "]";
  }

}

public class Main {

  public static void main(String[] args) {
    
    ClassIntro c1 = new ClassIntro("John", 30);
    System.out.println(c1.getName());
    
  }

}