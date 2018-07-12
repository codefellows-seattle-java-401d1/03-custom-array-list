import static org.junit.jupiter.api.Assertions.*;

class ListArrayTest {

    int[] genArray = {4,2,3,1};
    int[] testArrayEmpty = {};

    ListArray ListArray = new ListArray(genArray);
    ListArray ListArray1 = new ListArray(3);
    ListArray ListArray2 = new ListArray(5, genArray);
    ListArray ListArray0 = new ListArray(testArrayEmpty);

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(ListArray.size(),4);
    }

    @org.junit.jupiter.api.Test
    void size1() {
        assertEquals(ListArray1.size(),3);
    }

    @org.junit.jupiter.api.Test
    void size2() {
        assertEquals(ListArray2.size(),5);
    }

    @org.junit.jupiter.api.Test
    void size0() {
        assertEquals(ListArray0.size(),-1);
    }

    @org.junit.jupiter.api.Test
    void get() {
        assertEquals(ListArray.get(0),4);
    }

    @org.junit.jupiter.api.Test
    void get1() {
        assertEquals(ListArray1.get(0),0);
    }

    @org.junit.jupiter.api.Test
    void get2() {
        assertEquals(ListArray2.get(4),0);
    }

    @org.junit.jupiter.api.Test
    void indexOf() {
        assertEquals(ListArray.indexOf(2),3);
    }

    @org.junit.jupiter.api.Test
    void indexOf1() {
        assertEquals(ListArray1.indexOf(2),0);
    }

    @org.junit.jupiter.api.Test
    void indexOf2() {
        assertEquals(ListArray2.indexOf(2),3);
    }

    @org.junit.jupiter.api.Test
    void indexOf0() {
        assertEquals(ListArray0.indexOf(2),-1);
    }

    @org.junit.jupiter.api.Test
    void add() {ListArray.add(7);
        int[] testArray = {4,2,3,1,7};
        assertArrayEquals(ListArray.get(),testArray);
    }

    @org.junit.jupiter.api.Test
    void add1() {ListArray1.add(7);
        int[] testArray = {0,0,0,7};
        assertArrayEquals(ListArray1.get(),testArray);
    }

    @org.junit.jupiter.api.Test
    void add2() {ListArray2.add(7);
        int[] testArray = {4,2,3,1,0,7};
        assertArrayEquals(ListArray2.get(),testArray);
    }

    @org.junit.jupiter.api.Test
    void add0() {ListArray0.add(7);
        assertEquals(ListArray0.get()[0],7);
    }

    @org.junit.jupiter.api.Test
    void addAtIndex() {ListArray.add(9,2);
    int[] testArray = {4,2,9,3,1};
    assertArrayEquals(ListArray.get(),testArray);
    }

    @org.junit.jupiter.api.Test
    void addAtIndex1() {ListArray1.add(9,2);
        int[] testArray = {0,0,9,0};
        assertArrayEquals(ListArray1.get(),testArray);
    }

    @org.junit.jupiter.api.Test
    void addAtIndex2() {ListArray2.add(9,2);
        int[] testArray = {4,2,9,3,1,0};
        assertArrayEquals(ListArray2.get(),testArray);
    }

    @org.junit.jupiter.api.Test
    void addAtIndex0() {ListArray0.add(9,2);
        System.out.println("Check for error message in console 'Chosen index is out of bounds!'");
    }

    @org.junit.jupiter.api.Test
    void remove() {
        ListArray.remove(2);
        int[] testArray = {4,3,1};
        assertArrayEquals(ListArray.get(),testArray);
    }

    @org.junit.jupiter.api.Test
    void remove1() {
        ListArray1.remove(2);
        int[] testArray = {0,0,0};
        assertArrayEquals(ListArray1.get(),testArray);
    }

    @org.junit.jupiter.api.Test
    void remove2() {
        ListArray2.remove(2);
        int[] testArray = {4,3,1,0};
        assertArrayEquals(ListArray2.get(),testArray);
    }

    @org.junit.jupiter.api.Test
    void remove0() {
        ListArray0.remove(2);
        int[] testArray = {};
        assertNull(ListArray0.get());
    }

    @org.junit.jupiter.api.Test
    void removeAtIndex() {
        ListArray.removeAtIndex(1);
        int[] testArray = {4,3,1};
        assertArrayEquals(ListArray.get(),testArray);
    }

    @org.junit.jupiter.api.Test
    void removeAtIndex1() {
        ListArray1.removeAtIndex(1);
        int[] testArray = {0,0};
        assertArrayEquals(testArray,ListArray1.get());
    }

    @org.junit.jupiter.api.Test
    void removeAtIndex2() {
        ListArray2.removeAtIndex(3);
        int[] testArray = {4,2,1};
    }

    @org.junit.jupiter.api.Test
    void removeAtIndex0() {
        ListArray0.removeAtIndex(2);
    }
}