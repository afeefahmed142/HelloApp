public class NameApp {
    public static void main(String[] args) {

        // No arguments → default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Add all names with comma and space
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove last ", "
            String names = "";
            if (nameBuilder.length() > 0) {
                names = nameBuilder.substring(0, nameBuilder.length() - 2);
            }

            System.out.println("Hello, " + names + "!");
        }
    }
}
