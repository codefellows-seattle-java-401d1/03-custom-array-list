import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

public class MyArrayListTest {

    @Test
    public void add() {
        int value = 10;
        MyArrayList myTestArray = new MyArrayList();
        int[] actual = myTestArray.add(value);
        int[] expected = new int[]{10, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void addValue() {
        MyArrayList myTestArray = new MyArrayList();
        Boolean actual = myTestArray.addValue(22, 3);
        Boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void removeValue() {
        MyArrayList myTestArray = new MyArrayList();
        myTestArray.add(11);
        myTestArray.add(4);
        myTestArray.add(12);
        myTestArray.add(7);

        int[] actual = myTestArray.removeValue(12);
        int[] expected = new int[]{11, 4, 7, 7, 0, 0, 0, 0, 0, 0};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void removeAtIndex() {
        MyArrayList myTestArray = new MyArrayList();
        myTestArray.add(11);
        myTestArray.add(4);
        myTestArray.add(12);
        myTestArray.add(7);

        int[] actual = myTestArray.removeAtIndex(2);
        int[] expected = new int[]{11, 4, 7, 7, 0, 0, 0, 0, 0, 0};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));

    }

    @Test
    public void size() {
        MyArrayList myTestArray = new MyArrayList();
        int actual = 10;
        int expected = myTestArray.size();

        assertEquals(expected,actual);
    }


    @Test
    public void get() {
        MyArrayList myTestArray = new MyArrayList();

        myTestArray.add(11);
        myTestArray.add(4);
        myTestArray.add(6);

        int actual  = myTestArray.get(2);
        int expected = 6;

        assertEquals(expected,actual);
    }
}