public class MyArrayList {

    private int size;
    private int[] content;

    public MyArrayList(int size, int[] contents){
        this.size = size;
        this.content = new int[size];
        for(int i = 0; i< size -1; i++){
            this.content[i] = contents[i];
        }
//        System.out.println("Array generated with both parameters: L: " + this.size + "  C:" + this.content[0]+"\n");
    }

    public MyArrayList(int size){
        this.size = size;
        this.content = new int[size];
//        System.out.println("Array generated with one size parameter: L: " + this.size + "  C:" + this.content[0]+"\n");
    }

    public MyArrayList(){
        this.size = -1;
//        System.out.println("Contentless MyArrayList generated... Why?"+"\n");
    }

    public MyArrayList(int[] contents){

        if(contents.length==0){
            this.size = -1;
//            System.out.println("Contentless MyArrayList generated... Why?"+"\n");
            return;
        }
        this.size = contents.length;
        this.content = contents;
//        System.out.println("Array generated with one contents parameter: L: " + this.size + "  C:" + this.content[0]+"\n");
    }

    public int size(){
        return this.size;
    }

    public int get(int index){
        return this.content[index];
    }

    public int[] get(){
        return this.content;
    }

    public int indexOf(int index){
        if(index>this.size -1){
            return -1;
        }
        for(int i = 0; i<this.content.length; i++){
            if(i==index){
                return this.content[i];
            }
        }
        return -1;
    }

    public void add(int val){
        if(this.size == -1)
        {
            int[] array = {val};
            this.content = array;
            this.size = 1;
        }
        int[] newArray = new int[this.size +1];

        int index = 0;
        while(index<this.content.length){
            newArray[index] = this.content[index];
            index++;
        }
        newArray[index] = val;
        this.content = newArray;
        this.size++;
    }

    public void add(int val, int index){
        if(index > this.size){
            System.out.println("Chosen index is out of bounds!");
            return;
        }
        if(index == this.size){
            this.add(val);
        }

        int[] newArray = new int[this.size +1];

        int newIndex = 0;

        for(int contentIndex = 0; contentIndex<this.content.length; contentIndex++){
            if(newIndex==index){
                newArray[newIndex] = val;
                System.out.println(newArray[newIndex]+" INSERTION");
                newIndex++;
            }
            newArray[newIndex] = this.content[contentIndex];
            System.out.println(newArray[newIndex]);
            newIndex++;
        }
        this.size++;
        this.content = newArray;
    }

    public void remove(int val){
        if(this.content == null)
        {
            System.out.println("Nothing to remove you idiot");
            return;
        }
        int[] newArray = new int[this.size -1];
        int newIndex = 0;

        for(int i = 0; i < this.content.length; i++){
            if(newIndex == this.content.length-1){
                System.out.println("Value not found!");
                System.out.println(this.content.length);
                return;
            }
            newArray[newIndex] = this.content[i];
            if(this.content[i] == val){
                newIndex--;
            }
            newIndex++;
        }
        this.content = newArray;
    }

    public int removeAtIndex(int index){
        if(this.content == null){
            System.out.println("Nothing inside this list!");
            return -1;
        }
        if(index >= this.content.length){
            System.out.println("Index is out of bounds!");
            return -1;
        }
        int removalIndex = index;
        int returnValue = -1;
        int newIndex = 0;
        int[] newArray = new int[this.size -1];

        for(int i = 0; i< this.content.length; i++){
            newArray[newIndex] = this.content[i];
            if(i == removalIndex){
                returnValue = this.content[i];
                newIndex--;
            }
            newIndex++;
        }
        this.content = newArray;
        return returnValue;
    }

}
