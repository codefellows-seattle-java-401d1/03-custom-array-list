import java.util.Arrays;


public class MyArrayList {
    private int DEFAULT_SIZE = 10;

    private int[] data;
    private int elements;

    // Creates default array with size. Specifies what it adds to the constructor
    public MyArrayList() {
        this.data = new int[DEFAULT_SIZE];
        this.elements = 0; // THIS IS THE INDEX NOT VALUE
    }

    // Adds a value to the end of the list
    public int[] add(int value) {
        this.data[this.elements] = value;
        this.elements++;

        System.out.println("data: " + (Arrays.toString(this.data)));

        return this.data;
    }

    // Adds the value at the index, shifting all other elements to make room
    public int[] addAtIndex(int value, int index) {
        this.elements++;
        for (int i = this.elements; i > index; i--) {
            this.data[i] = this.data[i - 1];
        }
        this.data[index] = value;
        System.out.println("data: " + (Arrays.toString(this.data)));
        return this.data;
    }

    // Searches for the first occurrence of the value in
    // the array, removes it, and shifts everything so there's no gaps left.
    public int[] removeValue(int val) {
        int i = 0;
        while (this.data[i] != val) {
            System.out.println("data removed: " + (Arrays.toString(new int[]{this.data[i]})));

            i++;
        }
        this.elements--;
        this.data[i] = 0;

        System.out.println("data: " + (Arrays.toString(this.data)));

        return this.data;
    }

    // Removes the value at the index and shifts
    // everything else to leave no gaps.
    public int[] removeAtIndex(int index) {

        this.elements--;
        this.data[index] = 0;

        System.out.println("data: " + (Arrays.toString(this.data)));


        return this.data;
    }

    // Returns the number of elements in the array
    public int size() {
        System.out.println("elements in array: " + this.elements);

        return this.elements;
    }

    // Returns the value of the element at the index in the array
    public int get(int index) {

        System.out.println("data: " + (Arrays.toString(this.data)));

        return this.data[index];
    }
}