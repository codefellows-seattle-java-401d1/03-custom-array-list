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
        int[] temp = new int[DEFAULT_SIZE];
        System.out.println("Number of elements: " + elements);

        if (this.elements >= DEFAULT_SIZE) {
            temp = new int[this.elements + 1];
        }

        for (int i = 0; i < index; i++) {
            temp[i] = this.data[i];
        }

        for (int i = temp.length - 1; i > index; i--) {
            temp[i] = this.data[i - 1];
        }
        temp[index] = val;
        this.elements++;

        return temp;
    }

    public int[] removeValue (int val) {
        int i = 0;

        while (this.data[i] != val && i < this.data.length - 1) {
            i++;
        }

        if (this.data[i] == val) {
            this.data[i] = 0;
            this.elements--;
        }

        return this.data;
    }

    public int[] removeAtIndex (int index) {
        int[] temp = new int[this.data.length];
        this.data[index] = 0;
        this.elements--;

        for (int i = 0; i < index; i++) {
            temp[i] = this.data[i];
        }

        for (int i = temp.length - 1; i > index; i--) {
            temp[i - 1] = this.data[i];
        }

        return temp;
    }

    public int size () {
        return this.elements;
    }

    public int get (int index) {
        return this.data[index];
    }
}

