import java.util.Scanner;

public final class InputValidation {
    private InputValidation() {
        // Prevent instantiation
    }

    /**
     * Reads a byte input from the user.
     *
     * @param scanner The Scanner object to read input from.
     * @param prompt  The message to display to the user asking for input.
     * @return The validated byte input.
     */
    public static byte readByte(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                return Byte.parseByte(line.trim());
            } catch (NumberFormatException e) {
                System.err.println("Error: Enter a byte value.");
            }
        }
    }

    /**
     * Reads a short input from the user.
     *
     * @param scanner The Scanner object to read input from.
     * @param prompt  The message to display to the user asking for input.
     * @return The validated short input.
     */
    public static short readShort(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                return Short.parseShort(line.trim());
            } catch (NumberFormatException e) {
                System.err.println("Error: Enter a short value.");
            }
        }
    }

    /**
     * Reads an integer input from the user.
     *
     * @param scanner The Scanner object to read input from.
     * @param prompt  The message to display to the user asking for input.
     * @return The validated integer input.
     */
    public static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                return Integer.parseInt(line.trim());
            } catch (NumberFormatException e) {
                System.err.println("Error: Enter a whole number.");
            }
        }
    }

    /**
     * Reads a long input from the user.
     *
     * @param scanner The Scanner object to read input from.
     * @param prompt  The message to display to the user asking for input.
     * @return The validated long input.
     */
    public static long readLong(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                return Long.parseLong(line.trim());
            } catch (NumberFormatException e) {
                System.err.println("Error: Enter a long value.");
            }
        }
    }

    /**
     * Reads a float input from the user.
     *
     * @param scanner The Scanner object to read input from.
     * @param prompt  The message to display to the user asking for input.
     * @return The validated float input.
     */
    public static float readFloat(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                return Float.parseFloat(line.trim());
            } catch (NumberFormatException e) {
                System.err.println("Error: Enter float.");
            }
        }
    }

    /**
     * Reads a double input from the user.
     *
     * @param scanner The Scanner object to read input from.
     * @param prompt  The message to display to the user asking for input.
     * @return The validated double input.
     */
    public static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                return Double.parseDouble(line.trim());
            } catch (NumberFormatException e) {
                System.err.println("Error: Enter double.");
            }
        }
    }

    /**
     * Reads a character input from the user.
     *
     * @param scanner The Scanner object to read input from.
     * @param prompt  The message to display to the user asking for input.
     * @return The validated character input.
     */
    public static char readChar(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine().trim();
            if (line.length() == 1) {
                return line.charAt(0);
            } else {
                System.err.println("Error: Enter a single character.");
            }
        }
    }

    /**
     * Reads a letter input from the user.
     *
     * @param scanner The Scanner object to read input from.
     * @param prompt  The message to display to the user asking for input.
     * @return The validated letter input.
     */
    public static char readLetter(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine().trim();
            if (line.length() == 1 && Character.isLetter(line.charAt(0))) {
                return line.charAt(0);
            } else {
                System.err.println("Error: Enter a single letter.");
            }
        }
    }

    /**
     * Reads a boolean input from the user.
     *
     * @param scanner The Scanner object to read input from.
     * @param prompt  The message to display to the user asking for input.
     * @return The validated boolean input.
     */
    public static boolean readBoolean(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine().trim().toLowerCase();
            if (line.equals("true") || line.equals("false")) {
                return Boolean.parseBoolean(line);
            } else {
                System.err.println("Error: Enter 'true' or 'false'.");
            }
        }
    }

    /**
     * Reads a non-empty string.
     * @param scanner Scanner instance
     * @param prompt Message to user
     * @return Validated, non-empty, trimmed string
     */
    public static String readString(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            } else {
                System.err.println("Error: Input cannot be empty.");
            }
        }
    }

    // Example usage of methods. See Main.java for calling these methods in another class.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // readByte method example
        byte byteValue = readByte(scanner, "Enter a byte value: ");
        System.out.println("You entered: " + byteValue);

        // readShort method example
        short shortValue = readShort(scanner, "Enter a short value: ");
        System.out.println("You entered: " + shortValue);

        // readInt method example
        int number = readInt(scanner, "Enter a number: ");
        System.out.println("You entered: " + number);

        // readLong method example
        long longValue = readLong(scanner, "Enter a long value: ");
        System.out.println("You entered: " + longValue);

        // readFloat method example
        float decimal = readFloat(scanner, "Enter a decimal: ");
        System.out.println("You entered: " + decimal);

        // readChar method example
        char character = readChar(scanner, "Enter a character: ");
        System.out.println("You entered: " + character);

        // readLetter method example
        char letter = readLetter(scanner, "Enter a letter: ");
        System.out.println("You entered: " + letter);

        // readBoolean method example
        boolean bool = readBoolean(scanner, "Enter true or false: ");
        System.out.println("You entered: " + bool);

        // readString method example
        String text = readString(scanner, "Type some characters: ");
        System.out.println("You entered: " + text);
    }
}