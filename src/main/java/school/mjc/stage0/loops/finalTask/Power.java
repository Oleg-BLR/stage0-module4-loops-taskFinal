package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int resultPower = 1;
        for (int i = 1; i <= power; i++) {
            resultPower = resultPower * numberToPrint;
        }
        System.out.println(resultPower);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
