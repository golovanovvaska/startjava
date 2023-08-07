package lesson_1.final;

public class MyFirstGame {

    public static void main(String[] args) {
        int computerNumber = 55;
        int playerNumber = 63;

        while (computerNumber != playerNumber) {
            System.out.print("Число " + playerNumber);
            if (computerNumber > playerNumber) {
                System.out.print(" меньше");
                playerNumber++;
            } else {
                System.out.print(" больше");
                playerNumber--;
            }
            System.out.println(" того, что загадал компьютер");
        }
        System.out.println("Вы победили!");
    }
}