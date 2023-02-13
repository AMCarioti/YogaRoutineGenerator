import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer totalTime = 0;
    while (totalTime <= 0) {
      try {
        System.out.println("Hello! Please choose from the following:\n Type 1 for a short yoga practice\n Type 2 for a medium length yoga practice\n Type 3 for a long yoga practice\n");
        totalTime = sc.nextInt();
        switch (totalTime){
          case 1:
            totalTime = 15;
            System.out.println("You've chosen a short practice.");
            ;
          break;
          case 2:
            totalTime = 30;
            System.out.println("You've chosen a medium length practice.");
          break;
          case 3:
            totalTime = 45;
            System.out.println("You've chosen a long practice.");
          break;
          default:
            System.out.println("Please choose one of the above options");
            totalTime = 0;
        }
      } catch (InputMismatchException e) {
          System.out.println("Invalid input! Please enter a valid number!");
          sc.next();
        }
      
    }

    
    System.out.println("Here is your yoga practice! When you are finished with the current move, press Enter to move on the next move. Enjoy!\n");
    MoveGenerator generator = new MoveGenerator();
    ArrayList<YogaMove> moveSet = generator.generate(totalTime);
    sc.nextLine();
    for(YogaMove move : moveSet){
      System.out.println(move);
      sc.nextLine();
    }
    sc.close();

    System.out.println("\nGreat job! Your practice is complete!");
  }
}
