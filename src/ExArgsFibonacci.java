public class ExArgsFibonacci {
    public static void main(String[] args) {
        System.out.print(0);
        int previous = 0;
        int fibonacci = 1;
        for (int i = 1; i <= Integer.parseInt(args[0]); ++i) {
            int temp = fibonacci;
            fibonacci += previous;
            System.out.print(" > " + fibonacci);
            previous = temp;
        }
        System.out.println();
    }
}
