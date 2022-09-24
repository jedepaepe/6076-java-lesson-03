public class ExArgsVerticalAll {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; ++i) {
            for (int c = 0; c < args[i].length(); ++c) {
                System.out.println("    " + args[i].charAt(c));
            }
            System.out.println();
        }
    }
}
