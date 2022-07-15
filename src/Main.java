public class Main {
//    Check
    static void argsPrinting(String msg, int... args) {
        for (int argsStore : args) {
            System.out.println(msg + "args[" + argsStore + "]" + argsStore * argsStore);
        }
    }

    public static void main(String[] args) {
        argsPrinting("Hello World", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}