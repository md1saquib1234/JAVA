import java.util.*;

class cOMPLEX {
  int real;
  int img;
  void Complex(int r, int i) {
    real = r;
    img = i;
  }
}

public static Complex add(complex a, Complex b) {
  return new Complex((a.real + b.real), (a.img + b.img));
}