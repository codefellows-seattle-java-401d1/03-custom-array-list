public class MyArrayList {
    private int DEFAULT_SIZE = 10;

    private int[] data;
    private int elements;

    public MyArrayList() {
        this.data = new int[DEFAULT_SIZE];
        this.elements = 0;
    }

    public void add(int value) {
        this.data[this.elements] = value;
        this.elements++;
    }

    public void add(int value, int index) {
        for (int i = this.elements; i > index; i--) {
            this.elements++;
            this.data[i] = this.data[i - 1];

            this.data[i] = value;
        }
    }

    public void removeValue(int val) {
        int i = 0;
        while (this.data[i] != val) {
            i++;
        }
        int index;
        for (int i = index; i < this.elements; i++) {
            this.data[i] = this.data[i + 1];
            this.elements--;
        }
    }

    public void removeAtIndex(int index) {
        for (int i = index; i < this.elements; i++) {
            this.data[i] = this.data[i + 1];
            this.elements--;
        }
    }

    public int size() {
            return this.elements;
        }

    public int get(int index) {
           return this.data[index];
        }


}

