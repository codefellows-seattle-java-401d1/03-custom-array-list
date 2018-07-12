import java.util.Arrays;

public class MyArrayList {
    public void main(String[] args) {
        new MyArrayList();
        System.out.println(Arrays.toString(this.data));
    }

    private int DEFAULT_SIZE = 10;
    private int[] data;
    private int elements;

    // constructor that creates an array with default size
    public MyArrayList() {
        this.data = new int[DEFAULT_SIZE];
        this.elements = 0;
    }

    // adds a value to the end of the list
    public void add(int value) {
        this.data[this.elements] = value;
        this.elements++;
    }

    // adds a value at an index, shifting all other elements to make room
    public void add(int value, int index) {
        this.data[this.elements] = value;

        this.elements++;
    }

    // searches for the first occurrence of the value in the array, removes it, and shifts everything so there's no gaps left
    public void removeValue(int value) {

    }

    // removes the value at the index and shifts everything else to leave no gaps
    public void removeAtIndex(int index) {

    }

    // returns the number of elements in an array
    public void size() {

    }

    // returns the value of the element at the index in an array
    public void get(int index) {

    }

}