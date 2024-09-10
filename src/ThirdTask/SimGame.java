package ThirdTask;
import java.util.Scanner;

public class SimGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Trenutne sposobnosti: " + hero);
            System.out.println("Odaberite novu sposobnost za superheroja: ");
            System.out.println("(1) Brzo trčanje");
            System.out.println("(2) Letenje");
            System.out.println("(3) Dvostruka snaga");
            System.out.println("(4) Dalekovidost");
            System.out.println("(5) Povratak na normalne sposobnosti");
            System.out.println("(6) Izlaz iz igre");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hero.setAndApplyAbility(new FastRunningStrategy());
                    break;
                case 2:
                    hero.setAndApplyAbility(new FlyingStrategy());
                    break;
                case 3:
                    hero.setAndApplyAbility(new DoubleStrengthStrategy());
                    break;
                case 4:
                    hero.setAndApplyAbility(new LongDistVisionStrategy());
                    break;
                case 5:
                    hero.setAndApplyAbility(new ZeroStrategy());
                    break;
                case 6:
                    System.out.println("Igra završena!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Nepoznat izbor, pokušajte ponovno.");
                    break;
            }
        }
    }
}
