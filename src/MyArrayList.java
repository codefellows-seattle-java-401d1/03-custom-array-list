/*
The array and the size variable (not the size() method!) should be private. Users are only allowed to interact with the class via the public methods. This guarantees that no one can break the list and get it into weird states.
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayList {

    private int DEFAULT_SIZE = 10;

    private int[] data; //array name
    private int elements; //elements in the array?
    private int size; //size of array


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
    public void add(int value) {
        this.data[this.elements] = value;
        this.elements++;
        System.out.println(Arrays.toString(this.data));
    }

     // 04. adds the value at the index, shifting all other elements to make room.
    public Boolean add(int value, int index) {
        //check if array has room to shift things
        if(this.elements == this.size) {
            System.out.println("Sorry, dude. No room.");
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

//    // 05. searches for the first occurrence of the value in the array, removes it, and shifts everything so there's no gaps left.
//    removeValue(int val) {
//
//    }
//
//    // 06. Removes the value at the index and shifts everything else to leave no gaps.
//    removeAtIndex(int index) {
//
//    }

    // 07. returns the number of elements in the array.
    public int size() {
        int count = 0;

        for(int i = 0; i < this.data.length; i++){
            count++;
        }
        return  count;
    }

//    // 08. returns the value of the element at the index in the array.
//    get(int index) {
//
//    }

}
