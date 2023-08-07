import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Первый игрок, представьтесь: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Второй игрок, представьтесь: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String answer;
        do{
            game.startGame();
            while (true) {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.next();
                if (answer.equals("yes") || answer.equals("no")) {
                    break;
                }
            }
        } while (answer.equals("yes"));
      
    }
}