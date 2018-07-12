import java.util.ArrayList;
import java.util.Arrays;

public class TryingOutMyArrayList {
    public static void main(String[] args) {

        ArrayList<String> obj = new ArrayList<String>();

//        /*This is how elements should be added to the array list*/
//        obj.add("Ajeet");
//        obj.add("Harry");
//
//        System.out.println(obj);






        MyArrayList aa = new MyArrayList();
        MyArrayList bb = new MyArrayList(8);

//        System.out.println("After instantiation using Default Size(10): --> " + aa.size());
//        System.out.println("After instantiation using Setting Size (3): --> " + bb.size());
//
//        aa.add(3);
//        aa.add(10);
//        aa.add(0);
//        aa.add(-3);

        bb.add(8);
        bb.add(19);
        bb.add(19);
        bb.add(3);




        bb.add(5, 2);
        bb.add(67, 3);
        bb.add(100, 0);

        bb.add(99);

        bb.get(3);

        bb.removeValue(19);
//        bb.add(45, 8);
//        System.out.println("After using the .add method (3): --> " + aa.size());
//        System.out.println("After using the .add method (3): --> " + bb.size());
//




//        int[] testArray = {2, 3, 4};
//        int testValue = 5;
//        howTheHeckDoesThisWork(testArray, testValue);



    }

    //add
//    public static void howTheHeckDoesThisWork (int[] oldArray, int value) {
//        int[] newArrayWithAddedValue = new int[oldArray.length + 1];
//        newArrayWithAddedValue[oldArray.length] = value;
//        System.out.println(Arrays.toString(newArrayWithAddedValue));
//    }

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
