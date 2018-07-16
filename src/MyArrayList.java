/*
The array and the size variable (not the size() method!) should be private. Users are only allowed to interact with the class via the public methods. This guarantees that no one can break the list and get it into weird states.
 */

import java.util.Arrays;

public class MyArrayList {

    private int DEFAULT_SIZE = 10;

    private int[] data;
    private int elements;
    private int size;


    // 01. A constructor that creates an array with some default size.
    public MyArrayList() {
        this.data = new int[DEFAULT_SIZE];
        this.elements = 0;
    }

    // 02. A parameterized constructor that allows users to specify how large the initial array should be.
    public MyArrayList(int size) {
        this.size = size;
        this.data = new int[this.size];
        this.elements = 0;
    }

    // 03. adds the value to the end of the list
    public int[] add(int value) {
        this.data[this.elements] = value;
        this.elements++;
        return this.data;
    }

     // 04. adds the value at the index, shifting all other elements to make room.
    public Boolean add(int value, int index) {
        //check if array has room to shift things
        if(this.elements == this.size) {
            System.out.println("Error. This array is full. Index " + index + " is unavailable.");
            return false;
        }

        if (index < this.elements) {
            int spaceToBeMoved = this.elements - index;

            for (int i = spaceToBeMoved; i > 0; i--) {
                this.data[index + i] = this.data[index + i-1];
            }

            this.data[index] = value;
            this.elements++;
            return true;

        } else {
            //adding a value declared by user to an empty index
            add(value);
            return true;
        }
    }

    // 05. searches for the first occurrence of the value in the array, removes it,
    // and shifts everything so there's no gaps left.
    public int[] removeValue(int value) {
        int locationOfValue = 0;
        for (int i = 0; i < this.data.length; i++) {
            if (value == this.data[i]) {
                locationOfValue = i;
                break;
            }
        }
        for (int i = locationOfValue; i < this.elements-1; i++) {
            this.data[i] = this.data[i+1];
        }
        this.elements--;
        return this.data;
    }

//     06. Removes the value at the index and shifts everything else to leave no gaps.
    public int[] removeAtIndex(int index) {

        for (int i = index; i < this.elements-1; i++) {
            this.data[i] = this.data[i+1];
        }
        if (this.elements < index) {
            System.out.println("Error. Index " + index + " does not exist.");
        } else {
            this.elements--;
        }
        return this.data;
    }

    // 07. returns the number of elements in the array.
    public int size() {
        int count = this.elements;
        return  count;
    }

    // 08. returns the value of the element at the index in the array.
    public int get(int index) {

        int value = this.data[index];
        if (this.elements < index) {
            System.out.println("Error. Index " + index + " is unavailable.");
            return -1;
        } else {
            System.out.println(value);
            return value;
        }
    }
}
