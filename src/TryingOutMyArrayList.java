import java.util.ArrayList;
import java.util.Arrays;

public class TryingOutMyArrayList {
    public static void main(String[] args) {

        MyArrayList array = new MyArrayList();

        array.add(13);
        array.add(19);
        array.add(2);
        array.add(222);

        int[] actual = array.removeValue(6);
        System.out.println(actual);



    }
}
