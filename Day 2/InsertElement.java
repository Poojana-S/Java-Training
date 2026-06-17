class InsertElement {
    public static void main(String[] args) {

        int[] arr = {1,2,4,5};

        int[] newArr = new int[5];

        int pos = 3;
        int value = 3;

        for(int i=0;i<pos-1;i++)
            newArr[i]=arr[i];

        newArr[pos-1]=value;

        for(int i=pos-1;i<arr.length;i++)
            newArr[i+1]=arr[i];

        for(int i:newArr)
            System.out.print(i+" ");
    }
}