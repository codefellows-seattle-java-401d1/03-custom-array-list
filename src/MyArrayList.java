import java.util.Arrays;

//A constructor that creates an array with some default size
public class MyArrayList {
    public static void main(String[] args) {

    }
    private int[] data;
    private int index;
    private int DEFAULT_SIZE = 10;
    private int size;

    //set size of array and establish constructor properties
    public MyArrayList() {
        this.data = new int[DEFAULT_SIZE];
        this.index = 0;

        // temp in program check before building tests
//        add(4);
//        addValue(4, 22);
//        removeValue(22);
//        removeAtIndex(2);
//        size();
//        get(1);
    }

//    //create a method that modifies the original parent class to allow for changing array size
//    public MyArrayList(int size){
//        this.size = size;
//        this.data = new int[this.size];
//        this.index = 0;
//    }

    //adds value to an end of the list
    public int[] add(int value) {
        this.data[this.index] = value;
        this.index++;
//        System.out.println(this.data.length);
        return this.data ;
    }

    //adds the value at the index, shifting all other elements to make room.
    public boolean addValue(int value, int element) {
        if (element < this.index) {
            int moveElement = this.index - index;
            for (int i = moveElement; i > 0; i--) {
                this.data[element + i] = this.data[element - i + 1];
                this.data[element] = value;
                this.index++;
            }
        } else {
            //if the array is empty to start
            add(value);
            this.data[element] = value;
        } return true;
    }
    //searches for the first occurrence of the value in the array, removes it,
    // and shifts everything so there’s no gaps left
    public int[] removeValue ( int valueGone){
        int valueElement = 0;
        for (int i = 0; i < this.data.length; i++) {
            if (valueGone == this.data[i]) {
                valueElement = i;
            }
        }
        for (int i = valueElement; i < this.index-1; i++) {
            this.data[i] = this.data[i+1];
        }
        this.index--;
        return this.data;
    }

    //Removes the value at the index and shifts everything else to leave no gaps.
    public int[] removeAtIndex ( int indexGone){

        for (int i = indexGone; i < this.index-1; i++) {
            this.data[i] = this.data[i+1];
        }
        this.index--;
        return this.data;
    }

    //returns the number of elements in the array
    public int size() {
        return this.data.length;
    }

    //returns the value of the element at the index in the array
    public int get(int index) {
        return this.data[index];
    }
}
