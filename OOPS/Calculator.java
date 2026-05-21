public class Calculator {

  public static void main(String[] args) {
    // Calculators calc = new Calculators();
    // System.out.println(calc.sum(4, 5));
    // System.out.println(calc.sum((float)4.2, (float)5.9));
    // System.out.println(calc.sum(4, 5, 8));
    // Deer d = new Deer();
    // d.eat();
    Animal a = new Animal();
    a.eat();
    
      
  }
}

class Animal {
  void eat() {
    System.out.println("eats Anything");
  }
}

class Deer extends Animal {
  void eat() {
    System.out.println("eats grass");
  }
}

class Calculators {
  int sum(int a, int b) {
    return a + b;
  }

  float sum(float a, float b) {
    return a + b;
  }

  int sum(int a, int b, int c) {
    return a + b + c;
  }
}
