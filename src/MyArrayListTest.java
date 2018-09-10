import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    int[] genArray = {4,2,3,1};
    int[] testArrayEmpty = {};

    MyArrayList MyArrayList = new MyArrayList(genArray);
    MyArrayList myArrayList1 = new MyArrayList(3);
    MyArrayList myArrayList2 = new MyArrayList(5, genArray);
    MyArrayList myArrayList0 = new MyArrayList(testArrayEmpty);

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(MyArrayList.size(),4);
    }

    @org.junit.jupiter.api.Test
    void size1() {
        assertEquals(myArrayList1.size(),3);
    }

    @org.junit.jupiter.api.Test
    void size2() {
        assertEquals(myArrayList2.size(),5);
    }

    @org.junit.jupiter.api.Test
    void size0() {
        assertEquals(myArrayList0.size(),-1);
    }

    @org.junit.jupiter.api.Test
    void get() {
        assertEquals(MyArrayList.get(0),4);
    }

    @org.junit.jupiter.api.Test
    void get1() {
        assertEquals(myArrayList1.get(0),0);
    }

    @org.junit.jupiter.api.Test
    void get2() {
        assertEquals(myArrayList2.get(4),0);
    }

    @org.junit.jupiter.api.Test
    void indexOf() {
        assertEquals(MyArrayList.indexOf(2),3);
    }

    @org.junit.jupiter.api.Test
    void indexOf1() {
        assertEquals(myArrayList1.indexOf(2),0);
    }

    @org.junit.jupiter.api.Test
    void indexOf2() {
        assertEquals(myArrayList2.indexOf(2),3);
    }

    @org.junit.jupiter.api.Test
    void indexOf0() {
        assertEquals(myArrayList0.indexOf(2),-1);
    }

    @org.junit.jupiter.api.Test
    void add() {
        MyArrayList.add(7);
        int[] testArray = {4,2,3,1,7};
        assertArrayEquals(MyArrayList.get(),testArray);
    }

    @org.junit.jupiter.api.Test
    void add1() {
        myArrayList1.add(7);
        int[] testArray = {0,0,0,7};
        assertArrayEquals(myArrayList1.get(),testArray);
    }

    @org.junit.jupiter.api.Test
    void add2() {
        myArrayList2.add(7);
        int[] testArray = {4,2,3,1,0,7};
        assertArrayEquals(myArrayList2.get(),testArray);
    }

    @org.junit.jupiter.api.Test
    void add0() {
        myArrayList0.add(7);
        assertEquals(myArrayList0.get()[0],7);
    }

    @org.junit.jupiter.api.Test
    void addAtIndex() {
        MyArrayList.add(9,2);
    int[] testArray = {4,2,9,3,1};
    assertArrayEquals(MyArrayList.get(),testArray);
    }

    @org.junit.jupiter.api.Test
    void addAtIndex1() {
        myArrayList1.add(9,2);
        int[] testArray = {0,0,9,0};
        assertArrayEquals(myArrayList1.get(),testArray);
    }

    @org.junit.jupiter.api.Test
    void addAtIndex2() {
        myArrayList2.add(9,2);
        int[] testArray = {4,2,9,3,1,0};
        assertArrayEquals(myArrayList2.get(),testArray);
    }

    @org.junit.jupiter.api.Test
    void addAtIndex0() {
        myArrayList0.add(9,2);
        System.out.println("Check for error message in console 'Chosen index is out of bounds!'");
    }

    @org.junit.jupiter.api.Test
    void remove() {
        MyArrayList.remove(2);
        int[] testArray = {4,3,1};
        assertArrayEquals(MyArrayList.get(),testArray);
    }

    @org.junit.jupiter.api.Test
    void remove1() {
        myArrayList1.remove(2);
        int[] testArray = {0,0,0};
        assertArrayEquals(myArrayList1.get(),testArray);
    }

    @org.junit.jupiter.api.Test
    void remove2() {
        myArrayList2.remove(2);
        int[] testArray = {4,3,1,0};
        assertArrayEquals(myArrayList2.get(),testArray);
    }

    @org.junit.jupiter.api.Test
    void remove0() {
        myArrayList0.remove(2);
        int[] testArray = {};
        assertNull(myArrayList0.get());
    }

    @org.junit.jupiter.api.Test
    void removeAtIndex() {
        MyArrayList.removeAtIndex(1);
        int[] testArray = {4,3,1};
        assertArrayEquals(MyArrayList.get(),testArray);
    }

    @org.junit.jupiter.api.Test
    void removeAtIndex1() {
        myArrayList1.removeAtIndex(1);
        int[] testArray = {0,0};
        assertArrayEquals(testArray, myArrayList1.get());
    }

    @org.junit.jupiter.api.Test
    void removeAtIndex2() {
        myArrayList2.removeAtIndex(3);
        int[] testArray = {4,2,1};
    }

    @org.junit.jupiter.api.Test
    void removeAtIndex0() {
        myArrayList0.removeAtIndex(2);
    }
}