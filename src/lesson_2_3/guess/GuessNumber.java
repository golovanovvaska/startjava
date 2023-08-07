package lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {

    private int compNumber;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    Scanner scanner = new Scanner(System.in);
    private int checkNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        player.setNumber(scanner.nextInt());
        if (player.getNumber() == compNumber) {
            System.out.println(player.getName() + " победил");
            return -1;
        } else if (player.getNumber() > compNumber) {
            System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер");
        }
        return 0;
    }

    public void startGame() {
        compNumber = (int) ((Math.random() * 100) + 1);
        System.out.println("Я загадал число от 1 до 100..." + compNumber);
        while (true) {
           if (checkNumber(player1) == -1) {
               break;
           }
           if (checkNumber(player2) == -1) {
               break;
           }
        }
        
    }
}