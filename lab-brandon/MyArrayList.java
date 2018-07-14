import java.util.Arrays;

public class MyArrayList {
    private int DEFAULT_SIZE = 10;

    private int[] data;
    private int elements;

    // Main constructor
    public MyArrayList () {
        this.data = new int[DEFAULT_SIZE];
        this.elements = 0;
    }

    // Parameterized constructor
    public MyArrayList (int customSize) {
        this.data = new int[customSize];
        this.elements = 0;
    }

    // adds a value to the end of the list
    public int[] add (int val) {
        this.data[this.elements] = val;
        this.elements++;

        return this.data;
    }

    // adds a val at a specified index
    public int[] addAtIndex (int val, int index) {
        this.elements++;

        this.data[index] = val;
        return this.data;
    }

    public int[] removeValue (int val) {
        int i = 0;

        while (this.data[i] != val) {
            i++;
        }

        this.data[i] = 0;
        this.elements--;
        return this.data;
    }

    public int[] removeAtIndex (int val, int index) {
        this.data[index] = 0;
        this.elements--;

        return this.data;
    }

    public int size () {
        return this.elements;
    }

    public int get (int index) {
        return this.data[index];
    }
}

