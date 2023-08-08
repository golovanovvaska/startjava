package lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger saberAthena = new Jaeger();
        saberAthena.setModelName("Saber Athena");
        saberAthena.setMark("Mark-7");
        saberAthena.setHeight(76.91);
        saberAthena.setWeight(1.628);
        saberAthena.setKaijuKilled(1);

        Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", 76.2, 1.85, 11);
        saberAthena.walk();
        strikerEureka.walk();
        saberAthena.fire();
        saberAthena.setKaijuKilled(5);
        strikerEureka.fire();
        strikerEureka.setKaijuKilled(12);
        saberAthena.showInfo();
        strikerEureka.showInfo();
    }
}
