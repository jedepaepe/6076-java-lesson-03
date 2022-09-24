public class ExArgsMultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; ++i) {
            System.out.print(i * Integer.parseInt(args[0]) + " ");
        }
        System.out.println();
    }
}
