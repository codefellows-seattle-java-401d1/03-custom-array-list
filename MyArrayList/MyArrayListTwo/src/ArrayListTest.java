import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @org.junit.jupiter.api.Test
    void add() {
        ArrayList arr = new ArrayList();

        int val = 80;

        String result = (Arrays.toString(arr.add(val)));
        String expected = Arrays.toString(new int[] {80, 0, 0, 0, 0, 0, 0, 0, 0, 0});

        assertEquals(expected, result) ;
    }

    @org.junit.jupiter.api.Test
    void addsetlist() {

        ArrayList arr = new ArrayList();
        arr.add(10);
        arr.add(25);
        arr.add(45);
        arr.add(55);
        arr.add(65);
        arr.add(100);
        arr.add(110);
        arr.add(300000);
        arr.add(2500);

        int val = 90000;

        String result = (Arrays.toString(arr.add(val)));
        String expected = Arrays.toString(new int[] {10, 25, 45, 55, 65, 100, 110, 300000, 2500, 90000});


        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void addlarger() {

        ArrayList arr = new ArrayList(13);
        arr.add(10);
        arr.add(25);
        arr.add(45);
        arr.add(55);
        arr.add(65);
        arr.add(100);
        arr.add(110);
        arr.add(300000);
        arr.add(2500);
        arr.add(45000);
        arr.add(12000);
        arr.add(13000);

        int val = 4501;

        String result = (Arrays.toString(arr.add(val)));
        String expected = Arrays.toString(new int[] {10, 25, 45, 55, 65, 100, 110, 300000, 2500, 45000, 12000, 13000, 4501});

        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void addIndexed() {
        ArrayList arr = new ArrayList();

        int val = 206;
        int index = 7;

        String result = Arrays.toString(arr.add(val, index));
        String expected = Arrays.toString(new int[] {0, 0, 0, 0, 0, 0, 0, 206, 0, 0});

        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void addIndexSetList() {

        ArrayList arr = new ArrayList();
        arr.add(10);
        arr.add(25);
        arr.add(45);
        arr.add(55);
        arr.add(65);
        arr.add(100);
        arr.add(110);
        arr.add(300000);
        arr.add(2500);
        arr.add(1000);

        int val = 140;
        int index = 7;

        String result = Arrays.toString(arr.add(val, index));
        String expected = Arrays.toString(new int[] {10, 25, 45, 55, 65, 100, 110, 140, 300000, 2500, 1000});
        assertEquals(expected, result);
    }




    @org.junit.jupiter.api.Test
    void removeValue() {
        ArrayList arr = new ArrayList();
        arr.add(10);
        arr.add(25);
        arr.add(45);
        arr.add(55);
        arr.add(65);
        arr.add(100);
        arr.add(110);
        arr.add(300000);
        arr.add(2500);
        arr.add(1000);

        int val = 45;

        String result = (Arrays.toString(arr.removeValue(val)));
        String expected = Arrays.toString(new int[] {10, 25, 55, 55, 65, 100, 110, 300000, 2500, 1000});

        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void removeValNotIn() {

        ArrayList arr = new ArrayList();
        arr.add(10);
        arr.add(25);
        arr.add(45);
        arr.add(55);
        arr.add(65);
        arr.add(100);
        arr.add(110);
        arr.add(300000);
        arr.add(2500);
        arr.add(1000);

        int val = 50;

        String result = (Arrays.toString(arr.removeValue(val)));
        String expected = Arrays.toString(new int[] {10, 25, 45, 55, 65, 100, 110, 300000, 2500, 1000});

        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void removeValueLast() {

        ArrayList arr = new ArrayList();
        arr.add(120);
        arr.add(150);

        int val = 1500;

        String result = (Arrays.toString(arr.removeValue(val)));
        String expected = Arrays.toString(new int[] {120, 150, 0, 0, 0, 0, 0, 0, 0, 0});

        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void removeAtIndex() {
        ArrayList arr = new ArrayList();

        arr.add(10);
        arr.add(25);
        arr.add(45);
        arr.add(55);
        arr.add(65);
        arr.add(100);
        arr.add(110);
        arr.add(300000);
        arr.add(2500);
        arr.add(1000);

        String result = (Arrays.toString(arr.removeAtIndex(5)));
        String expected = Arrays.toString(new int[] {10, 25, 45, 55, 65, 110, 300000, 2500, 1000, 1000});
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void removeAtIndexFullList() {

        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);

        String result = (Arrays.toString(arr.removeAtIndex(8)));
        String expected = Arrays.toString(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 10, 10});

        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void removeAtIndex3() {

        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);

        String result = (Arrays.toString(arr.removeAtIndex(1)));
        String expected = Arrays.toString(new int[] {1, 3, 4, 5, 6, 7, 8, 9, 10, 10});

        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void emptySize() {

        ArrayList arr = new ArrayList();

        int result = arr.size();
        int expected = 0;

        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void sizeWithElement() {

        ArrayList arr = new ArrayList();
        arr.add(1);
        int result = arr.size();
        int expected = 1;

        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void sizeWith4Elements() {

        ArrayList arr = new ArrayList();
        arr.add(4);
        arr.add(20);
        arr.add(4);
        arr.add(20);
        int result = arr.size();
        int expected = 4;

        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void getAtIndex() {

        ArrayList arr = new ArrayList();
        arr.add(10);

        int result = arr.get(0);
        int expected = 10;

        assertEquals(expected, result) ;
    }

    @org.junit.jupiter.api.Test
    void getAtIndex5() {

        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(3);


        int result = arr.get(5);
        int expected = 3;

        assertEquals(expected, result) ;
    }

    @org.junit.jupiter.api.Test
    void getAtIndex7() {

        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(45);
        arr.add(3);
        arr.add(4);
        arr.add(53);
        arr.add(6);
        arr.add(7);
        arr.add(9);
        arr.add(31);

        int result = arr.get(7);
        int expected = 9;

        assertEquals(expected, result) ;
    }

}