public class ExArgsHyphen {
    public static void main(String[] args) {
        for (int i = 0; i < args.length - 1; ++i) {
            System.out.print(args[i] + "-");
        }
        System.out.println(args[args.length - 1]);
    }
}
