import java.util.Arrays;

public class TryingOutMyArrayList {
    public static void main(String[] args) {
        MyArrayList aa = new MyArrayList();
        MyArrayList bb = new MyArrayList(3);

        System.out.println(aa.size());
        System.out.println(bb.size());

        aa.add(3);
        System.out.println(aa.size());


    }

//    public static void theArray (int[] array) {
//        MyArrayList myNumbers = new MyArrayList();
//
//        for (int i = 0; i < array.length; i++){
////            myNumbers[i] = array[i];
//
//            System.out.println(myNumbers.size());
//        }
//    }



}
