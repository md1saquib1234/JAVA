public class Inheritance {

  public static void main(String[] args) {
    // Fish shark = new Fish();
    // shark.eat();

    Dog dobby = new Dog();
    dobby.eat();
    Bird parrot = new Bird();
    parrot.fly();

    Fish nemo = new Fish();
    nemo.eat();
    nemo.swin();
    nemo.color = "Orange";
    System.out.println("Color of nemo is " + nemo.color);
      
  }



}

class Animal {
  String color;

  void eat() {
    System.out.println("eats");
  }

  void breathe() {
    System.out.println("breathes");
  }
}


//Derived class
// class Fish extends Animal {
//   int fins;

//   void swim() {
//     System.out.println("Swims in water");
//   }
// }

class Mammal extends Animal {
  void walk() {
    System.out.println("walks on land");
  }


}

class Fish extends Animal {
  void swin() {
    System.out.println("swims in water");
  }
}

class Bird extends Animal {
  void fly() {
    System.out.println("flies in the sky");
  }
}
