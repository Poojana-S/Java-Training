class SplitArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        int mid = arr.length/2;

        System.out.println("First Part:");

        for(int i=0;i<mid;i++)
            System.out.print(arr[i]+" ");

        System.out.println();

        System.out.println("Second Part:");

        for(int i=mid;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}