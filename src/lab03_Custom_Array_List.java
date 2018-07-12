public class Lab_03 {
    public static void main(String[] args) {
    }


    public class MyArrayList {
        private int DEFAULT_SIZE = 30;

        private int[] data;
        private int elements;

        public UserArray() {
            this.data = new int[DEFAULT_SIZE];
            this.elements = 0;
        }

        // adds a value to the end of the list
        public void add(int value) {
            this.data[this.elements] = value;
            this.elements++;
        }

        // adds a value at an index
        public void add(int value, int index){
            this.elements++;

            for (int i=this.elements; i > index; i--)
            {
                this.data[i]=this.data[i-1];
            }
            this.data[index]=value;
        }

        // Removes the first occurance of a value

        //  Per my question in class yesterday, I'm assuming everything is sunshine,
        // and the user is inputting a value that's actually in the array.
        public  void removeValue(int val){

            int i=0;
            while (this.data[i]!= val) {
                i++;
            }
            removeAtIndex(i);
        }

        public void removeAtIndex(int index){
            for (int i=index; i < this.elements, i+=){
                this.data[i]=this.data[i+1];
            }
            this.elements--;
        }

        public int size(){
            return this.elements;
        }

        public int get(int index){
            return this.data[index];
        }
    }
}
