
public class ArrayList {
    private int DEFAULT_SIZE = 10;

    private int[] data;
    private int elements;


    public ArrayList () {
        this.data = new int[DEFAULT_SIZE];
        this.elements = 0;
    }

    public ArrayList (int sizeValue) {
        this.data = new int[sizeValue];
        this.elements = 0;
    }

    public int[] add (int value) {
        this.data[this.elements] = value;
        this.elements++;

        return this.data;
    }

    public int[] add(int val, int index) {
        int[] newArr = new int[this.data.length];
        if (this.elements >= this.data.length) {
            newArr = new int[this.elements+1];
        }
        for (int i = 0; i < index; i ++) {
            newArr[i] = this.data[i];
        }
        newArr[index] = val;
        for(int i = index + 1; i < newArr.length; i++) {
            newArr[i] = this.data[i - 1];
        }
        this.data = newArr;
        return newArr;
    }

    public int[] removeValue(int val) {
        for (int i = 0; i < this.data.length; i++) {
            if (val == this.data[i]) {
                this.data[i] = this.data[i+1];
            }
        }
        this.elements--;
        return this.data;
    }


    public int[] removeAtIndex (int index) {
        for (int i = index; i < this.elements-1; i++) {
            this.data[i] = this.data[i+1];
        }
        if (this.elements < index) {
            System.out.println("Index does not exist");
        } else {
            this.elements--;
        }
        return this.data;
    }

    public int size () {
        return this.elements;
    }

    public int get (int index) {
        return this.data[index];
    }
}