import java.util.Scanner;

public class Examples{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // readByte method example
        byte byteValue = InputValidation.readByte(scanner, "Enter a byte value: ");
        System.err.println("You entered: " + byteValue);

        // readShort method example
        short shortValue = InputValidation.readShort(scanner, "Enter a short value: ");
        System.err.println("You entered: " + shortValue);

        // readInt method example
        int number = InputValidation.readInt(scanner, "Enter a number: ");
        System.err.println("You entered: " + number);

        // readFloat method example
        float decimal = InputValidation.readFloat(scanner, "Enter a decimal: ");
        System.err.println("You entered: " + decimal);

        // readLong method example
        long longValue = InputValidation.readLong(scanner, "Enter a long value: ");
        System.err.println("You entered: " + longValue);

        // readChar method example
        char character = InputValidation.readChar(scanner, "Enter a character: ");
        System.err.println("You entered: " + character);

        // readLetter method example
        char letter = InputValidation.readLetter(scanner, "Enter a letter: ");
        System.err.println("You entered: " + letter);

        // readBoolean method example
        boolean bool = InputValidation.readBoolean(scanner, "Enter true or false: ");
        System.err.println("You entered: " + bool);

        // readString method example
        String text = InputValidation.readString(scanner, "Type some words: ");
        System.err.println("You entered: " + text);
    }
}