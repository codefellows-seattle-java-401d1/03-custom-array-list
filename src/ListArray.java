public class ListArray {

    private int length;
    private int[] content;

    public ListArray(int length, int[] contents){
        this.length = length;
        this.content = new int[length];
        for(int i = 0; i<length-1; i++){
            this.content[i] = contents[i];
        }
//        System.out.println("Array generated with both parameters: L: " + this.length + "  C:" + this.content[0]+"\n");
    }

    public ListArray(int length){
        this.length = length;
        this.content = new int[length];
//        System.out.println("Array generated with one length parameter: L: " + this.length + "  C:" + this.content[0]+"\n");
    }

    public ListArray(){
        this.length = -1;
//        System.out.println("Contentless ListArray generated... Why?"+"\n");
    }

    public ListArray(int[] contents){

        if(contents.length==0){
            this.length = -1;
//            System.out.println("Contentless ListArray generated... Why?"+"\n");
            return;
        }
        this.length = contents.length;
        this.content = contents;
//        System.out.println("Array generated with one contents parameter: L: " + this.length + "  C:" + this.content[0]+"\n");
    }

    public int size(){
        return this.length;
    }

    public int get(int index){
        return this.content[index];
    }

    public int[] get(){
        return this.content;
    }

    public int indexOf(int index){
        if(index>this.length-1){
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
        if(this.length == -1)
        {
            int[] array = {val};
            this.content = array;
            this.length = 1;
        }
        int[] newArray = new int[this.length+1];

        int index = 0;
        while(index<this.content.length){
            newArray[index] = this.content[index];
            index++;
        }
        newArray[index] = val;
        this.content = newArray;
        this.length++;
    }

    public void add(int val, int index){
        if(index > this.length){
            System.out.println("Chosen index is out of bounds!");
            return;
        }
        if(index == this.length){
            this.add(val);
        }

        int[] newArray = new int[this.length+1];

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
        this.length++;
        this.content = newArray;
    }

    public void remove(int val){
        if(this.content == null)
        {
            System.out.println("Nothing to remove you idiot");
            return;
        }
        int[] newArray = new int[this.length-1];
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
        int[] newArray = new int[this.length-1];

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
