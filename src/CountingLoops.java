public class CountingLoops {
    public static void main(String[] args) {
        int count;
        for (count = 0; count < 31; count++) {
            System.out.print(count + "  ");
        }
        System.out.println("");
        for (count = 30; count > -1; count--){
            System.out.print(count + "  ");
        }
        System.out.println("");
        for (count = 0; count < 19; count = count + 3)
        {
            System.out.print(count + "  ");
        }
        System.out.println("");
        for (count = 10; count > -1; count = count - 2){
            System.out.print(count + "  ");
        }
    }
}