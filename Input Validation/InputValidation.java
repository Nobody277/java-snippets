import java.util.Scanner;

public final class InputValidation {
    private InputValidation() {
        // Prevent instantiation
    }

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Reads a byte input from the user.
     *
     * @param prompt  The message to display to the user asking for input.
     * @return The validated byte input.
     */
    public static byte readByte(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                return Byte.parseByte(line.trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Enter a byte value.");
            }
        }
    }

    /**
     * Reads a short input from the user.
     *
     * @param prompt  The message to display to the user asking for input.
     * @return The validated short input.
     */
    public static short readShort(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                return Short.parseShort(line.trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Enter a short value.");
            }
        }
    }

    /**
     * Reads an integer input from the user.
     *
     * @param prompt  The message to display to the user asking for input.
     * @return The validated integer input.
     */
    public static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                return Integer.parseInt(line.trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Enter a whole number.");
            }
        }
    }

    /**
     * Reads a long input from the user.
     *
     * @param prompt  The message to display to the user asking for input.
     * @return The validated long input.
     */
    public static long readLong(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                return Long.parseLong(line.trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Enter a long value.");
            }
        }
    }

    /**
     * Reads a float input from the user.
     *
     * @param prompt  The message to display to the user asking for input.
     * @return The validated float input.
     */
    public static float readFloat(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                return Float.parseFloat(line.trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Enter float.");
            }
        }
    }

    /**
     * Reads a double input from the user.
     *
     * @param prompt  The message to display to the user asking for input.
     * @return The validated double input.
     */
    public static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                return Double.parseDouble(line.trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Enter double.");
            }
        }
    }

    /**
     * Reads a character input from the user.
     *
     * @param prompt  The message to display to the user asking for input.
     * @return The validated character input.
     */
    public static char readChar(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine().trim();
            if (line.length() == 1) {
                return line.charAt(0);
            } else {
                System.out.println("Error: Enter a single character.");
            }
        }
    }

    /**
     * Reads a letter input from the user.
     *
     * @param prompt  The message to display to the user asking for input.
     * @return The validated letter input.
     */
    public static char readLetter(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine().trim();
            if (line.length() == 1 && Character.isLetter(line.charAt(0))) {
                return line.charAt(0);
            } else {
                System.out.println("Error: Enter a single letter.");
            }
        }
    }

    /**
     * Reads a boolean input from the user.
     *
     * @param prompt  The message to display to the user asking for input.
     * @return The validated boolean input.
     */
    public static boolean readBoolean(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine().trim().toLowerCase();
            if (line.equals("true") || line.equals("false")) {
                return Boolean.parseBoolean(line);
            } else {
                System.out.println("Error: Enter 'true' or 'false'.");
            }
        }
    }

    /**
     * Reads a non-empty string.
     * 
     * @param prompt Message to user
     * @return Validated, non-empty, trimmed string
     */
    public static String readString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            } else {
                System.out.println("Error: Input cannot be empty.");
            }
        }
    }

    // Example usage of methods. See Main.java for calling these methods in another class.
    public static void main(String[] args) {
        
        // readByte method example
        byte byteValue = readByte("Enter a byte value: ");
        System.out.println("You entered: " + byteValue);

        // readShort method example
        short shortValue = readShort("Enter a short value: ");
        System.out.println("You entered: " + shortValue);

        // readInt method example
        int number = readInt("Enter a number: ");
        System.out.println("You entered: " + number);

        // readLong method example
        long longValue = readLong("Enter a long value: ");
        System.out.println("You entered: " + longValue);

        // readFloat method example
        float decimal = readFloat("Enter a decimal: ");
        System.out.println("You entered: " + decimal);

        // readChar method example
        char character = readChar("Enter a character: ");
        System.out.println("You entered: " + character);

        // readLetter method example
        char letter = readLetter("Enter a letter: ");
        System.out.println("You entered: " + letter);

        // readBoolean method example
        boolean bool = readBoolean("Enter true or false: ");
        System.out.println("You entered: " + bool);

        // readString method example
        String text = readString("Type some characters: ");
        System.out.println("You entered: " + text);
    }
}