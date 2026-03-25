public class App {
    public static void main(String[] args) {

        // Check if user provided an argument
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, World!");
        }

    }
}
