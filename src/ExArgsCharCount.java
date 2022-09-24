public class ExArgsCharCount {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < args.length; ++i) {
            count += args[i].length();
        }
        System.out.print(count + " caractères dans '");
        for (int i = 0; i < args.length - 1; ++i) {
            System.out.print(args[i] + " ");
        }
        System.out.println(args[args.length - 1] + "'");
    }
}
