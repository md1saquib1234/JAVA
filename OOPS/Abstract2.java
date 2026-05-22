public class Abstract2 {

  public static void main(String[] args) {
  Deer d = new Deer();
  d.eatPlants();

  

  }
}

interface Herbivores {

  void eatPlants();
}

interface Carnivores {

  void eatMeat();
}

class Deer implements Herbivores, Carnivores {
  public void eatPlants() {
    System.out.println("Deer eats grass");
  }

  public void eatMeat() {
    System.out.println("eats meat");
  }
}
