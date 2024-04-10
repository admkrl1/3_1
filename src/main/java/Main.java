// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Podaj długość boku kwadratu: ");
    int dlugoscBoku = scanner.nextInt();

    // Rysowanie górnej krawędzi
    for (int i = 0; i < dlugoscBoku; i++) {
        System.out.print("* ");
    }
    System.out.println(); // Przejście do nowej linii po narysowaniu górnej krawędzi

    // Rysowanie środkowych wierszy
    for (int i = 0; i < dlugoscBoku - 2; i++) {
        System.out.print("* "); // Lewa krawędź

        // Spacje wewnątrz kwadratu
        for (int j = 0; j < dlugoscBoku - 2; j++) {
            System.out.print("  ");
        }

        System.out.println("*"); // Prawa krawędź
    }

    // Rysowanie dolnej krawędzi
    for (int i = 0; i < dlugoscBoku; i++) {
        System.out.print("* ");
    }

    scanner.close();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}