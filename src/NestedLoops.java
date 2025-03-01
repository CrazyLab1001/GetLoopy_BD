import java.sql.SQLOutput;

public class NestedLoops {
    public static void main(String[] args) {
        int row;
        int column;
        // Task 5
        for (row = 0; row < 5; row++){
            for (column = 0; column < row; column++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        // Task 6
        for (row = 5; row > -1; row--){
            for (column = 0; column < row; column++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        // Task 7
        for (row = 0; row < 5; row++){
            for (column = 0; column < 5; column++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
