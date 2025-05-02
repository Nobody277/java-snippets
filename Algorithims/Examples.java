package Algorithims;

public class Examples {

    public static void main(String[] args) {
        boolean[] booleanArray = {true, false, true, false, true};
        Sorting.bubbleBoolean(booleanArray);

        for (boolean value : booleanArray) {
            System.out.print(value + " ");
        }
    }
}