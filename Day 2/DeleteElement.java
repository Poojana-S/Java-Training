class DeleteElement {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        int pos = 3;

        for(int i=pos-1;i<arr.length-1;i++)
            arr[i]=arr[i+1];

        for(int i=0;i<arr.length-1;i++)
            System.out.print(arr[i]+" ");
    }
}