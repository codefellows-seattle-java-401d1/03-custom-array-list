import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


public class MyArrayListTest {



    @org.junit.jupiter.api.Test
    void add() {
        MyArrayList arr = new MyArrayList();

        int val = 36;

        String result = (Arrays.toString(arr.add(val)));
        String expected = Arrays.toString(new int[] {36, 0, 0, 0, 0, 0, 0, 0, 0, 0});

        assertEquals(expected, result) ;

    }

    @org.junit.jupiter.api.Test
    void addAtIndex() {
        MyArrayList arr = new MyArrayList();

        int val = 36;
        int index = 4;

        String result = (Arrays.toString(arr.addAtIndex(val, index)));
        String expected = Arrays.toString(new int[] {0, 0, 0, 0, 36, 0, 0, 0, 0, 0});

        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void removeValue() {

        MyArrayList arr = new MyArrayList();

        int val = 36;
        arr.addAtIndex(val, 2);

        String result = (Arrays.toString(arr.removeValue(val)));
        String expected = Arrays.toString(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0});


        assertEquals(expected, result);

    }

    @org.junit.jupiter.api.Test
    void removeAtIndex() {


        MyArrayList arr = new MyArrayList();

        int val = 36;
        int index = 8;
        arr.addAtIndex(val, index);

        String result = (Arrays.toString(arr.removeAtIndex(index)));
        String expected = Arrays.toString(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0});


        assertEquals(expected, result);


    }

    @org.junit.jupiter.api.Test
    void size() {

        MyArrayList arr = new MyArrayList();
        arr.add(5);

        int result = arr.size();
        int expected = 1;

        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void get() {

        MyArrayList arr = new MyArrayList();

        int val = 69;

        String result = (Arrays.toString(arr.add(val)));
        String expected = Arrays.toString(new int[] {69, 0, 0, 0, 0, 0, 0, 0, 0, 0});

        assertEquals(expected, result) ;

    }
}