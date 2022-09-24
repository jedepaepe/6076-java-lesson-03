public class ExArgsGreetingsN {
    public static void main(String[] args) {
        System.out.print("Bonjour");
        for (int i = 0; i < args.length; ++i) {
            System.out.print(" " + args[i]);
        }
        System.out.println();
    }
}
