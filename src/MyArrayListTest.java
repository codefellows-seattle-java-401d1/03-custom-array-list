import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {


    //Testing the constructor with default (#01 on MyArrayList)
    //and the constructor with a set size (#02 on MyArrayList)
    //by using the ADD method (#03 on MyArrayList)

    @Test
    void addWithDefualtSize() {
        MyArrayList array = new MyArrayList();
        int testValue = 22;

        String actual = Arrays.toString(array.add(testValue));
        String expected = "[22, 0, 0, 0, 0, 0, 0, 0, 0, 0]";

        assertEquals(expected, actual);
    }

    @Test
    void addWithDeterminedSize() {
        MyArrayList array = new MyArrayList(5);
        int testValue = 22;

        String actual = Arrays.toString(array.add(testValue));
        String expected = "[22, 0, 0, 0, 0]";

        assertEquals(expected, actual);
    }

    //Testing the constructor with default (#01 on MyArrayList)
    //and the constructor with a set size (#02 on MyArrayList)
    //by using the ADD method while setting a size and an index (#04 on MyArrayList)

    @Test
    void addOutOfOrderIndex() {
        MyArrayList array = new MyArrayList();

        Boolean actual = array.add(22, 3);
        Boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    void addInOrder() {
        MyArrayList array = new MyArrayList();

        array.add(13);
        array.add(19);
        array.add(2);
        array.add(222);

        Boolean actual = array.add(22, 3);
        Boolean expected = true;

        assertEquals(expected, actual);
    }

    //Testing #05 on MyArrayList
    @Test
    void removeValueWithValuePresent() {
        MyArrayList array = new MyArrayList();

        array.add(13);
        array.add(19);
        array.add(2);
        array.add(222);

        int[] actual = array.removeValue(2);
        int[] expected = {13, 19, 222, 222, 0, 0, 0, 0, 0, 0};

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeValueWithoutValuePresent() {
        MyArrayList array = new MyArrayList();

        array.add(13);
        array.add(19);
        array.add(2);
        array.add(222);

        int[] actual = array.removeValue(0);
        int[] expected = {13, 19, 2, 222, 0, 0, 0, 0, 0, 0};

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeValueEmptyArrayDefaultSize() {
        MyArrayList array = new MyArrayList();


        int[] actual = array.removeValue(0);
        int[] expected = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeValueEmptyArray() {
        MyArrayList array = new MyArrayList(0);


        int[] actual = array.removeValue(0);
        int[] expected = {};

        assertArrayEquals(expected, actual);
    }

    //Testing #06 on MyArrayList
    @Test
    void removeAtIndexWithIndexAvailable() {
        MyArrayList array = new MyArrayList();

        array.add(13);
        array.add(19);
        array.add(2);
        array.add(222);

        int[] actual = array.removeValue(3);
        int[] expected = {19, 2, 222, 222, 0, 0, 0, 0, 0, 0};

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeAtIndexWithIndexUnavailable() {
        MyArrayList array = new MyArrayList();

        array.add(13);
        array.add(19);
        array.add(2);
        array.add(222);

        int[] actual = array.removeAtIndex(6);
        int[] expected = {13, 19, 2, 222, 0, 0, 0, 0, 0, 0};

        assertArrayEquals(expected, actual);
    }

    //Testing #07 on MyArrayList
    @Test
    void sizeOfFilledArray() {
        MyArrayList array = new MyArrayList();

        array.add(13);
        array.add(19);
        array.add(2);
        array.add(222);

        int actual = array.size();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void sizeOfEmptyArray() {
        MyArrayList array = new MyArrayList();

        int actual = array.size();
        int expected = 0;

        assertEquals(expected, actual);
    }

    //Testing #08 on MyArrayList
    @Test
    void getWithIndexAvailable() {
        MyArrayList array = new MyArrayList();

        array.add(13);
        array.add(19);
        array.add(2);
        array.add(222);

        int actual = array.get(1);
        int expected = 19;

        assertEquals(expected, actual);
    }

    @Test
    void getWithIndexUnavailable() {
        MyArrayList array = new MyArrayList();

        array.add(13);
        array.add(19);
        array.add(2);
        array.add(222);

        int actual = array.get(6);
        int expected = -1;

        assertEquals(expected, actual);
    }
}