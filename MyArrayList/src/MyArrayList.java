public class MyArrayList {
    private int DEFAULT_SIZE = 10;
    private int[] size;
    private int elements;


    public MyArrayList() {
        this.size = new int[DEFAULT_SIZE];
        this.elements = 0;
    }

    public MyArrayList(int initialArraySize) {
        this.size = new int[initialArraySize];
        this.elements = 0;
    }

    public void add(int val) {
        this.size[this.elements] = val;
        this.elements++;
    }

    public void add(int val, int index) {
        int[] newArr = new int[this.size.length];
        for (int i = 0; i < index; i ++) {
            newArr[i] = this.size[i];
        }
        newArr[index] = val;
        for(int i = index + 1; i < this.size.length; i++) {
            newArr[i] = this.size[i - 1];
        }
        this.size = newArr;

    }

    public void removeValue(int val) {
        for (int i = 0; i < this.elements; i++) {
            if (this.size[i] != val) {
                i++;
            } else {
                removeAtIndex(i);
            }
        }
    }

    public void removeAtIndex(int index) {
        for (int i = index; i > this.elements; i--) {
            this.size[i] = this.size[i+1];
        }
        this.elements--;
    }

    public int size() {
        return this.elements;
    }

    public int get(int index) {
        return this.size[index];
    }
}
