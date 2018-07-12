/*
Your MyArrayList class should have the following methods:
1. A constructor that creates an array with some default size.
2 A parameterized constructor that allows users to specify how large the initial array should be.
3. add(int val) - adds the value to the end of the list
4. add(int val, int index) - adds the value at the index, shifting all other elements to make room.
5. removeValue(int val) - searches for the first occurence of the value in the array, removes it, and shifts everything so there's no gaps left.
6. removeAtIndex(int index) - Removes the value at the index and shifts everything else to leave no gaps.
7. size() - returns the number of elements in the array.
8. get(int index) - returns the value of the element at the index in the array.

The array and the size variable (not the size() method!) should be private. Users are only allowed to interact with the class via the public methods. This guarantees that no one can break the list and get it into weird states.
 */

public class MyArrayList {

    private int DEFAULT_SIZE = 10;

    private int[] data;
    private int elements;

    public MyArrayList() {
        this.data = new int[DEFAULT_SIZE];
        this.elements = 0;
    }

    public MyArrayList(int size) {
        this.data = new int[size];
        this.elements = 0;
    }

    // adds a value to the end of the list
    public int add(int value) {
        this.data[this.elements] = value;
        this.elements++;
        return this.data[this.elements];
    }

    //finds the size of the custom array
    public int size() {
        int count = 0;

        for(int i = 0; i < this.data[this.elements]; i++){
            count++;
        }
//        int n = this.elements;
        return  count;
    }

//    @Override
//    public String toString() {
//        return "["  + this.elements + "]";
//    }




}
