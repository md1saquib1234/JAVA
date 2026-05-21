public class Calculator {

  public static void main(String[] args) {
    Calculators calc = new Calculators();
    System.out.println(calc.sum(4, 5));
    System.out.println(calc.sum((float)4.2, (float)5.9));
    System.out.println(calc.sum(4, 5, 8));
      
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
