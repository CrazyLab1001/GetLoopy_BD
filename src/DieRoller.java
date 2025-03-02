import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        int die1 = 0;
        int die2 = 0;
        int die3 = 0;
        int sum = 0;
        String YNResponse = "";
        String trash = "";
        boolean done = false;
        do {
            int roll = 1;
            Random generator = new Random();
            die1 = generator.nextInt(6) + 1;
            die2 = generator.nextInt(6) + 1;
            die3 = generator.nextInt(6) + 1;
            System.out.println("Rolling until we get triples...");
            System.out.printf("%5s%15s%15s%15s%15s", "Roll", "Die1", "Die2", "Die3", "Sum");
            while (!(die1 == die2 && die1 == die3)){
                die1 = generator.nextInt(6) + 1;
                die2 = generator.nextInt(6) + 1;
                die3 = generator.nextInt(6) + 1;
                sum = die1 + die2 + die3;
                System.out.printf("\n%5d%15d%15d%15d%15d", roll, die1, die2, die3, sum);
                roll++;
            }
            //program
            System.out.println("");
            System.out.println("Run again? [Y/N]");
            Scanner in = new Scanner(System.in);
            YNResponse = in.nextLine().toUpperCase();

            if (YNResponse.equals("N")){
                done = true;
            } else if (!YNResponse.equals("Y")) {
                trash = YNResponse;
                System.out.println("Invalid input: " + trash + ". Running again!"); // I did it!! I bulletproofed it!!
            }
        } while (!done); // continue loop
    }
}
