import java.util.Scanner;

public class Examples{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // readByte method example
        byte byteValue = InputValidation.readByte("Enter a byte value: ");
        System.err.println("You entered: " + byteValue);

        // readShort method example
        short shortValue = InputValidation.readShort("Enter a short value: ");
        System.err.println("You entered: " + shortValue);

        // readInt method example
        int number = InputValidation.readInt("Enter a number: ");
        System.err.println("You entered: " + number);

        // readFloat method example
        float decimal = InputValidation.readFloat("Enter a decimal: ");
        System.err.println("You entered: " + decimal);

        // readLong method example
        long longValue = InputValidation.readLong("Enter a long value: ");
        System.err.println("You entered: " + longValue);

        // readChar method example
        char character = InputValidation.readChar("Enter a character: ");
        System.err.println("You entered: " + character);

        // readLetter method example
        char letter = InputValidation.readLetter("Enter a letter: ");
        System.err.println("You entered: " + letter);

        // readBoolean method example
        boolean bool = InputValidation.readBoolean("Enter true or false: ");
        System.err.println("You entered: " + bool);

        // readString method example
        String text = InputValidation.readString("Type some words: ");
        System.err.println("You entered: " + text);
    }
}