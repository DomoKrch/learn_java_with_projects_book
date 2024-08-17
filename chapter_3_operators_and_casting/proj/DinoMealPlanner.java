public class DinoMealPlanner {
  public static void main(String args[]) {
    int veloWeightInKg = 16;
    int tWeightInKg = 10000;
    int alloWeightInKg = 1700;

    // Dino weight parameters go here
    System.out.println("Our " + alloWeightInKg + " kg dinosaur needs to eat " +
(alloWeightInKg * 0.2 * 3) + " kg daily, which means we need to serve " +
(alloWeightInKg * 0.2)  + " kg per feeding");
    System.out.println("P.S. 20 % is for string dinos");
  }
}
